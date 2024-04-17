import { Component, OnInit, inject } from '@angular/core';
import {
  FormBuilder,
  FormGroup,
  ReactiveFormsModule,
  Validators,
} from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-P002-login',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './P002-login.component.html',
  styleUrls: ['./P002-login.component.css'],
})
export class P002LoginComponent implements OnInit {
  fb = inject(FormBuilder);
  loginForm: FormGroup;
  router: Router = inject(Router);

  constructor() {
    this.loginForm = this.fb.group({
      dni: ['', Validators.required],
      password: ['', Validators.required],
    });
  }

  ngOnInit() {}

  login() {
    console.log(this.loginForm.value);
    this.router.navigate(['/citas']);
  }
}

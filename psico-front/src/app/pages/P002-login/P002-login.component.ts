import { Component, OnInit, inject } from '@angular/core';
import { CommonModule } from '@angular/common';
import {
  FormBuilder,
  FormGroup,
  ReactiveFormsModule,
  Validators,
} from '@angular/forms';
import { Router } from '@angular/router';
import { UserPsicoService } from '../../core/services/user-psico.service';
@Component({
  selector: 'app-P002-login',
  standalone: true,
  imports: [ReactiveFormsModule, CommonModule],
  templateUrl: './P002-login.component.html',
  styleUrls: ['./P002-login.component.css'],
})
export class P002LoginComponent implements OnInit {

  error: boolean = false;
  token: boolean = false;
  loading: boolean = false;
  mensaje: string = '';


  fb = inject(FormBuilder);
  loginForm: FormGroup;
  router: Router = inject(Router);

  userPsicoService = inject(UserPsicoService);

  constructor() {
    this.loginForm = this.fb.group({
      dni: ['', Validators.required],
      password: ['', Validators.required],
    });
  }


  ngOnInit() {}

  login() {
    if (this.loginForm.valid) {
      const dni = this.loginForm.value.dni;
      const password = this.loginForm.value.password;

      this.userPsicoService.getByLogin(dni).subscribe((data) => {
        if(data && data.contrasena == password){
          this.router.navigate(['/citas'], { state: { data } });
          //this.router.navigate(['/citas']);
        }
      });
    }
  }

  registro() {
    console.log(this.loginForm.value);
    this.router.navigate(['/registro']);
  }
}

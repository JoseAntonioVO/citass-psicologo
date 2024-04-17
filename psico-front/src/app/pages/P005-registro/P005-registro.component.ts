import { DatePipe, NgClass } from '@angular/common';
import { Component, OnInit, inject } from '@angular/core';
import { Router, RouterLink } from '@angular/router';
import {
  FormBuilder,
  FormGroup,
  ReactiveFormsModule,
  Validators,
} from '@angular/forms';

@Component({
  selector: 'app-P005-registro',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './P005-registro.component.html',
  styleUrls: ['./P005-registro.component.css']
})
export class P005RegistroComponent implements OnInit {

  fb = inject(FormBuilder);
  registroForm: FormGroup;
  router: Router = inject(Router);

  constructor() {
    this.registroForm = this.fb.group({
      nombre: ['', Validators.required],
      apellidos: ['', Validators.required],
      dni: ['', Validators.required],
      telefono: ['', Validators.required],
      password: ['', Validators.required],
    });
  }

  ngOnInit() {
  }

  registro() {
    console.log();
    this.router.navigate(['/mis-citas']);
  }

  
}

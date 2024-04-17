import { Component, OnInit } from '@angular/core';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-P001-bienvenida',
  standalone: true,
  imports: [RouterLink],
  templateUrl: './P001-bienvenida.component.html',
  styleUrls: ['./P001-bienvenida.component.css'],
})
export class P001BienvenidaComponent implements OnInit {
  constructor() {}

  ngOnInit() {}
}

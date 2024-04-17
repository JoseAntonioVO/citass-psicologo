import { Component, OnInit, inject } from '@angular/core';
import { UserPsicoResDTO } from '../../core/shared/models/user-psico/user-psico-res.dto';
import { UserPsicoService } from '../../core/services/user-psico.service';
import { ActivatedRoute, NavigationEnd, Router, RouterLink, RouterState } from '@angular/router';
import { DatePipe, NgClass } from '@angular/common';
import { filter } from 'rxjs';

@Component({
  selector: 'app-P003-citas',
  standalone: true,
  imports: [RouterLink, DatePipe, NgClass],
  templateUrl: './P003-citas.component.html',
  styleUrls: ['./P003-citas.component.css'],
})
export class P003CitasComponent implements OnInit {
  user: UserPsicoResDTO = {
    id: 0,
    nombre: '',
    apellidos: '',
    telefono: 0,
    dni: '',
    contrasena: '',
  };

  days: { date: Date; avaiable: boolean }[] = [
    {
      date: new Date(),
      avaiable: false,
    },
    {
      date: new Date(),
      avaiable: true,
    },
  ];

  userPsicoService = inject(UserPsicoService);
  constructor(private route: ActivatedRoute, private router: Router) {
    this.router.events.pipe(
      filter(event => event instanceof NavigationEnd)
    ).subscribe(() => {
      this.getUserFromNavigation();
    });
  }

  ngOnInit() {
    this.getDaysOfMonth(3);

    this.getUserFromNavigation();
    
    /*this.userPsicoService.getById(this.receivedData).subscribe((data) => {
      this.user = data
    });*/
  }

  private getUserFromNavigation() {
    const navigation = this.router.getCurrentNavigation();
    if (navigation && navigation.extras && navigation.extras.state) {
      this.user = navigation.extras.state['data'];
    }
  }
  

  private getDaysOfMonth(month: number) {
    // Asegurarse de que el mes es válido (1-12)
    if (month < 1 || month > 12) {
      throw new Error('Invalid month. Month must be between 1 and 12.');
    }

    // Obtener el año actual
    const year = new Date().getFullYear();

    // Crear una fecha para el primer día del mes indicado
    const startDate = new Date(year, month - 1, 1);

    // Crear una fecha para el último día del mes indicado
    const endDate = new Date(year, month, 0);

    // Limpiar el array antes de llenarlo con los nuevos días
    this.days = [];

    // Iterar desde el primer día hasta el último día del mes
    for (let day = startDate; day <= endDate; day.setDate(day.getDate() + 1)) {
      this.days.push({
        date: new Date(day), // Clonar la fecha para evitar mutaciones inesperadas
        avaiable: true, // Establecer disponibilidad, ajustar según necesidad
      });
    }
  }
}

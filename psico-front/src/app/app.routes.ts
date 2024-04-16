import { Routes } from '@angular/router';
import { ErrorComponent } from './pages/error/error.component';
import { P001BienvenidaComponent } from './pages/P001-bienvenida/P001-bienvenida.component';
import { P002LoginComponent } from './pages/P002-login/P002-login.component';
import { P003CitasComponent } from './pages/P003-citas/P003-citas.component';
import { P004MisCitasComponent } from './pages/P004-mis-citas/P004-mis-citas.component';

export const routes: Routes = [
  {
    path: '',
    pathMatch: 'full',
    redirectTo: 'home',
  },
  {
    path: 'home',
    loadComponent: () =>
      import('./pages/P001-bienvenida/P001-bienvenida.component').then(
        (m) => m.P001BienvenidaComponent
      ),
  },
  {
    path: 'login',
    loadComponent: () =>
      import('./pages/P002-login/P002-login.component').then(
        (m) => m.P002LoginComponent
      ),
  },
  {
    path: 'citas',
    loadComponent: () =>
      import('./pages/P003-citas/P003-citas.component').then(
        (m) => m.P003CitasComponent
      ),
  },
  {
    path: 'mis-citas',
    loadComponent: () =>
      import('./pages/P004-mis-citas/P004-mis-citas.component').then(
        (m) => m.P004MisCitasComponent
      ),
  },
  {
    path: '**',
    loadComponent: () =>
      import('./pages/error/error.component').then((m) => m.ErrorComponent),
  },
];

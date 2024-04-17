import { Component, OnInit } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { UserPsicoService } from './core/services/user-psico.service';
import { HeaderComponent } from './core/layout/header/header.component';
import { FooterComponent } from './core/layout/footer/footer.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, HeaderComponent, FooterComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
})
export class AppComponent implements OnInit {
  title = 'psico-front';
  constructor(private userPsico: UserPsicoService) {}
  ngOnInit(): void {
    this.userPsico.getById(1).subscribe((data) => {
      console.log(data);
    });
  }
}

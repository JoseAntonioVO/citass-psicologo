import { HttpClient } from '@angular/common/http';
import { Injectable, inject } from '@angular/core';
import { environment } from '../../../environments/environment.development';
import { UserPsicoResDTO } from '../shared/models/user-psico/user-psico-res.dto';
import { CitaResDTO } from '../shared/models/cita/cita-res.dto';
import { SaveCitaReqDTO } from '../shared/models/cita/save-cita-req.dto';

@Injectable({
  providedIn: 'root',
})
export class CitasService {
  private apiUrl = environment.backUrl + '/userPsico';
  http = inject(HttpClient);

  constructor() {}
  // constructor(private http: HttpService) {}

  getAll() {
    return this.http.get<CitaResDTO[]>(`${this.apiUrl}/getAll`);
  }

  getById(id: number) {
    return this.http.get<CitaResDTO>(`${this.apiUrl}/getById/${id}`);
  }

  create(dto: SaveCitaReqDTO) {
    return this.http.post<CitaResDTO>(`${this.apiUrl}/create`, dto);
  }

  update(id: number, dto: SaveCitaReqDTO) {
    return this.http.put<CitaResDTO>(`${this.apiUrl}/update/${id}`, dto);
  }

  delete(id: number) {
    return this.http.delete(`${this.apiUrl}/delete/${id}`);
  }
}

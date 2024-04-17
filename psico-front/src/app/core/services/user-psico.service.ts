import { Injectable, inject } from '@angular/core';
import { environment } from '../../../environments/environment.development';
import { HttpClient } from '@angular/common/http';
import {
  UserPsicoResDTO as CitaResDTO,
  UserPsicoResDTO,
} from '../shared/models/user-psico/user-psico-res.dto';
import {
  SaveUserPsicoReqDTO as SaveCitaReqDTO,
  SaveUserPsicoReqDTO,
} from '../shared/models/user-psico/save-user-psico-req.dto';

@Injectable({
  providedIn: 'root',
})
export class UserPsicoService {
  private apiUrl = environment.backUrl + '/userPsico';
  http = inject(HttpClient);

  constructor() {}
  //constructor(private http: HttpService) {}

  getAll() {
    return this.http.get<UserPsicoResDTO[]>(`${this.apiUrl}/getAll`);
  }

  getById(id: number) {
    console.log(`${this.apiUrl}/getById/${id}`);
    return this.http.get<UserPsicoResDTO>(`${this.apiUrl}/getById/${id}`);
  }

  create(dto: SaveUserPsicoReqDTO) {
    return this.http.post<UserPsicoResDTO>(`${this.apiUrl}/create`, dto);
  }

  update(id: number, dto: SaveUserPsicoReqDTO) {
    return this.http.put<UserPsicoResDTO>(`${this.apiUrl}/update/${id}`, dto);
  }

  delete(id: number) {
    return this.http.delete(`${this.apiUrl}/delete/${id}`);
  }
}

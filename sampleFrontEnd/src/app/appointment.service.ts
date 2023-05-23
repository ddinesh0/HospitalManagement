import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Patient } from './patient';
import { Observable } from 'rxjs';
import { Appointment } from './appointment';

@Injectable({
  providedIn: 'root'
})
export class AppointmentService {


  public baseUrl = 'http://localhost:8080/api/appointment';
  public baseUrl1='http://localhost:8080/api/appointment/appointment';

  constructor(private http:HttpClient) { }

createapp(appointment:Appointment,appointid:number,id:number):Observable<object>{

    return this.http.post(`${this.baseUrl}/${appointid}/${id}`,appointment);

}

  getbypatientid(id: number):Observable<Patient>{
    return this.http.get<Patient>(`${this.baseUrl}/${id}`);
  }

  getview():Observable<Appointment[]>{
    return this.http.get<Appointment[]>(`${this.baseUrl1}`);
  }

}

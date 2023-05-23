import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { WelcomeComponent } from './welcome/welcome.component';
import { SignupComponent } from './signup/signup.component';
import { SigninComponent } from './signin/signin.component';
import { AdminComponent } from './admin/admin.component';
import { DoctorComponent } from './doctor/doctor.component';
import { PatientComponent } from './patient/patient.component';
import { DoctordetailsComponent } from './doctordetails/doctordetails.component';
import { MyspaceComponent } from './myspace/myspace.component';
import { DoctorupdateComponent } from './doctorupdate/doctorupdate.component';
import { AdminupdateComponent } from './admin/adminupdate/adminupdate.component';
import { DoctordashboardComponent } from './doctor/doctordashboard/doctordashboard.component';
import { AppointmentComponent } from './appointment/appointment.component';
import { PatientviewComponent } from './patient/patientview/patientview.component';
import { PatientupdateComponent } from './patient/patientupdate/patientupdate.component';
import { DoctorspaceComponent } from './doctorspace/doctorspace.component';
import { UserloginComponent } from './userlogin/userlogin.component';
import { AppointmentlistComponent } from './appointment/appointmentlist/appointmentlist.component';
import { DoctorpathComponent } from './doctordetails/doctorpath/doctorpath.component';


const routes: Routes = [{path: '', component:WelcomeComponent},
{path: 'welcomepage', component:WelcomeComponent},
{path: 'signup', component:SignupComponent},
{path: 'signin', component:SigninComponent},
{path: 'admin',component:AdminComponent},
{path: 'doctor',component:DoctorComponent},
{path: 'doctordetails',component:DoctordetailsComponent},
{path: 'patient',component:PatientComponent},
{path: 'myspace/:id',component:MyspaceComponent},
{path: 'doctorupdate/edit/:id',component:DoctorupdateComponent},
{path: 'admin/adminupdate',component:AdminupdateComponent},
{path:'dashboard',component:DoctordashboardComponent},
{path:'appointment',component:AppointmentComponent},
{path:'patientview',component:PatientviewComponent},
{path:'patientupdate/:id',component:PatientupdateComponent},
{path:'doctorspace/:id',component:DoctorspaceComponent},
{path:'userlogin',component:UserloginComponent},
{path:'appointment/:id',component:AppointmentComponent},
{path:'appointmentlist',component:AppointmentlistComponent},
{path:'doctorpath',component:DoctorpathComponent}

]
@NgModule({
  imports: [RouterModule.forRoot(routes)],





exports: [RouterModule]
})
export class AppRoutingModule { }

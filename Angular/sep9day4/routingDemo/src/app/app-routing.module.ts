import {  NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DepartmentDetailsComponent } from './department-details/department-details.component';
import { DepartmentListComponent } from './department-list/department-list.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { AuthGuard} from './auth.guard'
import { RegisterComponent } from './register/register.component';


const routes: Routes = [
  {path:'',redirectTo:'/departments' ,pathMatch:'full' },
  {path:'departments', component:DepartmentListComponent},
  {path:'departments/:id',component:DepartmentDetailsComponent},
  {path:'employees',component:EmployeeListComponent,canActivate:[AuthGuard]},
 { path : 'register', component : RegisterComponent},
  {path:'**',component:PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

export const routingComponents =[DepartmentListComponent,DepartmentDetailsComponent,EmployeeListComponent,PageNotFoundComponent];

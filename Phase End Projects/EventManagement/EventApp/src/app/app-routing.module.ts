import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { LoginComponent } from './login/login.component';
import { UserComponent } from './user/user.component';
import { HomeComponent } from "./home-password/home.component";

const routes: Routes = [
  {path:"admin",component:AdminComponent},
  {path:"employees",component:UserComponent},
  {path:"login",component:LoginComponent},
  {path:"reset",component:HomeComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
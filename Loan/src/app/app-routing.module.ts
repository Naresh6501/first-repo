import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddComponent } from './add/add.component';
import { DeleteComponent } from './delete/delete.component';
import { FindComponent } from './find/find.component';
import { ListComponent } from './list/list.component';

const routes: Routes = [
  {path:'add', component:AddComponent},
  {path:'delete', component:DeleteComponent},
  {path:'list', component:ListComponent},
  {path:'find', component:FindComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

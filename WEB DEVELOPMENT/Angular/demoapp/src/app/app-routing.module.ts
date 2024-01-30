import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegistrationComponent } from './registration/registration.component';
import { HomeComponent } from './home/home.component';
import { ProductComponent } from './productform/product.component';
import { MenuComponent } from './menu/menu.component';
import { ErrorpageComponent } from './errorpage/errorpage.component';
import { ProductsComponent } from './products/products.component';
import { ProductdetailsComponent } from './productdetails/productdetails.component';
import { AddproductsComponent } from './addproducts/addproducts.component';

const routes: Routes = [{path:"products",component:ProductsComponent},
{path:"productdetails",component:ProductdetailsComponent},
{path:"addproducts",component:AddproductsComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

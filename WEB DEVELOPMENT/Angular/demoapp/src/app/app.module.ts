import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {httpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { MainComponent } from './main/main.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MenuComponent } from './menu/menu.component';
import { HighlightDirective } from './highlight.directive';
import { RegistrationComponent } from './registration/registration.component';
import { ProductComponent } from './productform/product.component';
import { ErrorpageComponent } from './errorpage/errorpage.component';
import { ProductdetailsComponent } from './productdetails/productdetails.component';
import { ProductsComponent } from './products/products.component';
import { AddproductsComponent } from './addproducts/addproducts.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    HeaderComponent,
    MainComponent,
    MenuComponent,
    HighlightDirective,
    RegistrationComponent,
    ProductComponent,
    ErrorpageComponent,
    ProductdetailsComponent,
    ProductsComponent,
    AddproductsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    httpClientModule
  ],
  providers: [productserviceService=],
  bootstrap: [AppComponent]
})
export class AppModule { }

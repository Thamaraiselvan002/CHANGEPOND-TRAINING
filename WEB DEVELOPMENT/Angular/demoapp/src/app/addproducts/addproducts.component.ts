import { Component } from '@angular/core';
import { products } from '../models/product.model';

@Component({
  selector: 'app-addproducts',
  templateUrl: './addproducts.component.html',
  styleUrls: ['./addproducts.component.css']
})
export class AddproductsComponent {
product:products={
    pname:" ",
    pdesc:" ",
    price: 0,
    instock: false
}
saveproduct(){
  const pdata={
    pnmae:this.product.pname,
    pdesc:this.product.pdesc,
    price:this.product.price,
    instock:this.product.instock
  }
}
}

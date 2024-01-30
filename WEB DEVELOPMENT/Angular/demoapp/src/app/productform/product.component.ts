import { Component } from '@angular/core';
import { FormGroup, FormControl, Validators, MaxLengthValidator } from '@angular/forms'; // Correct import statement

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent {
  title = "product details"; // Correct variable name

  dolak = new FormGroup({
    P_name: new FormControl('', [Validators.required,Validators.minLength(6),Validators.maxLength(10)]),
    p_id: new FormControl(Number, [Validators.required,Validators.min(2),Validators.max(5)]), 
    description: new FormControl(),
    price: new FormControl(Number, [Validators.required,Validators.min(1),Validators.max(1000)]), 
    quantity: new FormControl(null, Validators.required), 
    availability: new FormControl(),
    file: new FormControl()
  });

  addproduct() {
    console.log(this.dolak.value);
  }
}

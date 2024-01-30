import { Component } from '@angular/core';
import{FormGroup, FormControl, Validators} from '@angular/forms';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent {

  // rform: object={}
  title="Registration Form"

    rform=new FormGroup({
      fname:new FormControl('',[Validators.required,Validators.minLength(6),Validators.maxLength(20)]),
      lname:new FormControl('',[Validators.maxLength(20),Validators.pattern("^[a-zA-Z]+$")]),                          
      email:new FormControl('',Validators.email),
      gender:new FormControl('',Validators.required),
      isMarried:new FormControl('',Validators.required),
      address:new FormGroup({
        city:new FormControl(),
        street: new FormControl(),
        pincode: new FormControl(),
        country: new FormControl()
      })
      
    })

    submitReg(){
      console.log(this.rform.value)
    }
    constructor(){}
  }



import { isNgTemplate } from '@angular/compiler';
import { Component } from '@angular/core';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent {
  bmenu:string[] = ["Idli","Dosa","Poori","Chole"]
lmenu:string[] = ["Veg-Meals","Non-Veg Meals","Veg Biryani Combo", "Chicken Biryani Combo"]
menu:string[] = [] 
pricelistb:number[]=[30.00,49.00,500.00,60.00]
pricelistl:number[]=[60,120,250,300]
selectedMenuitem:string=""
applyclassmenu:string=""
isMenuchecked:boolean = false
pricecss:object={}


setMenu(ftype:string){
  if (ftype=="B"){
    this.menu = this.bmenu
    this.applyclassmenu="breakfast"
    this.isMenuchecked = true
  }
  else if(ftype=="L")
  {
    this.menu = this.lmenu
    this.isMenuchecked = true
    this.applyclassmenu="lunch"
  }
}
constructor(){
  this.menu = this.bmenu
  this.setprice()
}
selectmenuitem(item:string)
{
  this.selectedMenuitem=item
  console.log(item)
}
setprice(){
  this.pricecss={
    "background-color":'#87e097',
    "font-weight":'bold',
    "font-family":'Arial',
    "border":'2px solid black',
    "border-radius":'10ngpx',
  }
}

}

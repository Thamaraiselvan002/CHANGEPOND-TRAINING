import { Component } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {
  title:string="Marina Beach Resort"
  clogo:string="assets/marina.jpg"
  h:number=200
  w:number=300

  setTheme1(theme:string){
    if(theme=="S"){
      this.title="Summer Theme"
      this.clogo="assets/summer.jpg"
    }
    else if(theme=="W"){
      this.title="Winter Theme"
      this.clogo="assets/winter.jpg"
    }
  }
}

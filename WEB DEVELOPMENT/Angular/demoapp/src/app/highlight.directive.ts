import { Directive,HostListener,ElementRef, Input } from '@angular/core';

@Directive({
  selector: '[appHighlight]'
})
export class HighlightDirective {
  @Input()
  bgcolor:string=""

  @Input()
  textcolor:string=""

  constructor(private elementRef:ElementRef){}
   @HostListener('mouseenter')
   onMouseEnter()
{
     this.elementRef.nativeElement.style.fontweight='bold'
     this.elementRef.nativeElement.style.color=this.textcolor
     this.elementRef.nativeElement.style.backgroundcolor=this.bgcolor

}
@HostListener('mouseleave')
   onMouseLeave()
{
     this.elementRef.nativeElement.style.fontweight='bold'
     this.elementRef.nativeElement.style.color="white"
     this.elementRef.nativeElement.style.backgroundcolor="skyblue"

}


}
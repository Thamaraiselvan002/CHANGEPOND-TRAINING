import React, { Component } from "react";
class Myevent extends Component{

constructor(){
    super();
    this.state={
        count:0
    }
}

    greeting=()=>{
        window.alert("How are you all??")
    }
    welcome=(myname)=>{
        window.alert(`helo everyone ${myname}`)
    }
    incrementcounter=()=>{
        this.setState({count:this.state.count+1})
       // this.setState({prevstate()=>({})})
    }
    decrementcounter=()=>{
        this.setState({count:this.state.count-1})
    }

    render(){
       
       return(
        <div>
            <h2>This is my Event</h2>
            <button type="submit" onClick={this.greeting}>submit</button> &nbsp; &nbsp;
            <button type="submit" onClick={()=>this.welcome("tham")}>welcome</button>
            <h4 onMouseOver={()=> this.welcome("sara")}>hover on me to call welcome</h4>
            <p>counter value is: {this.state.count}</p>
            <button onClick={this.incrementcounter}>count++</button>&nbsp; &nbsp;
            <button onClick={this.decrementcounter}>count--</button>
        </div>
       )
    }
}
export default Myevent
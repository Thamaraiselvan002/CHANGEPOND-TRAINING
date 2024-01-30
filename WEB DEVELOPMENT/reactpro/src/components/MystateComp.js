import React, { Component } from "react";

class State extends Component{
    constructor(){
        super();
        this.state={
            empid:3645,
            empname:"thamaraiselvan"
        }
        setTimeout(() => {
            this.setState({empid:this.state.empid+1,empname:this.state.empname="partha"})
        }, 2000);
    }  
      
    render(){
        return(
            <div>
                <h1 style={{color:'red'}}>This is my state component</h1>
                <h3>My empID is : {this.state.empid}</h3>
                <h3>My name is  : {this.state.empname}</h3>
            </div>
        )
    }

} 

export default State;
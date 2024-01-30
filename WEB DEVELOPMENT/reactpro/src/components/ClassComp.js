import React, { Component } from "react";

class ClassComp extends Component{
    
    render(){
        return(
        <div>
            <h1 style={{color:'red'}}>This is my class component</h1>
            <p>my designation is : <strong>{this.props.mypost}</strong></p>
        </div>)
    }
    
}

export default ClassComp; 
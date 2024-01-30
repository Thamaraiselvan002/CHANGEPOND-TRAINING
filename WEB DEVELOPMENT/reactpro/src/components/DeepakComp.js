import React, { Component } from "react";

class DeepakComp extends Component{
    render(){
        return(
            <div >
                <h1 style={{color:'red'}}> This is my deepak component</h1>
                <h3>Name : {this.props.va1}</h3>
                <h3>DSegintion : {this.props.va2}</h3>
                <h3>Mobile no : {this.props.va3}</h3>
            </div>
        )
    }
}
export default DeepakComp;
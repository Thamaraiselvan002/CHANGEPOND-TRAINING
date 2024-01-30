import React, { Component, PureComponent } from 'react'

class MyPureComp extends PureComponent {

    render() {
        
        return (
            <div>
               { console.log("my purecomponent")}
             <h2>this is my pure components</h2>   
             <p>my name is :<strong>{this.props.name}</strong></p>
            </div>
        )
    }
}

export default MyPureComp

import React, { Component } from 'react'
import MyPureComp from './MyPureComp'
import MyReactComp from './MyReactComp'

class MyNameComp extends Component {

    constructor(props) {
        super(props)
    
        this.state = {
             name:"Thamaraiselvan",
             count:0
        }
    }
    
    increment=()=>{
        this.setState({count:this.state.count+1})
    }
    render() {
        const {name,count} =this.state;
        console.log("my name component render")
        return (
            <div>
                <h2>my name is : {name}</h2>
                <h2>the count value is : <strong>{count}</strong></h2>
                <button type="submit" className='btn btn-primary' onClick={this.increment} >count value</button>
                <hr/>
                <MyPureComp name={name} ></MyPureComp>
                <MyReactComp name={name}></MyReactComp>
            </div>
        )

    }
}

export default MyNameComp

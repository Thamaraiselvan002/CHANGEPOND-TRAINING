import React, { Component } from 'react'
import { Connect } from 'react-redux'
import { Buy_cake } from './Redux'

class CakeContainer extends Component {
    render() {
        return (
            <div>
                <h2>this is my cake container</h2>
                <p>available cake: {this.props.numberofcakes}</p>
                <button type="button" ></button>
            </div>
        )
    }
}

const mapStateToProps=(state)=>{
        return{
            numberofcakes:state.numberofcakes
        }
}

const mapDispatchToPrpos=(dispatch)=>{
    return{
       buy_cake:()=>{dispatch(BUY_CAKE)}
    }
}


export default  Connect(mapStateToProps,mapDispatchToPrpos)( CakeContainer)

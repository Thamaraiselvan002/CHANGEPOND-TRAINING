import React, { Component } from 'react'

class ClickCounter extends Component {
    constructor(props) {
        super(props)
    
        this.state = {
             count:0
        }
    }
    
    increment=()=>{
        this.setState({count:this.state.count+1})
    }
    render() {
        return (
            <div>
                <p>count is {this.state.count}</p>
                <button className='btn btn-success' onClick={this.increment}>count++</button>
            </div>
        )
    }
}

export default ClickCounter

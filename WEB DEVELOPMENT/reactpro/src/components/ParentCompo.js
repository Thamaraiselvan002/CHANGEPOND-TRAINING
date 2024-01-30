import React, { Component } from 'react'
import ChildComp from './ChildComp';
import { Outlet } from 'react-router-dom';

class ParentCompo extends Component {
    
    constructor(props) {
        super(props);
    
        this.state = {
             count:0,
             company:'changepond'
        }
    }
    increment=()=>{
        this.setState({count:this.state.count+1})
    }
    render() {
        const {count,company}=this.state;
        return (
            <div>
                <p>count num is {this.state.count}</p>
                <button type='submit' className='btn btn-outline-success' onClick={this.increment}>count++</button>
                <hr/>
                <ChildComp count={count} company={company}></ChildComp>
                <Outlet/> 
            </div>
            
        )
    }
}

export default ParentCompo;

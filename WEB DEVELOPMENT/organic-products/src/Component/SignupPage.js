import React, { Component } from 'react'
import 'bootstrap/dist/css/bootstrap.min.css';
//import "./SignupPage.css";
import { Button } from 'bootstrap';

export class SignupPage extends Component {
    
    render() {
  
        return (
            <div className=' '>
                <div className='header'>
                <h1>create a account</h1>
                </div>
                <div className='body'>
                <div className="container  ">
                <form>
                    <div className='header'> Name</div>
                    <div >
                        <input type='text'  className='input' placeholder='enter yourname'/>
                        </div>
                        <div className='header'> E-Mail</div>
                    <div >
                        <input type='email' className='input' placeholder='enter your email'/>
                        </div>
                        <div className='header'> Mobile Number</div>
                    <div>
                        <input type='number'  className='input' placeholder='enter your number'/>
                        </div> <br/>
                        <div className='forgot-password'> lost password? <span>click here!!</span>
                        </div><br/>
                </form>
                </div>
                </div>
                <div className='footer'>
                <div > 
                            <button type='submit' className='btn btn-primary submit' >signup</button> &nbsp;&nbsp;
                            <button type='submit' className='btn btn-primary login'>login</button>
                        </div>
                </div>
            </div>
        )
    }
}

export default SignupPage

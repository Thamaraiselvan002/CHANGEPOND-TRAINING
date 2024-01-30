import React, { Component } from 'react'

class CondRenComp extends Component {
    constructor(props) {
        super(props)
    
        this.state = {
             islogin:true
        }
    }
    
    render() {
        const islogin=this.state;
        let msg=""
//if else:
       /* if(islogin){
                    return<h2>admin succesfully</h2>
        }
        else{
            return<h2>user login successfully</h2>
        }  */

    //element variable
       /* if(islogin){
            msg="admin successfully"
        }
        else{
            msg="user login successfully"
        }
        return(msg)*/

    //use of ternary operator
        /* return(islogin)?<h2>admin login successfully</h2>:<h2>user succesfully</h2> */

    //use short circuit
         return(!islogin)&&<h2>admin login successfully</h2>
    }
}

export default CondRenComp

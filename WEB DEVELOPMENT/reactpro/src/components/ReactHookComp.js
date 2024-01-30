import React from 'react'
import { Link, Outlet } from 'react-router-dom'

const ReactHookComp = () => {
    return (
        <div >
            <h1>This is the react hook component</h1>
                    <Link to='usestate' className='btn btn-danger'>usestate</Link> &nbsp;&nbsp;
                    <Link to='useeffect' className='btn btn-success '>useeffect</Link>
                <Outlet/>
                </div>
            

    )
}

export default ReactHookComp

import React from 'react'
import { Link, NavLink } from 'react-router-dom'
const NavComp = () => {
    return (
        <div>
            <Link to="imagescomp" className='btn btn-primary'>my images</Link> &nbsp;&nbsp;
            <Link to="ClassComp" className='btn btn-primary'>Class comp</Link> &nbsp;&nbsp;
            <Link to="mynamecomp" className='btn btn-primary'>name comp</Link> &nbsp;&nbsp;
            <Link to="ChildComp" className='btn btn-primary'>child comp</Link> &nbsp;&nbsp;
            <Link to="reacthook" className='btn btn-primary'>Reacthook</Link> &nbsp;&nbsp;
            <Link to="dashboard" className='btn btn-primary'>dashboard</Link> &nbsp;&nbsp;
            <Link to="cakeconaiter" className='btn btn-primary'>cake</Link> &nbsp;&nbsp;

            </div>
    )
}

export default NavComp

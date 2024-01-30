import React, { Component } from 'react'
import '../Component/ErrorPage.css'
import { Link } from 'react-router-dom'

class ErrorPage extends Component {
    render() {
        return (
            <div>
                <section class="page_404">
        <div class="container">
        <div class="row"> 
        <div class="col-sm-12 ">
        <div class="background">
        <h1 class="text-center">404</h1>
        </div>
    
        <div class="box">
        <h3 class="h2">Look like you're lost</h3>
        <p>the page is not avaible!</p> 
        {/* <Link to="dashboard" className='btn btn-outline-success text-dark'>Click below to home page</Link> */}
        <button type='home' className='btn btn-outline-success text-dark'>Click below to home page</button>
        </div>
    </div>
    </div>
    </div>
</section>
            </div>
        )
    }
}

export default ErrorPage

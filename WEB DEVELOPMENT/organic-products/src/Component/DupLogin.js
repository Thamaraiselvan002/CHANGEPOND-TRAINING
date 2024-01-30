import React from 'react'
import '../Component/Register.css'

const DupLogin = () => {
    return (
        <div>
            <div className="row">
            <div className="col-sm-4"></div>
            <div className="col-sm-4" style={{ marginTop: '100px' }}>
                <form  className="container">
                    <div className="card">
                        <div className="card-header">
                            <h2>User Login</h2>
                        </div>
                        <div className="card-body">
                            <div className="form-group">
                                <label>User Name <span className="errmsg">*</span></label>
                                <input value="username"  className="form-control"></input>
                            </div>
                            <div className="form-group">
                                <label>Password <span className="errmsg">*</span></label>
                                <input type="password" value="password" className="form-control"></input>
                            </div>
                        </div>
                        <div className="card-footer" style={{ display: 'flex', justifyContent: 'center' }}>
                            <button type="submit" className="btn btn-warning col-5 ">Login</button> &nbsp;
                            {/* <Link className="btn btn-success" to={'/register'}>New User</Link> */}
                        </div>
                    </div>
                </form>
            </div>
            <div className="col-sm-4"></div>
        </div>
        </div>
    )
}

export default DupLogin

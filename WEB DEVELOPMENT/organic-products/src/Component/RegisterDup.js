import React from 'react'
import '../Component/Register.css'

const RegisterDup = () => {
    return (
        <div>
            <div className="offset-lg-3 col-lg-6  my-5">
                <form className="container" >
                    <div className="card border-0">
                        <div className="card-header">
                            <h2>User Registeration</h2>
                        </div>
                        <div className="card-body">

                            <div className="row">
                                <div className="col-lg-6">
                                    <div className="form-group">
                                        <label>User Name <span className="errmsg">*</span></label>
                                        <input value="id" className="form-control"></input>
                                    </div>
                                </div>
                                <div className="col-lg-6">
                                    <div className="form-group">
                                        <label>Password <span className="errmsg">*</span></label>
                                        <input value="password" type="password" className="form-control"></input>
                                    </div>
                                </div>
                                <div className="col-lg-6">
                                    <div className="form-group">
                                        <label>Full Name <span className="errmsg">*</span></label>
                                        <input value="name"  className="form-control"></input>
                                    </div>
                                </div>
                                <div className="col-lg-6">
                                    <div className="form-group">
                                        <label>Email <span className="errmsg">*</span></label>
                                        <input value="email" className="form-control"></input>
                                    </div>
                                </div>
                                <div className="col-lg-6">
                                    <div className="form-group">
                                        <label>Phone <span className="errmsg"></span></label>
                                        <input  className="form-control"></input>
                                    </div>
                                </div>
                                <div className="col-lg-6">
                                    <div className="form-group">
                                        <label>Country <span className="errmsg">*</span></label>
                                        <select value="country"  className="form-control">
                                            <option value="india">India</option>
                                            <option value="usa">USA</option>
                                            <option value="singapore">Singapore</option>
                                        </select>
                                    </div>
                                </div>
                                <div className="col-lg-12">
                                    <div className="form-group">
                                        <label>Address</label>
                                        <textarea value="address"  className="form-control"></textarea>
                                    </div>
                                </div>
                                <div className="col-lg-6">
                                    <div className="form-group">
                                        <label>Gender</label> &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp;
                                        <input type="radio"  name="gender" value="male" className="app-check"></input>&nbsp;
                                        <label>Male</label> &nbsp; &nbsp;&nbsp; &nbsp;
                                        <input type="radio"   name="gender" value="female" className="app-check"></input>&nbsp;
                                        <label>Female</label>
                                    </div>
                                </div>

                            </div>

                        </div>
                        <div className="card-footer"  style={{ display: 'flex', justifyContent: 'center' }}>
                            <button type="submit" className="btn btn-warning col-5  " >Register </button> &nbsp;
                            {/* <Link to={'/login'} className="btn btn-danger">Close</Link> */}
                        </div>
                    </div>
                </form>
            </div>
        </div>
    )
}

export default RegisterDup


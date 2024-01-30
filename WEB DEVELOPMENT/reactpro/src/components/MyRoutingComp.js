import React, { Component } from 'react'
import { BrowserRouter,Routes,Route } from 'react-router-dom'
import ClassComp from './ClassComp'
import ChildComp from './ChildComp'
import MyimagesComp from './MyimagesComp'
import MyNameComp from './MyNameComp'
import DeepakComp from './DeepakComp'
import ClickCounter from './ClickCounter'
import CondRenComp from './CondRenComp'
import ParentCompo from './ParentCompo'
import ErrorPageComp from './ErrorPageComp'
import NavComp from './NavComp'
import ReactHookComp from './ReactHookComp'
import UseStateHookComp from './UseStateHookComp'
import UseEffectComp from './UseEffectComp'
import Dashboard from '../CRUD/Dashboard'
import { Provider } from 'react-redux'
import store from './Redux/Store'
import CakeContainer from './CakeContainer'

class MyRoutingComp extends Component {
    render() {
        return (
        <div>
                <h1 className='text-white bg-primary '>!!!Welcome to the react!!!</h1> <br/>
        <BrowserRouter>
        <Provider store={store}>
        <div className="container">
            <div className='card border-dark'>
                <div className='card-header border-dark'>
                   <NavComp/>
                </div>
                <div className='card-body'>
                    <Routes>
                {/* /*default routing*/ }
                    <Route path= 'imagescomp' element ={<MyimagesComp/>}></Route>
                    
                {/* name routing */}
                    <Route path='ClassComp' element= {<ClassComp/>}>  </Route>
                    <Route path='ChildComp' element= {<ChildComp/>}>  </Route>
                    <Route path='mynamecomp' element= {<MyNameComp/>}>  </Route>

                {/* parametrised routing  ==> instead of id you can type anything*/}
                    <Route path='mystate/:id' element= {<DeepakComp/>}>  </Route>
                    <Route path='click/:id' element= {<ClickCounter/>}>  </Route>

                {/* child routing */}
                    <Route path='event' element= {<ParentCompo/>}> 
                    <Route path='mycss' element= {<MyimagesComp/>}></Route>
                    </Route>

                {/* wildcart routing ==> it will type dirty characters */}
                    <Route path='*' element= {<ErrorPageComp/>}> </Route>



                <Route path="reacthook" element={<ReactHookComp/>}> 
                <Route path="useeffect" element={<UseEffectComp/>}></Route>
                <Route path="usestate" element={<UseStateHookComp/>}></Route>
                </Route>

                <Route path="dashboard" element={<Dashboard/>}></Route>
                    </Routes>

                    <Route path="" element={CakeContainer}> </Route>
                </div>

                <div className='card-footer'>
                    <h3>Developed by Thamaraiselvan</h3>
                </div>
            </div>
            </div>
            </Provider>
        </BrowserRouter>
        
        </div>
        )
    }
}

export default MyRoutingComp

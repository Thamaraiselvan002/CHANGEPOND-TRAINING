import logo from './logo.svg';
import './App.css';
import FunctionComp from './components/FunctionComp';
import ClassComp from './components/ClassComp';
import DeepakComp from './components/DeepakComp';
import MystateComp from './components/MystateComp';
import Myevent from './components/MyeventComp';
import MyimagesComp from './components/MyimagesComp';
import MycssComp from './components/MycssComp';
import ParentCompo from './components/ParentCompo';
import ClickCounter from './components/ClickCounter';
import CondRenComp from './components/CondRenComp';
import MyNameComp from './components/MyNameComp';
import MyRoutingComp from './components/MyRoutingComp';
import ErrorPageComp from './components/ErrorPageComp';
import ReactHookComp from './components/ReactHookComp';
import { Provider } from 'react-redux';
import store from './Redux/Store'


function App() {
  return (
    <div className="App">
      {/* <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header> */}
  {/* <h1 className='text-primary bg-info'>welcome to all</h1> */}
    {/* <FunctionComp myname="thamaraiselvan"/>
    <ClassComp mypost="fullstackdeveloper"/><br/>
    <DeepakComp va1="Thamaraiselvan" va2="software engineer" va3="7878697677" />
    <MystateComp/> 
     <Myevent/>  
    <MyimagesComp/>
    {/* <MycssComp/> 
    <ParentCompo/>
    <ClickCounter/>
    <HovercounterComp/> 
    <CondRenComp/>
    <MyNameComp/>*/}
    <MyRoutingComp/>
  
    </div>
  );
}

export default App;

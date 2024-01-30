import logo from './logo.svg';
// import './App.css';
import SignupPage from './Component/SignupPage';
import ServiceComp from './Component/ServiceComp';
import Footer from './Component/FooterPage'
import Reviews from './Component/Reviews'
import ErrorPage from './Component/ErrorPage';
import  AddtoCart from './Component/AddtoCart';
import CartSlider from './Component/CartSlider';
import Login from './Component/Login';
import Register from './Component/Register';
import DupLogin from './Component/DupLogin';
import RegisterDup from './Component/RegisterDup';
import AboutUs from './Component/AboutUs';
import ContactForm from './Component/ContactForm';



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
  {/* <SignupPage/> */}
  {/* <ServiceComp/> */}
  {/* <Footer/> */}
  {/* <Reviews/> */}
  {/* <ErrorPage/> */}
  <AddtoCart/>
  {/* <CartSlider/> */}
  {/* <ClientSlider/>
  <Clients/> */}
  {/* <CardCarousel/> */}
  {/* <DupLogin/>
  <RegisterDup/> */}
  {/* <AboutUs/> */}
  {/* <ContactForm/> */}
    </div>
  );
}

export default App;

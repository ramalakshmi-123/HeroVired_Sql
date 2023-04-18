import React from 'react'
import {Routes, Route ,Navigate} from 'react-router-dom';
import DetailsFillingPage from './Components/DetailsFillComponents/DetailsFillingPage';
import ResumeTemplates from './Components/Home'
import NavBar from './Components/Navbar'
import Login from './Components/Login';
import Contact from './Components/Contact';
import MyResume from './Components/DetailsFillComponents/MyResume';
import AboutUs from './Components/AboutUs';
import './App.css';

// This component defines routing for other components //
function App() {
  return (
    <div>
        <div> 
          <NavBar/>
        </div>
        
        <div>
            <Routes>
                  <Route path="/login" element={<Login/>}></Route>
                  <Route exact path="/" element={<ResumeTemplates/>}></Route>
                  <Route path="/myresumes" element={<MyResume/>}></Route>
                  <Route exact path="/about" element={<AboutUs/>}></Route>
                  <Route path="/detailsfillingpage/*" element ={<DetailsFillingPage />}></Route> 
                  <Route path="*" element={<Navigate to="/" />}></Route>
                  <Route path="/contact" element={<Contact/>}></Route>
            </Routes> 
        </div>
    </div>
  )
}


export default App

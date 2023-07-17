import React, { useState, useEffect } from 'react';
import './App.css';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Hour from './Hour/Hour'
import Greeting from './Greeting/Greeting';

function App() {
  return (
    <Router>
      <Routes>
        <Route path='/user/:userName' element={<Hour/>} />
        <Route path='/user/saludo' element={<Greeting/>} />
      </Routes>
    </Router>
  );
}

export default App;

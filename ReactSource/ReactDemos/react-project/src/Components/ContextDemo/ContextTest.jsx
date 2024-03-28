import React, { useContext } from 'react'
import UserContext from '../../context/UserContext';

function ContextTest() {

  const {user, serUser} = useContext(UserContext);
  
  return (
    <div>
      <h1>Context check: {user}</h1>
    </div>
  )
}

export default ContextTest

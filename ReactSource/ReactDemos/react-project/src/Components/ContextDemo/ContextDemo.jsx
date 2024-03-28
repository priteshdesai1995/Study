import React from 'react'
import UserContextProvider from '../../context/UserContextProvider'
import ContextTest from './ContextTest'

function ContextDemo() {
  return (
    <div>
      <UserContextProvider>
        <ContextTest/>
     </UserContextProvider>
    </div>
  )
}

export default ContextDemo

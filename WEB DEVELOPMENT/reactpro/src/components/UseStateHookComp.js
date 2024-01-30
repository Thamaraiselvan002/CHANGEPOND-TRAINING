import React, { useState } from 'react'

const UseStateHookComp = () => {
    const[count,setCount]=useState(0);
    const[myname,setName]=useState("tham")
    const[fruits,setFruits]=useState(["apple","orange","mango"])
    const counteric=()=>{
        setCount(count+1)
    }
    return (
        <div>
            <h2>this is the usestate hook component</h2>
            <p>counter is  : {count}</p>
            <button type="submit" onClick={()=>setCount(count+1)}> count</button>
            <hr/>
            <ul>
                {
                    fruits.map((val,index)=>{
                        return<li> {val}</li>
                    })
                }
            </ul>
        </div>
    )
}

export default UseStateHookComp

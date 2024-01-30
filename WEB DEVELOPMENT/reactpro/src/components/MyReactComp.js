import React from 'react'

const MyReactComp = (props) => {
    return (
        <div>
            {console.log("my react memo render")}
            <h2>this is my pure components</h2> 
            <p>my name is :<strong>{props.name}</strong></p>
        </div>
    )
}

export default React.memo(MyReactComp)

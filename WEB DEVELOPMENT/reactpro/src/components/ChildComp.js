import React from 'react'

const ChildComp = ({count,company}) => {
    return (
        <div>
            <h2>This is the child component</h2>
            <p>count value is : <strongh>{count}</strongh></p>
            <p>company name is : <strong>{company}</strong></p>
        </div>
    )
}

export default ChildComp;
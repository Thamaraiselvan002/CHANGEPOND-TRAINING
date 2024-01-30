
import React from 'react'
class HovercounterComp extends Component {
    constructor(props) {
        super(props)
    
        this.state = {
             count:0
        }
    }
increment1=()=>{
    this.setState({count:this.state.count+1})
}
render(){
    return (
        <div>
            <p>counter is {this.state.count}</p>
            <h2 onMouseOver={increment1}>This is the child component</h2>
        </div>
    )
}
}

export default HovercounterComp

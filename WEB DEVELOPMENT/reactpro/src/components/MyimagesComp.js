
import React, { Component } from 'react'
import vijay from '../shared/images/download.jfif'
import rajini from '../shared/images/nature.png'
import earth from '../shared/images/earth video.mp4'
import surya from '../shared/images/sampleaudio.mp3'
//accessing constant file
import { multimedia } from '../shared/constant/constantdata'

class MyimagesComp extends Component {
    

    nikhil=()=>{
        window.alert("insert a images")
    }
    tham=(yourname)=>{
        window.alert(`your image is  ${yourname}`)
    }
    mouseout=()=>{
        window.alert("nice one")
    }
    
    
    render() {
        return (
            <div>
                <h1>This is my image Component</h1>
                <img src={vijay} onClick={this.nikhil}/> &nbsp; &nbsp;
                <img src={rajini} /> <br/>
                <video controls src={earth} onMouseOut={this.mouseout}></video> <br/>
                <audio controls src= {surya}></audio> <br/>
                <img src={multimedia.flower2} onMouseOver={()=>this.tham("awesom")} /> <br/> <br/> <br/>
                
            </div>
        )
    }
}

export default MyimagesComp

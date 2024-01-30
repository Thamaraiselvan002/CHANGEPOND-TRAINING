/*function FunctionComp(){
    return <h2>this is my function component</h2>
}
export default FunctionComp*/

const FunctionComp=(props)=>{
    return (<div >
        <h1 style={{color:'red'}}>This is my function component</h1>
        <p>myname is : <strong>{props.myname}</strong> </p>
    </div>)

}
export default FunctionComp
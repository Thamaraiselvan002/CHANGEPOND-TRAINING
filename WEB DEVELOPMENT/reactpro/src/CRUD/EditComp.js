import React, { useState } from 'react'


const EditComp = () => {
    const [product,setProduct]=useState([])
    
    useEffect(()=>{
        UpdateData();

    },[])

    const UpdateData=()=>{
        axios.get(`http://localhost:8888/product/${id}`).then((res)=>{
            console.log(res.data);
            setProduct(res.data);
        }).catch((err)=>{})
    }


    const Updateproduct=()=>{
        axios.get().then(()=>{
            

        }).catch((err)=>{})
    }

    return (
        <div>
            
        </div>
    )
}

export default EditComp

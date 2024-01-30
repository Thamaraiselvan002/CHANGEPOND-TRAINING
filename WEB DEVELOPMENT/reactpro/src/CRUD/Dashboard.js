import axios from 'axios'
import React, { useEffect, useState } from 'react'
import DeleteIcon from '@mui/icons-material/Delete';
import EditedIcon from '@mui/icons-material/Edit';


const Dashboard = () => {
    const [product,setProduct]=useState([])
    
    useEffect(()=>{
        fetchData();

    },[])

    const fetchData=()=>{
        axios.get("http://localhost:8888/product").then((res)=>{
            console.log(res.data);
            setProduct(res.data);
        }).catch((err)=>{})
    }


    const deleteproduct=(id)=>{
        if(window.confirm(` are you sure delete product with id :${id}` )){
            axios.delete(`http://localhost:8888/product${id}`).then(()=>{
            window.alert("product successfully deleted");
            fetchData(id.data);
            }).catch((err)=>{})
        }  
    }

    return (
        <div>
            <h1>this is the dashboard</h1>
            <table className='table table-hover '>
                <thead className='table-primary '> 
                    <tr>
                        <th>id</th>
                        <th>name</th>
                        <th>price</th>
                        <th>company</th>
                        <th>address</th>
                        <th> </th>
                    </tr>
                </thead>
                <tbody>
                   { 
                   
                    product.map((val)=>{
                        return(
                            <tr>
                                <td>{val.id}</td>
                                <td>{val.pname}</td>
                                <td>{val.price}</td>
                                <td>{val.pcompany}</td>
                                <td>{val.Paddress}</td>
                                <td>
                                    <button type='button' className='btn btn-outline-primary  '> <EditedIcon></EditedIcon> EDIT</button> &nbsp;
                                    <button type='button' className='btn btn-outline-danger 'onClick={()=>{deleteproduct(val.id)}} > DELETE <DeleteIcon></DeleteIcon> </button>
                                </td>
                            </tr>
                        )
                    })
                   
                   }
                </tbody>
                </table>       
            
        </div>
    )
}

export default Dashboard

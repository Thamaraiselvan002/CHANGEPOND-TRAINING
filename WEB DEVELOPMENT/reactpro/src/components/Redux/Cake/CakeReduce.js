import { BUY_CAKE } from "./CakeType"
const initialstate={
    numberofcakes:20
};


const CakeReducer=(state=initialstate,action)=>{
    switch(action.type){
        case BUY_CAKE:
            return{
        ...state,
        numberofcakes:state.numberofcakes-1
        }
        default: return state
    }
}

export default CakeReducer
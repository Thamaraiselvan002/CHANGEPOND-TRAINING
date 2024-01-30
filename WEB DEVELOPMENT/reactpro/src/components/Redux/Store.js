const redux=require("redux")
const cakestore=redux.createstore();

import CakeReducer from "./Cake/CakeReduce";

const store=createstore(CakeReducer);
export default store;

import React from 'react'

const ServiceComp = () => {
  return (
    <div>
    <div style={{textAlign:'center'}}>
      <label> <h3> Welcome Greencart Workspace Admin</h3></label> <br/>
      <input type='text' placeholder='Describe your issue'/>
    </div> <br/>
    <div class=" container list-group">
  <a href="#" class="list-group-item list-group-item-action active">
    Cras justo odio
  </a>
  <a href="#" class="list-group-item list-group-item-action">Dapibus ac facilisis in</a>
  <a href="#" class="list-group-item list-group-item-action">Morbi leo risus</a>
  <a href="#" class="list-group-item list-group-item-action">Porta ac consectetur ac</a>
  <a href="#" class="list-group-item list-group-item-action disabled">Vestibulum at eros</a>
</div>
    </div>
  )
}

export default ServiceComp


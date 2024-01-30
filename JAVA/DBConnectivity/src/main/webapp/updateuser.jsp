<jsp:include page="include/header.jsp" />
<h1>Update User</h1>
<form method="post" action="${pageContext.request.contextPath}/home">
	<div style="background-color:aqua; border:1px solid red; padding:5px;">
    <div style="padding:5px;"> 
			User Id : <input type="text" name="user_id" required="required"
				value="${param.user_id}" readonly />
		</div>
		<div style="padding: 5px;">
			User Name : <input type="text" name="username"
				value="${param.username}" required="required" />
		</div>
		<div style="padding: 5px;">
			User Email : <input type="email" name="email" value="${param.email}"
				required="required" />
		</div>
		<div>
			<input type="hidden" name="form" value="updateuseroperation">
			<input type="hidden" name="userid" value="${param.user_id}">
		</div>
		<div>
			<input type="submit" style="background-color: blue; color: white"
				value="Update User" />
				
		</div>
	</div>

</form>


<jsp:include page="include/footer.jsp" />

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<style> 
input[type=text] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
  border: 2px solid red;
  border-radius: 4px;
}

</style>

</head>
<body>
<div class="container">
	<div class="jumbotron jumbotron-fluid">
		<h2>Khata Book</h2>
		<p>Keeps Recode Of Your spending</p>
	</div>
</div>

<div class="container">
<form:form action="save" modelAttribute="moneymanager" method="POST">

	<form:hidden path="id" />
	
		<table>
			<tbody>
				<tr>
					<td><label>Description</label></td>
					<td><form:input path="description" /></td>
				</tr>
				
				<tr>
					<td><label>Amount</label></td>
					<td><form:input path="amount" /></td>
				</tr>
				
				
				
				<tr>
						<td><label>Add</label></td>
						<td><input type="submit" class="btn btn-success"></td>
					</tr>
				
			</tbody>
		
		</table>
	</form:form>
</div>
</body>
</html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
  
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <!--  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script> -->
 <!--   <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script> -->
</head>

<body>
<div class="container">
	<div class="jumbotron">
		<h2 >${totalspent}</h2>
		<p>Total amount Spent</p>
	</div>
</div>

<div class="container">
		<table class="table table-hover">
			
			<thead>
				<tr>
					<th>Description</th>
					<th>Amount</th>
					
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${money}" var="temp">
					<tr>
						<td>${temp.description}</td>
						<td>${temp.amount}</td>
						
						<td><a type="button" class="btn btn-success"
							href="/update?id=${temp.id}">Update</a></td>
							
						<td><a type="button" class="btn btn-warning"
							href="/delete?id=${temp.id}">Delete</a></td>
						
						
				
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
			<a class="btn btn-primary btn-lg" href="/add">Add a Todo</a>
		</div>
	</div>
	</body>
</html>
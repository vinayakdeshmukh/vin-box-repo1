<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Example 1</title>
<link href="<c:url value="/resources/vin_box.css"/>" rel="stylesheet"
	type="text/css">
</head>
<body>
	<h1>Example 1</h1>

	<P>The time on the server is ${serverTime}.</P>


	<h3>User Detail</h3>
	<form:form method="post" action="example1/addUser"
		commandName="userDetail">
		<table>
			<tr>
				<td><form:label path="userId">
						<spring:message code="label.userId" />
					</form:label></td>
				<td><form:input path="userId" /></td>
			</tr>
			<tr>
				<td><form:label path="firstName">
						<spring:message code="label.firstName" />
					</form:label></td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td><form:label path="middleName">
						<spring:message code="label.middleName" />
					</form:label></td>
				<td><form:input path="middleName" /></td>
			</tr>
			<tr>
				<td><form:label path="lastName">
						<spring:message code="label.lastName" />
					</form:label></td>
				<td><form:input path="lastName" /></td>
			</tr>

			<tr>
				<td><form:label path="passWord">
						<spring:message code="label.passWord" />
					</form:label></td>
				<td><form:input path="passWord" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit"
					value="<spring:message code="label.addUser"/>" /></td>
			</tr>
		</table>
	</form:form>



	<h3>User List</h3>
	<c:if test="${!empty userList}">
		<table class="data">
			<tr>
				<th>User Id</th>
				<th>First Name</th>
				<th>Middle Name</th>
				<th>Last Name</th>
				<th>Password</th>
				<th>&nbsp;</th>
			</tr>
			<c:forEach items="${userList}" var="user">
				<tr>
					<td>${user.userId}</td>
					<td>${user.firstName}</td>
					<td>${user.middleName}</td>
					<td>${user.lastName}</td>
					<td>${user.passWord}</td>
					<td><a href="delete/${user.userId}">delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>

</body>
</html>

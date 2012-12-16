<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Example 2</title>
<link href="<c:url value="/resources/vin_box.css"/>" rel="stylesheet"
	type="text/css">

</head>
<body>
	<h1>Example 1</h1>

	<P>The time on the server is ${serverTime}.</P>


	<h3>User Detail</h3>
	<form:form method="post" action="example2/searchUser"
		commandName="searchUserFilter">
		<table>
			<tr>
				<td><form:select path="fields[0].key">
						<form:option value="">
							<spring:message code="label.select" />
						</form:option>
						<form:option value="userId">
							<spring:message code="label.userId" />
						</form:option>
						<form:option value="firstName">
							<spring:message code="label.firstName" />
						</form:option>
					</form:select></td>

				<td><form:select path="fields[0].operator" items="${fields}" /></td>
				<td><form:input path="fields[0].value1" /></td>
			</tr>
			<tr>
				<td><form:select path="fields[1].key">
						<form:option value="userId">
							<spring:message code="label.userId" />
						</form:option>
						<form:option value="firstName">
							<spring:message code="label.firstName" />
						</form:option>
					</form:select></td>
				<td><form:select path="fields[1].operator">
						<form:option value="equalTo">
							<spring:message code="label.equalTo" />
						</form:option>
						<form:option value="lessThan">
							<spring:message code="label.lessThan" />
						</form:option>
						<form:option value="greaterThan">
							<spring:message code="label.greaterThan" />
						</form:option>
						<form:option value="like">
							<spring:message code="label.like" />
						</form:option>
						<form:option value="between">
							<spring:message code="label.between" />
						</form:option>
					</form:select></td>
				<td><form:input path="fields[1].value1" /></td>
				<td><form:input path="fields[1].value2" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit"
					value="<spring:message code="label.searchUser"/>" /></td>
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

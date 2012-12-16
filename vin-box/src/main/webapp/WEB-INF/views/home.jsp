<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Box - Home</title>
<link href="<c:url value="/resources/vin_box.css"/>" rel="stylesheet"
	type="text/css">
</head>
<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</P>

	<a href="/box/example/example1">Example 1</a>
	<br />
	<a href="/box/example/example2">Example 2</a>
</body>
</html>

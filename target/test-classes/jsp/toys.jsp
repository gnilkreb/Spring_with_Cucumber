<!doctype html>
<%@ include file="/WEB-INF/jsp/include.jsp" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Toys</title>

    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

</head>

<body>
<div id="container">
	<div id="intro">
		<div id="pageHeader">

<a href="/app/people/" class="btn">Back</a>

<b1>Toys of ${person.firstName}</b1>

<form:form method="post" action="add" commandName="toy" class="form-vertical">

    <form:label path="toyName">Toy name</form:label>
    <form:input path="toyName" />
    <input name="personId" type="hidden" value="${person.id}"/>
    <input type="submit" value="Add Person" class="btn"/>
</form:form>

<c:if  test="${!empty toyList}">
    <h3>People</h3>
    <table class="table table-bordered table-striped">
        <thead>
        <tr>
            <th>Name</th>
            <th>&nbsp;</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${toyList}" var="toy">
            <tr>
                <td>${toy.toyName}</td>
                <td><form action="delete/${toy.id}" method="post"><input type="submit" class="btn btn-danger btn-mini" value="Delete"/></form></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</c:if>
</div>
</div>
</div>
</body>
</html>

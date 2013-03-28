<!doctype html>

<%@ include file="/WEB-INF/jsp/include.jsp" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Your first Spring App</title> 

    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

</head>

<body>
<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <a href="/app/people/" class="brand">Persons</a>
            <a href="/app/people/" class="brand" id="heroku">by <strong>Toys</strong></a>
        </div>
    </div>
</div>

<div class="container">
    <img src="/resources/starangePicture_small.JPG">
</div>

<div id="container">
    <div id="Summary">
        <div class="span8 offset2">
            <div id="pageHeader">
                <h1>Simple CRUD Page</h1>
            </div>
            <form:form method="post" action="add" commandName="person" class="form-vertical">

                <form:label path="firstName">First Name goes here</form:label>
                <form:input path="firstName" />
                <form:label path="lastName">Last Name goes here </form:label>
                <form:input path="lastName" />
                <input type="submit" value="Add Person" class="btn"/>
            </form:form>


            <c:if  test="${!empty peopleList}">
                <h3>People</h3>
                <table class="table table-bordered table-striped">
                    <thead>
                    <tr>
                        <th>Name</th>
                        <th>&nbsp;</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${peopleList}" var="person">
                        <tr>
                            <td><a href="../toys/${person.id}">${person.lastName}, ${person.firstName}</a></td>
                            <td><form action="delete/${person.id}" method="post"><input type="submit" class="btn btn-danger btn-mini" value="Delete"/></form></td>
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

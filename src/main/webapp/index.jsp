<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>
    <h3>5.1 - 6.1</h3>
    <h1>Join our email list</h1>
    <p>To join our email list, enter your name and
       email address below.</p>
    <p><i>${message}</i></p>
    <form action="emailList" method="post">
        <input type="hidden" name="action" value="add">        
        <label class="pad_top">Email:</label>
        <input type="email" name="email" value="${user.email}"><br>
        <label class="pad_top">First Name:</label>
        <input type="text" name="firstName" value="${user.firstName}"><br>
        <label class="pad_top">Last Name:</label>
        <input type="text" name="lastName" value="${user.lastName}"><br>        
        <label>&nbsp;</label>
        <input type="submit" value="Join Now" class="margin_left">
    </form>
        <%@ include file="/includes/footer.jsp" %>
    <hr>
     <h3>5.2</h3>
     <h2>Post method</h2>
     <form action="test" method="post">     
        <label>&nbsp;</label>
        <input type="submit" value="Join Now" class="margin_left">
    </form>
     <h2>Get method</h2>
     <p> Enter the /test URL into the browser to run the test servlet. This should show that the test servlet works for the HTTP GET method.</p>
     <a href="/21110856/giaodien.html">Back Home</a>
</body>
</html>
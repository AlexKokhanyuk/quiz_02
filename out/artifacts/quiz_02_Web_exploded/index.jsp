<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>title</title>
     </head>
     <body>
          <form action="${pageContext.request.contextPath}/servlet" method="post">
                  <input type="text" name="name" placeholder="name"/>
                  <input type="text" name="surname" placeholder="surname" />
                  <input type="submit" />
          </form>
     </body>
</html>
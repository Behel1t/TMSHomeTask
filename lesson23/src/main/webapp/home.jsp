<%@ page import="org.example.domain.Car" %>
<%@ page import="java.util.List" %>
<%@ page import="org.example.domain.Car" %><%--
  Created by IntelliJ IDEA.
  User: Oleg
  Date: 19.09.2023
  Time: 18:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Cars list:

<form action="/add" method="post">
    Model:<input type="text" name="model"><br>
    Price $:<input type="number" name="price"><br>
    Year:<input type="date" name="year"><br>
    Brand:<input type="text" name="brand"><br>
    <input type="submit" value="Add">
</form>

<%
    Object carsSs=request.getAttribute("cars");

    if (carsSs!=null){
    List<Car> cars =(List<Car>) request.getAttribute("cars");
    for (Car car : cars){
        try {
            out.println("<form action='/delete' method='post'>");
            out.println("<li><table> "+"<tr><th>Brand: </th>"+" <tr><td>" +car.getBrand()+"</td></tr>"+
                    "<tr><th>Model: </th>"+" <tr><td>" +car.getModel()+"</td></tr>"+
                    "<tr><th>Price: </th>"+" <tr><td>" +car.getPrice()+"</td></tr>"+
                    "<tr><th>Year: </th>"+" <tr><td>" +car.getYear()+"</td></tr>");
            out.println("<th><input type='hidden' name='deleteId' value='"+ car.getId()+"'>");
            out.println("<input type='submit' value='delete'>");
            out.println("</th></tr></table></li>");
            out.println("</form>");

        }catch (Exception exc){
            request.getRequestDispatcher("/error.jsp").forward(request,response);
        }
    }

    }
%>

</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
      <title>JSTL Demo</title>
  </head>
  <body>
    <form action="/test" method="post">
      <h3>Ingresa un nombre: </h3>
      <input type="text" name="name" />
      <input type="submit" name="details" value="Enviar name" />
    </form>
  </body>
</html>

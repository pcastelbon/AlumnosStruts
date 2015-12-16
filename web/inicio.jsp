<%-- 
    Document   : inicio
    Created on : 03-sep-2015, 17:54:41
    Author     : Pedro-hp
--%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Operaciones con alumnos</title>
    </head>
    <body>
    <center>
        <br><br><br><br>
        <html:link href="buscar.jsp"><h3>Buscar alumnos en centro</h3></html:link><br>
        <html:link action="/buscar"><h3>Mostrar todos los alumnos registrados</h3></html:link><br>
        <html:link href="alta.jsp"><h3>Alta de nuevo alumno</h3></html:link>
        
    <center/>
    </body>
</html:html>

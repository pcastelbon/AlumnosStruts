<%-- 
    Document   : alta
    Created on : 03-sep-2015, 18:07:48
    Author     : Pedro-hp
--%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página de inserción de alumnos</title>
    </head>
    <body>
    
        <html:form action="/registrar" method="post">
        <center><h1>Datos del alumno</h1></center>
            <table  align="center">
                <tr>
                    <td>DNI</td><td><html:text property="ni"></html:text></td>
                </tr>
                <tr>
                    <td>Nombre</td><td><html:text property="nombre"></html:text></td>
                </tr>
                <tr>
                    <td>Edad</td><td><html:text property="edad" ></html:text></td>
                </tr>
                <tr>
                    <td>Email</td><td><html:text property="email"></html:text></td>
                </tr>
                <tr>
                    <td>Curso</td><td><html:text property="curso"></html:text></td>
                </tr>
                <tr>
                    <td>Fecha de Alta</td><td><html:text property="fecha"></html:text></td>
                </tr>
                
            </table>
            <center>
            <html:submit property="submit">Enviar</html:submit>
                <html:reset>Limpiar</html:reset>
                <html:link href="">pulsar</html:link>
            </center>
        </html:form>
    </body>
</html>

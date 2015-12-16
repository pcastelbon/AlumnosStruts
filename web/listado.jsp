<%-- 
    Document   : listado
    Created on : 10-sep-2015, 10:32:49
    Author     : Pedro-hp
--%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://struts.apache.org/tags-html-el" prefix="html-el" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de alumnos</title>
    </head>
    <body>
        <h1>Listado de alumnos</h1>
            
            <table border="1">
                <tr>
                    <td>Nombre</td>
                    <td>Edad</td>
                    <td>Email</td>
                    <td>Curso</td>
                </tr>
                
                <c:forEach items="${BuscarForm.getListado()}" var="alumno">
                    <tr>
                        <td><c:out value="${alumno.nombre}"/></td>
                        <td><c:out value="${alumno.edad}"/></td>
                        <td><c:out value="${alumno.email}"/></td>
                        <td><c:out value="${alumno.curso}"/></td>
                    </tr>
                </c:forEach>
                
            </table>
        
    </body>
</html:html>

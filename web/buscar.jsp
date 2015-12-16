<%-- 
    Document   : buscar
    Created on : 03-sep-2015, 18:07:29
    Author     : Pedro-hp
--%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Búsqueda de alumnos</title>
    </head>
    <body>
    <center>
        <html:form action="/buscar" method="post">
            <html:text property="alumno"></html:text>
            <html:submit property="submit" value="Ver datos"></html:submit>
        </html:form>
    </center>
    
    </body>
</html:html>

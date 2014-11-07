<%-- 
    Document   : index
    Created on : 13/06/2014, 10:38:09
    Author     : Admin_2
--%>

<%@page import="br.leona.station.controller.Service"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <td> <div align="center" class= "style3">
        <title>JSP TestWebService</title>
    </head>
    <body>           
        <h1>Client WebService</h1>         
        <h4>Antes Ligar: ${antesligar}</h4> 
        <h4>Ligar: ${ligar}</h4> 
        <h4>Depois Ligar: ${depoisligar}</h4> 
        <h4>Direcao: ${direcao}</h4>  
        <h4>Desliga: ${desligar}</h4>       
        <h4>Depois Desligar: ${depoisdesligar}</h4>      
            <%              
            List<Service> services = (ArrayList)request.getAttribute("listService");  
            for(Integer index = 0; index < services.size(); index++)
            {  
            %>      
                <h5> Service Number <%=index+1%></h5>
                <h5><%=services.get(index).getName() %></h5>
                <h5><%=services.get(index).getStatus() %></h5>
            <%
            }
            %>
    </body>
</html>


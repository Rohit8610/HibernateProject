<%@page isELIgnored="false" %>
<%
if(pageContext.getAttribute("pDTO",pageContext.REQUEST_SCOPE)!=null)
{%>
	<table border="1" bgcolor="cyan">
	<tr>
	<th>pid</th><th>pname</th><th>qty</th><th>price</th><th>category</th>
    </tr>
    <tr>
     <td>${pDTO.pid}</td><td>${pDTO.pname}</td> <td>${pDTO.qty}</td> <td>${pDTO.price}</td> <td>${pDTO.category}</td>
     
     
     
     
    
    </tr>
	</table>
<%}
else
{
%>
<h1 style="color:red;text-align:center">Record not found</h1>
<%}

%>
<a href="search.html">home</a>


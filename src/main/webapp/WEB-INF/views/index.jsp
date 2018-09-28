<!DOCTYPE html>
<%@page import="com.basespringproject.entities.MyProduct"%>
<%@page import="java.io.IOException"%>
<%@page import="java.net.URLConnection"%>
<%@page import="java.io.ByteArrayInputStream"%>
<%@page import="java.io.InputStream"%>
<%@page import="com.sun.org.apache.xerces.internal.impl.dv.util.Base64"%>
<%@page import="org.springframework.web.context.ContextLoader"%>
<%@page import="java.util.List"%>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="icon" href="<%= request.getContextPath() %>/assets/img/icon.png" type="image/png" sizes="16x16">
	<meta name="description" content="Technickes Internship Sample Project">

    <title>Technikes</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
      <style>
          .myCenter{
              margin-top:100px;
          }
      </style>

</head>
<body>

<%

List<MyProduct> listOfProducts = null;
if(request.getAttribute("listOfProducts") != null && !request.getAttribute("listOfProducts").equals("")){
	listOfProducts = (List<MyProduct>)request.getAttribute("listOfProducts");
}
%>

       <div class="container myCenter">
           <div class="row">
               <div class="span5">
                   <table class="table table-striped table-condensed table-bordered">
                       <thead>
                          <tr>
                             <th>Product Id</th>
                             <th>Category</th>
                             <th>Name</th>
                             <th>Price</th>
                             <th>Quantity</th>
                             <th>Tax Rate</th>
                          </tr>
                       </thead>
                       <tbody>
                       <%
                       if(listOfProducts != null){
                    	   for(MyProduct myproduct : listOfProducts){
                       %>
                                     <tr>
                                        <td><%=myproduct.getPid() %></td>
                                        <td><%=myproduct.getCategory() %></td>
                                        <td><%=myproduct.getName() %></td>
                                        <td>Rs. <%=myproduct.getPrice() %></td>
                                        <td>Only <%=myproduct.getQuantity() %> left</td>
                                        <td><%=myproduct.getTaxRate() %>%</td>
                                     </tr>
                       <%
                    	   }
                       }else{
                       %>
                             <span>No Products available<span>
                       <%   
                       }
                       %>
                       </tbody>
                   </table>
               </div>
            </div>
        </div>
</body>

</html>

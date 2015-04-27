<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>List-of-coutries</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>
    <link href="./resources/css/bootstrap.css" rel="stylesheet" type="text/css"/>
    <link href="./resources/css/footable.core.css?v=2-0-1" rel="stylesheet" type="text/css"/>
    <link href="./resources/css/footable.standalone.css" rel="stylesheet" type="text/css"/>
    <link href="./resources/css/footable-demos.css" rel="stylesheet" type="text/css"/>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js" type="text/javascript"></script>
    <script>
        if (!window.jQuery) { document.write('<script src="./resources/js/jquery-1.9.1.min.js"><\/script>'); }
    </script>
    <script src="./resources/js/footable.js?v=2-0-1" type="text/javascript"></script>
    <script src="./resources/js/footable.sort.js?v=2-0-1" type="text/javascript"></script>
    <script src="./resources/js/footable.filter.js?v=2-0-1" type="text/javascript"></script>
    <script src="./resources/js/footable.paginate.js?v=2-0-1" type="text/javascript"></script>
    <script src="./resources/js/bootstrap-tab.js" type="text/javascript"></script>
    <script src="./resources/js/demos.js" type="text/javascript"></script>
    
  </head>
  
  <body>
    This is list of countries page. <br>
    <%--<c:forEach var="country" items="${countries}">
    	 <div>code:&nbsp;${country.code} &nbsp;&nbsp;
    	 	  name:&nbsp;<a href="#" class="country" onclick="edit(${country})">${country.name}</a></div>
    </c:forEach>
    
    
    --%>
    <div class="tab-content">
        <div class="tab-pane active" id="demo">
            <table class="footable metro-blue" data-page-size="5">
                <thead>
                <tr>
                    <th>
                        Code
                    </th>
                    <th>
                        Country Name
                    </th>
                    <th data-hide="phone,tablet">
                        Continent
                    </th>
                    <th data-hide="phone,tablet">
                        Region
                    </th>
                    <th data-hide="phone">
                        Action
                    </th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="country" items="${countries}">
                <tr>
                    <td>${country.code }</td>
                    <td>${country.name }</td>
                    <td>${country.continent }</td>
                    <td data-value="78025368997">${country.region }</td>
                    <td data-value="1">
                    	<span class="status-metro status-active" title="Active">
                    		<a href="${pageContext.request.contextPath}/country/edit/${country.code}.html">Edit</a>
                    	</span>
                    	<span class="status-metro status-active" title="Active">
                    		<a href="${pageContext.request.contextPath}/country/delete/${country.code}.html">Delete</a><br/>
                    	</span>
                    </td>
                </tr>
                </c:forEach>
                
                </tbody>
                <tfoot>
                <tr>
                    <td colspan="5">
                        <div class="pagination pagination-centered"></div>
                    </td>
                </tr>
                </tfoot>
            </table>
        </div>
        <script type="text/javascript">
		    $(function () {
		        $('table').footable();
		    });
		</script>
  </body>
</html>

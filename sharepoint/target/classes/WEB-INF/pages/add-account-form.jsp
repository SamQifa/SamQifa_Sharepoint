<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link href="./resources/css/account-style.css" rel="stylesheet" type="text/css"/>
		<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
		
</head>
 
<body>
	<div class="main">
				 <!-----start-main---->
				 <div class="inset">
				 	<div class="social-icons">
		    			 <div class="span"><a href="#"><img src="./resources/img/fb.png" alt=""/><i>Connect with Facebook </i><div class="clear"></div></a></div>	
    					 <div class="span1"><a href="#"><img src="./resources/img/t-bird.png" alt=""/><i>Connect with Twitter</i><div class="clear"></div></a></div>
    					 <div class="clear"></div>
					</div>
				 </div>	
				 <h2>Or sign up with</h2>
				 <form>
							<div class="lable">
		                     	<input type="text" class="text" value="First Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'First Name';}" id="active">

		                     	<input type="text" class="text" value="Last Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Last Name';}">
		                    </div>
		                    <div class="clear"> </div>
		                    <div class="lable-2">
		                    <input type="text" class="text" value="your@email.com " onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'your@email.com ';}">
		                     <input type="password" class="text" value="Password " onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password ';}">
							</div>
							<div class="clear"> </div>
							 <h3>By creating an account, you agree to our <span><a href="#">Terms & Conditions</a> <span></h3>
								 <div class="submit">
									<input type="submit" onclick="myFunction()" value="Create account" >
								</div>
									<div class="clear"> </div>
							 </form>
		<!-----//end-main---->
		</div>
		 <!-----start-copyright---->
   					<div class="copy-right">
						<p>More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a></p> 
					</div>
				<!-----//end-copyright---->
	 
</body>
</html>
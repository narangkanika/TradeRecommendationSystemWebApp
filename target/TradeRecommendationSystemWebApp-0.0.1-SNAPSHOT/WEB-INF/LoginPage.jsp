<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Login</title>
 </head>
 <body>
 
<form name="form1" action="LoginServlet" method="post">
<header>Login</header>
  <label>Username <span>*</span></label>
  <input type="text"/>
  <div class="help">At least 6 character</div>
  <label>Password <span>*</span></label>
  <input type="password"/>
  <div class="help">Use upper and lowercase letters as well</div>
  <button>Login</button>
</form>


</body>

 </html>
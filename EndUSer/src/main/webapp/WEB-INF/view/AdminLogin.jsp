<%-- 
	@author						: kiran
 	@module name/description	: Admin Login Page
 	@created date				: 05 oct 2016
 	@modified by				: kiran
 	@modified date				: 05 oct 2016
 --%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login Page</title>
</head>
<body>
	<div class="wrapper">
    <form class="adminLogin">       
      <h2 class="form-signin-heading">Please login</h2>
      <input type="text" class="form-control" name="username" placeholder="Enter Admin ID" required="" autofocus="" />
      <input type="password" class="form-control" name="password" placeholder="Password" required=""/>      
      <label class="checkbox">
        <input type="checkbox" value="remember-me" id="rememberMe" name="rememberMe"> Remember me
      </label>
      <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>   
    </form>
  </div>
</body>
</html>
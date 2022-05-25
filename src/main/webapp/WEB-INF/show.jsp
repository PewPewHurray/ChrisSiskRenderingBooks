<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="js/app.js"></script>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Show Book</title>
</head>
<body>
<h1>${book.title}</h1>
<p><span class="showLabels">Description:</span> ${book.description}</p>
<p><span class="showLabels">Language:</span> ${book.language}</p>
<p><span class="showLabels">Number of Pages:</span> ${book.numberOfPages}</p>
</body>
</html>
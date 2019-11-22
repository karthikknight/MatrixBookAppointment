<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Static content -->
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>

<title>Matrix Hospitals</title>
</head>
<body>
  <h1>Appointment Info</h1>
  <hr>

  <div class="form">
      <table>
        <tr>
          <td>Below is the appointment Information</td><br><br>
          <td>${firstName}</td>
          <td>${lastName}</td>
          <td>${dob}</td>
          <td>${apptDate}</td>
          <td>${apptTime}</td>
        </tr>
      </table>
      
  </div>

</body>
</html>
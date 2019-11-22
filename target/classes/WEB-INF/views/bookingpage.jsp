<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form"
uri="http://www.springframework.org/tags/form" %>
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
  <h1>Book Appointment</h1>
  <hr>

  <div class="form">
    <form:form action="/appointment/saveappointment" command="u" method="post" modelAttribute="user">
      <table>
        <tr>
          <td>Enter Your first name</td>
          <td><form:input id="firstname" name="firstName" path="firstName"/></td>
        </tr>
        <tr>
          <td>Enter Your last name</td>
          <td><form:input id="lastname" name="lastName" path="lastName"/></td>
        </tr>
        <tr>
          <td>Enter Your Date of Birth</td>
          <td><form:input id="dob" name="dob" path="dob"/></td>
        </tr>
        <tr>
          <td>Select date of appointment</td>
          <td><form:input id="apptDate" name="apptDate" path="apptDate"/></td>
        </tr>
        <tr>
          <td>Select time of appointment</td>
          <td><form:input id="apptTime" name="apptTime" path="apptTime"/></td>
        </tr>
      </table>
      
      <br>
      <input type="submit"/>
    </form:form>
  </div>
    <div class="form2">
    <form:form action="/appointment/getAppointmentInfo" command="u" method="get" modelAttribute="user">
      <table>
        <tr>
          <td>Get your Appointment Information: </td><br>
          <td><form:input id="confirmationNum" name="confirmationNum" path="confirmationNum"/></td>
        </tr>
      </table>
      
      <br>
      <input type="submit"/>
    </form:form>
  </div>

</body>
</html>
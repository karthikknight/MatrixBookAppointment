<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
    <form action="hello" method="post" onsubmit="return validate()">
      <table>
        <tr>
          <td>Enter Your first name</td>
          <td><input id="firstname" name="firstname"></td>
        </tr>
        <tr>
          <td>Enter Your last name</td>
          <td><input id="lastname" name="lastname"></td>
        </tr>
        <tr>
          <td>Enter Your Date of Birth</td>
          <td><input id="dob" name="dob"></td>
        </tr>
        <tr>
          <td>Select date of appointment</td>
          <td><input id="apptDate" name="apptDate"></td>
        </tr>
        <tr>
          <td>Select time of appointment</td>
          <td><input id="apptTime" name="apptTime"></td>
        </tr>
      </table>
      
      <br>
      <input type="submit">
    </form>
  </div>

</body>
</html>
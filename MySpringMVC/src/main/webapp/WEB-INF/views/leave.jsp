<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <div align="center"> 
        <h1>Apply Leave Page </h1>
         EmpNo<input type=text name=eno><br><br>
         Start Date<input type=text name=sdate><br><br>
         End Date<input type=text name=edate><br><br>
         
         <label for="leave">Leave Type:</label>
         <select name="cars" id="cars">
  <option value="el">Earned Leave</option>
  <option value="sl">Sick Leave</option>
  <option value="pl">paid Leave</option>
  <option value="le">Leave</option>
</select>
<br><br>
<label for="leave">Leave Reason:</label>
<select name="cars" id="cars">
  <option value="volvo">Personal</option>
  <option value="saab">Sick</option>
  <option value="mercedes">Personal</option>
  <option value="audi">Sick</option>
</select>
<br><br>
<button>Apply Leave</button>
</div>
 
 
</body>
</html>
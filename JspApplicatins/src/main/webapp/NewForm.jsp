<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Data</title>
</head>
<body>

<form action="DataInsert.jsp" method="post">

<label>Enter name</label> 
<input type="text" name="sname" />
<br><br>
<label>Enter email</label>
<input type="email" name="emailid" />
<br><br>
Gender :<input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="Female"> Female
<br><br>


Hobbies :<input type="checkbox" name="hobbies" value="Singing">Singing
    <input type="checkbox" name="hobbies" value="Dancing">Dancing
    <input type="checkbox" name="hobbies" value="Playing">Playing
    <input type="checkbox" name="hobbies" value="Reading">Reading
   
<br><br>
<input type="submit" name="submit"/>

</form>
</body>
</html>

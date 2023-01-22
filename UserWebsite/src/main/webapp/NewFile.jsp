<html>
<head>
<title >validation form</title>

<script>

function myfun()
{
	var correct_way =/^[A-Za-z]+$/;
	var a = document.getElementById("username").value;
    var p = document.getElementById("password").value;
    var cp = document.getElementById("passwordss").value;

 if( a=="")	{
	document.getElementById("Message").innerHTML ="*** please enter username";
	return false;
	}
	
if(a.length<3){
	document.getElementById("Message").innerHTML="***username must be gtreater than 3";
	return false;
	}

if(a.length> 20)	{
	document.getElementById("Message").innerHTML="*** username must less than 20 character";
	return false;     }

if(a.match(correct_way)){	true;     }

else	{
	document.getElementById("Message").innerHTML="*** only alphabet are allowed";
	return false;
	}
	
if(p=="")  { document.getElementById("pas").innerHTML="** please fill password";
             return false;    }
	
	if(p != cp) {
		document.getElementById("pas").innerHTML="** password are not same";
		return false;
		}}
</script>
</head>

<body>------
<form  onsubmit="return myfun()" >

Username : <input type="text" name="username" id ="username" value="" >
<span id="Message"> </span>
<br><br>
New Password : <input type="password" id="password" name="password" value="">
<span id="pas"> </span>
<br>

Confirm Password : <input type="password" id="passwordss" name="password" value="">
<span id="pasmsg"> </span>
<input type="submit" value="login " >

</form>
</body>
</html>
function validations() {
alert("hello");
	var firstName = document.getElementById('firstName').value;
	var lastName = document.getElementById('lastName').value;
	var fatherName = document.getElementById('fatherName').value;
	alert("fathaer==>" + fatherName);
	alert(isNaN(fatherName));
	var age = document.getElementById('age').value;
	var address = document.getElementById('address').value;
	var email = document.getElementById('email').value;
	var password = document.getElementById('password').value;
	var confirmPassword = document.getElementById('confirmPassword').value;

	var firstnameCheck = /^[a-zA-Z ]$/;

	if (firstnameCheck.test(firstName)) {
		document.getElementById('firstNameError').innerHTML = " ";
	}else{
		document.getElementById('firstNameError').innerHTML = " invalid name ";
		return false;
	}
	

//	if ((firstName.length <= 3) || (firstName.length >= 16)) {
//		document.getElementById('firstNameError').innerHTML = " ** Name minimum 3 character insert!!";
//		document.getElementById('firstNameError').style = "display:block;color:red";
//		return false;
//
//	}
//	if (!isNaN(firstName)) {
//		document.getElementById('firstNameError').innerHTML = " ** only characters are allowed";
//		document.getElementById('firstNameError').style = "display:block;color:red";
//		return false;
//	}

	if (lastName == "" || lastName == null) {
		document.getElementById('lastNameError').innerHTML = " ** Please fill field";
		document.getElementById('lastNameError').style = "display:block;color:red";
		return false;
	}

	if (!isNaN(lastName)) {
		document.getElementById('lastNameError').innerHTML = " ** only characters are allowed";
		document.getElementById('lastNameError').style = "display:block;color:red";
		return false;
	}

	if (fatherName == "" || fatherName == null) {
		document.getElementById('fatherNameError').innerHTML = " ** Please fill FName";
		document.getElementById('fatherNameError').style = "display:block;color:red";
		return false;
	}
	if ((fatherName.length <= 3) || (fathername.length >= 16)) {
		document.getElementById('fatherNameError').innerHTML = " ** name must be minimum 3 character ";
		document.getElementById('fatherNameError').style = "display:block;color:red";
		return false;
	}

	if (true) {
		alert("ad");
		alert(fatherName);
		document.getElementById('fatherNameError').innerHTML = " ** only haracter are allow";
		document.getElementById('fatherNameError').style = "display:block;color:red";
		return false;

	}

	if (age == "") {
		document.getElementById('age').innerHTML = " ** Please fill age";
		return false;
	}
	if (address.length <= 10) {
		document.getElementById('address').innerHTML = " ** Plese fill the Address "
	}

	if (email == "") {
		document.getElementById('email').innerHTML = " ** Please fill the email index field";
		return false;
	}

	if (password == "") {
		document.getElementById('password').innerHTML = " ** Please fill the password field";
		return false;
	}
	if ((password.length >= 20)) {
		document.getElementById('password').innerHTML = " ** Passwords lenght must be between  5 and 20";
		return false;
	}
	if (password != confirmPassword) {
		document.getElementById('confirmPassword').innerHTML = " ** Password does not match ";
		return false;
	}
	if (confirmPassword == "") {
		document.getElementById('confirmPassword').innerHTML = " ** Please fill the confirmpassword field";
		return false;
	}
}

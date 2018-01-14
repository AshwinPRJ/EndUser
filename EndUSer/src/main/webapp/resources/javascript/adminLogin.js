$(document).ready(function() {

	// SUBMIT FORM
	$("#adminLogin").submit(function(event) {
		// Prevent the form from submitting via the browser.
		event.preventDefault();
	/*	if($("#username").val() == ""){
			alert("enter username ");
			$( "#username" ).focus();
			return;
		}
		if($("#password").val() == ""){
			alert("enter password ");
			$( "#password" ).focus();
			return;
		}*/
		ajaxPost();
		
	});

	function ajaxPost() {
		// PREPARE FORM DATA
		console.log($("#username").val());
		console.log($("#password").val());
		var formData = {
			userName : $("#username").val(),
			password : $("#password").val(),
		};

		/*var keyValue = {
			"loginBean" : formData
		};*/
		var stringifyVar = JSON.stringify(formData);
		// DO POST
		$.ajax({
			type : "POST",
			contentType : 'application/json; charset=utf-8',
			// url : window.location + "api/customer/save",
			url : "api/login/loginSave",
			data : stringifyVar,
			dataType : 'json',
			success : function(result) {
				alert("success " + result.statusType);
				console.log(result);
				window.location='home';
			},
			error : function(e) {
				alert("Error!" + e.status)
				console.log("ERROR: ", e);
			}
		});
	}
})

$("#signup-form").validate({

	rules: {

		firstName: {
			required: true,
		},

		lastName: {
			required: true,
		},

		email: {
			required: false,
		},

		password: {
			required: true,
		},

		mobile: {
			required: true,
			number: true
		},

	},
	messages: {

		firstName: {
			required: "Please enter  First Name",
		},

		lastName: {
			required: "Please enter  Last Name",
		},

		password: {
			required: "Please enter  password",
		},

		email: {
			required: "Please enter email",
		},

		mobile: {
			required: "Please enter mobile number",
		},

	},
	submitHandler: function(form) {

		var formData = {

			"firstName": $("#firstName").val(),
			"lastName": $("#lastName").val(),
			"email": $("#email").val(),
			"password": $("#password").val(),
			"mobile": $("#mobile").val(),
			"password": $("#password").val()
		}
		register(formData);
	}
})

function register(formData) {

	if ($("#signup-form").valid()) {

		$.ajax({

			type: "POST",
			url: "/register",
			contentType: "application/json",
			data: JSON.stringify(formData),
			cache: false,
			beforeSend: function() {
				$(".alert").remove();
			},
			success: function(response) {
			$("#signup-form").prepend(("<div class='alert alert-danger' role='alert'>" + response.message + "</div>"));
			},
			complete: function(response) {

			},
			error: function(error) {
				alert("Something went wrong please try again later")
			}
		})
	}
	return false;
}

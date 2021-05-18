$(document).ready(function() {

	$("#loginModalPop").click(function() {

		$(".modal").modal("show");
		document.body.style.overflow = "scroll";
	});
});

$(document).ready(function() {


	//$('.form').append($('<label id="email-error" class="error" for="email"></label>'));

	/*jQuery.validator.addMethod("emailValidation", function(value, element) {
		var email_flag = /^\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/.test(value);
		var username_flag = this.optional(element) || /^[a-zA-Z0-9 ]+$/.test(value);
		if (email_flag == true || username_flag == true)
			return true;
	}, "Please enter valid email/username"
	);
*/

	$("#login-form").validate({

		rules: {

			userName: {
				required: true,
			},

			password: {
				required: true,
			},

		},
		messages: {

			userName: {
				required: "Please enter your email/username",
			},

			password: {
				required: "Please enter your password",
			},
		},
		submitHandler: function(form) {

			var formData = {

				"userName": $("#userName").val(),
				"password": $("#password").val()
			}
			login(formData);
		}
	})
})

$(document).ready(function() {

	$('#popup-modal').on('hidden.bs.modal', function() {
		var $alertas = $('#login-form');
		$alertas.validate().resetForm();
		$alertas.find('.error').removeClass('error');
		$('#login-form').trigger("reset");
	});

})

function login(formData) {

	if ($("#login-form").valid()) {

		$.ajax({

			type: "POST",
			url: "/login",
			contentType: "application/json",
			data: JSON.stringify(formData),
			success: function(response, status, xhr) {

				$(".alert").remove();

				setTimeout(function() {
					$(".modal-body").prepend(("<div class='alert alert-danger' role='alert'>" + response.message + "</div>"));
				}, 500);

			},
			error: function(error) {
				alert("Something went wrong  please try again later")
				//loginPopClose();
				//$('.modal').modal('hide');

			}
		})
	}
	return false;
}



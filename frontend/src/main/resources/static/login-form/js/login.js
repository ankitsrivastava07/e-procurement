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
			cache: false,
			beforeSend: function() {
				$(".alert").remove();
			},
			success: function(response) {
			},
			complete: function(response) {

				$(".alert").remove();
				setTimeout(function() {
					$(".modal-body").prepend(("<div class='alert alert-danger' role='alert'>" + response.responseText + "</div>"));
				}, 500);

				if (response.responseText == "Success")
					window.location.href = "/"

			},
			error: function(error) {
				alert("Something went wrong  please try again later")
			}
		})
	}
	return false;
}

function changePassword(formData) {

	if ($("#change-password").valid()) {

		$.ajax({

			type: "POST",
			url: "/change-password",
			contentType: "application/json",
			data: JSON.stringify(formData),
			cache: false,
			beforeSend: function(xhr) {
				var cookie = $.cookie("session_Token")
				xhr.setRequestHeader('session_Token', cookie);
			},
			success: function(response) {
			},
			complete: function(response) {

				if (response.statusText == "success")
					window.location.href = "/"

			},
			error: function(error) {
				alert("Something went wrong  please try again later")
			}
		})
	}
	return false;
}

jQuery('#change-password').validate({

	rules: {
		password: {
			minlength: 5,
			required:true
		},
		password_confirm: {
			minlength: 5,
			required:true,
			equalTo: "#password"
		},
	},

	messages: {

		password: {
		required:"Please enter password",
			minlength: "Password should be atleast 5 characters long",
		},

		password_confirm: {
		    minlength: "Confirm password should be atleast 5 characters long",
			equalTo: "Password not matched",
			required:"Please Enter confirm password"
		}
	},

	submitHandler: function(form) {

		var formData = {

			"password": $("#password").val(),
		}
		changePassword(formData)
	}

})

window.addEventListener( "pageshow", function ( event ) {
  var historyTraversal = event.persisted || 
                         ( typeof window.performance != "undefined" && 
                              window.performance.navigation.type === 2 );
  if ( historyTraversal ) {
    // Handle page restore.
    window.location.reload();
  }
});

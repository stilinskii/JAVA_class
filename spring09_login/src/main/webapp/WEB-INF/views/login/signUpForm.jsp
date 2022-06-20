<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">

<style>
html, body {
	height: 100%;
}

body {
	display: flex;
	padding-top: 40px;
	padding-bottom: 40px;
	background-color: #f5f5f5;
}

.form-signin {
	max-width: 330px;
	padding: 15px;
}

.form-signin .form-floating:focus-within {
	z-index: 2;
}

.form-signin input[type="email"] {
	margin-bottom: -1px;
	border-bottom-right-radius: 0;
	border-bottom-left-radius: 0;
}

.form-signin input[type="password"] {
	margin-bottom: 10px;
	border-top-left-radius: 0;
	border-top-right-radius: 0;
}

.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}

.b-example-divider {
	height: 3rem;
	background-color: rgba(0, 0, 0, .1);
	border: solid rgba(0, 0, 0, .15);
	border-width: 1px 0;
	box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em
		rgba(0, 0, 0, .15);
}

.b-example-vr {
	flex-shrink: 0;
	width: 1.5rem;
	height: 100vh;
}

.bi {
	vertical-align: -.125em;
	fill: currentColor;
}

.nav-scroller {
	position: relative;
	z-index: 2;
	height: 2.75rem;
	overflow-y: hidden;
}

.nav-scroller .nav {
	display: flex;
	flex-wrap: nowrap;
	padding-bottom: 1rem;
	margin-top: -1px;
	overflow-x: auto;
	text-align: center;
	white-space: nowrap;
	-webkit-overflow-scrolling: touch;
}
</style>


<!-- Custom styles for this template -->
<link href="signin.css" rel="stylesheet">
</head>
<body class="text-center">

	<main class="form-signin w-100 m-auto">
		<form action="/myapp/account/signup" method="post">
			<img class="mb-4" src="https://w7.pngwing.com/pngs/34/292/png-transparent-sunglasses-thug-life-cool-miscellaneous-angle-white.png"
				alt="" width="72" height="57">
			<h1 class="h3 mb-3 fw-normal">Please sign up</h1>
			<div class="form-floating">
				<input type="text" class="form-control" id="floatingInput" name="username"
					placeholder="username"> <label for="floatingInput">Username</label>
			</div>
			<div class="form-floating">
				<input type="text" class="form-control" id="floatingPassword" name="id"
					placeholder="Id"> <label for="floatingPassword">Id</label>
			</div>
			<div class="form-floating">
				<input type="password" class="form-control" id="floatingPassword" name="password"
					placeholder="Password"> <label for="floatingPassword">Password</label>
			</div>
			<div class="form-floating">
				<input type="email" class="form-control" id="floatingInput" name="email"
					placeholder="name@example.com"> <label for="floatingInput">Email address</label>
			</div>
			
			
			<button class="w-100 btn btn-lg btn-primary" type="submit">Sign
				up</button>
			<p class="mt-5 mb-3 text-muted">&copy; 2017–2022</p>
		</form>
	</main>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
		crossorigin="anonymous"></script>
</body>
</html>
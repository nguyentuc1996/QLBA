<!DOCTYPE html>
<html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head>
<meta charset="UTF-8">
<title>Sign-Up/Login Form</title>
<link
	href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
	<div id="header">
		<div class="inHeaderLogin"></div>
	</div>
	<div class="form">
		<div id="login">
			<h1>Chào mừng bạn đến với hệ thống quản lý bệnh án điện tử</h1>
			<form action="loginprocess.html" method="post">
				<div class="field-wrap">
					<label> 
						Tài khoản<span class="req">*</span>
					</label> 
					<input name="taiKhoan" type="text" required autocomplete="off" />
				</div>

				<div class="field-wrap">
					<label> 
						Mật khẩu<span class="req">*</span>
					</label>
					 <input name="matKhau" type="password" required autocomplete="off" />
				</div>

				<p class="forgot">
					<a href="#">Đăng ký tài khoản</a>
				</p>
				<div id="role">
					<h3>Chọn quyền đăng nhập</h3>
					<label class="role-radio">
					 	<input type="radio" name="vaiTro" value="admin" checked> Admin</input>
					</label> 
					<label class="role-radio"> 
						<input type="radio" name="vaiTro" value="bacSi"> Bác sĩ</input>
					</label> 
					<label class="role-radio"> 
						<input type="radio" name="vaiTro" value="benhNhan"> Bệnh nhân</input>
					</label>
				</div>
				<button class="button button-block" />
				Đăng nhập
				</button>

			</form>

		</div>



	</div>
	<script
		src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

	<script src="${pageContext.request.contextPath}/resources/js/index.js"></script>

</body>
</html>

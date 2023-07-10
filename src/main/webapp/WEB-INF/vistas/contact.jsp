<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="
    <core:url value="/res/css/styles.css" />
    ">
<title>Contacto</title>
</head>

<body>
	<!-- <jsp:include page="navbar.jsp" /> -->

	<div class="container mt-3">
		<div class="row justify-content-center">
			<h1 class="text-center">Contáctanos</h1>

			<p
				class="text-center w-responsive mx-auto m-2 d-none d-sm-inline col-lg-8 col-md-10 col-xl-6">
				¿Tienes alguna pregunta? No dudes en contactarnos directamente.
				Nuestro equipo te responderá en cuestión de horas.</p>

			<div class="row justify-content-center mt-5">
				<div class="col-12 col-lg-8 col-md-10">
					<div class="custom-form-container">
						<form id="contact-form" name="contact-form"
							action="${pageContext.request.contextPath}/contact" method="POST">
							<div class="row">
								<div class="col-md-6">
									<div class="md-form mb-0">
										<label style="color: red">*</label> <label for="nombre"
											class="">Nombre:</label> <small id="nameHelp"
											class="form-text text-danger"></small> <input type="text"
											id="nombre" name="nombre" class="form-control"
											placeholder="Nombre Apellido" />
									</div>
								</div>

								<div class="col-md-6">
									<div class="md-form mb-0">
										<label style="color: red">*</label> <label
											for="correoElectronico" class="">Correo:</label> <small
											id="emailHelp" class="form-text text-danger"></small> <input
											type="text" id="correoElectronico" name="correoElectronico"
											class="form-control" placeholder="tucorreo@correo.com" />
									</div>
								</div>
							</div>

							<div class="row">
								<div class="col-md-12">
									<div class="md-form mb-0">
										<label style="color: red">*</label> <label for="asunto"
											class="">Asunto:</label> <small id="subjectHelp"
											class="form-text text-danger"></small> <input type="text"
											id="asunto" name="asunto" class="form-control"
											placeholder="Breve descripción" maxlength="100" />
									</div>
								</div>
							</div>

							<div class="row">
								<div class="col-md-12">
									<div class="md-form">
										<label style="color: red">*</label> <label for="mensaje">Mensaje:</label>
										<small id="messageHelp" class="form-text text-danger"></small>
										<textarea id="mensaje" name="mensaje" rows="4"
											class="form-control md-textarea" maxlength="500"
											placeholder="Escribe tu mensaje aquí..."></textarea>
									</div>
								</div>
							</div>
							<div class="text-center text-md-left">
								<button type="submit" class="btn btn-primary">Enviar</button>
							</div>
							<div class="status"></div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- 	script bootstrap -->
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
		crossorigin="anonymous"></script>
	<script src="<core:url value="/res/js/contactFormValidator.js" />"></script>
</body>
</html>

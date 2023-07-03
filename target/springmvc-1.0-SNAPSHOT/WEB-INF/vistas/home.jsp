<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %> <%@ taglib prefix="core"
uri="http://java.sun.com/jsp/jstl/core" %> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
      rel="stylesheet"
    />
    <link rel="stylesheet" href="
    <core:url value="/res/css/styles.css" />
    ">
    <title>Home</title>
  </head>

  <body>
    <!-- Navbar -->
    <!-- <jsp:include page="navbar.jsp" /> -->
    <!-- End Navbar -->
    <div class="container mt-5">
      <div class="row justify-content-center">
        <div
          class="card col-12 col-sm-8 col-md-7 col-lg-4 m-2 custom-card-container"
        >
          <div class="card-body">
            <div class="d-flex justify-content-center">
              <a href="<c:url value='/create-capacitation' />">
                <button class="btn btn-card btn-primary btn-lg">
                  Crear capacitación
                </button>
              </a>
            </div>
          </div>
        </div>
        <div
          class="card col-12 col-sm-8 col-md-7 col-lg-4 m-2 custom-card-container"
        >
          <div class="card-body">
            <div class="d-flex justify-content-center align-items-center">
              <a href="<c:url value='/contact' />">
                <button type="submit" class="btn btn-card btn-primary btn-lg">
                  Contacto
                </button>
              </a>
            </div>
          </div>
        </div>
        <div
          class="card col-12 col-sm-8 col-md-7 col-lg-4 m-2 custom-card-container"
        >
          <div class="card-body">
            <div class="d-flex justify-content-center">
              <a href="<c:url value='/list-capacitations' />">
                <button type="submit" class="btn btn-card btn-primary btn-lg">
                  Lista Capacitaciones
                </button>
              </a>
            </div>
          </div>
        </div>
      </div>
    </div>

    <!-- 	script bootstrap -->
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
      crossorigin="anonymous"
    ></script>
  </body>
</html>

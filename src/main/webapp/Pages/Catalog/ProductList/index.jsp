<!DOCTYPE html>
<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>Noriva Admin's page</title>

    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
            crossorigin="anonymous">
    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
          integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ=="
          crossorigin="anonymous" referrerpolicy="no-referrer"/>

    <link rel="stylesheet" href="./Components/SlideBar/Sidebar.css">
    <link rel="stylesheet" href="./Pages/Catalog/ProductList/style.css">

    <script src="https://kit.fontawesome.com/e82e1ec9a6.js"
            crossorigin="anonymous"></script>
</head>

<body>
<div class="wrapper">
    <!-- Sidebar  -->
    <div id="side__bar"></div>
    <!-- Page Content  -->
    <div id="content">
        <div id="header"></div>
        <div class="page__container">
            <div class="page__top row">
                <h1 class="page__title col">Products</h1>
                <a href="./Pages/Catalog/Product/index.html" class="add__btn ">New Product</a>
            </div>
            <div class="all__product__container">
                <div class="input-group mb-3">
						<span class="input-group-text" id="basic-addon1"><i
                                class="fas fa-search"></i></span> <input type="text"
                                                                         class="form-control"
                                                                         placeholder="Start typing to search for products">
                </div>
                <table class="table">
                    <thead>
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">Product</th>
                        <th scope="col">Category</th>
                        <th scope="col">Stock</th>
                        <th scope="col">Price</th>
                        <th scope="col">Action</th>
                    </tr>
                    </thead>
                    <tbody>


                    <!-- Load Product by for each loop  -->
                    <c:forEach var="item" items="${listProduct}">
                        <tr>
                            <th scope="row">1</th>
                            <td>
                                <div class="product__info float-start"
                                     style="display: flex; justify-content: center;">
                                    <div class="product__image">
                                        <img width="40px" height="40px" src=${item.picture_url}>
                                    </div>
                                    <div style="width: 15px"></div>
                                    <div class="product__detail">
                                        <p style="font-weight: 700;">${item.name}</p>
                                        <p>Brand: ${item.brand_code}</p>
                                    </div>
                                </div>
                            </td>
                            <td>${item.category_code}</td>

                            <td><c:choose>
                                <c:when test="${item.quatity  == 0}">
                                    <div class="stock__quantity out">
                                        <p>${item.quatity} ${item.inStock}</p>
                                    </div>
                                </c:when>
                                <c:otherwise>
                                    <div class="stock__quantity">
                                        <p> ${item.quatity} ${item.inStock}</p>
                                    </div>
                                </c:otherwise>
                            </c:choose></td>


                            <td>$${item.price}</td>

                            <td>
                                <div class="row">
									<div class="btn__action col">
										<form action="EditProductController" method="post">
											<input type="hidden" name="id" value="${item.id}">
											<input type="hidden" name="description" value="${item.description}">
											<input type="hidden" name="name" value="${item.name}">
											<input type="hidden" name="brand_code" value="${item.brand_code}">
											<input type="hidden" name="category_code" value="${item.category_code}">
											<input type="hidden" name="picture_url" value="${item.picture_url}">
											<input type="hidden" name="price" value="${item.price}">
											<input type="hidden" name="quatity" value="${item.quatity}">
											<input class="btn btn-warning" type="submit" name="edit" value="Update">
										</form>
									</div>
									<div class="btn__action col" style="margin-left: -70px;">
										<form action="DeleteProductController" method="post">
											<input type="hidden" value="${item.id}" name="id">
											<input type="submit" name="delete" value="Delete" class="btn btn-danger">
										</form>
									</div>
								</div>
                            </td>
                            <td>

                            </td>

                        </tr>
                    </c:forEach>


                    </tbody>
                </table>

            </div>
        </div>
        <div id="footer"></div>
    </div>
</div>
<script src="https://kit.fontawesome.com/e82e1ec9a6.js"
        crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script
        src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script
        src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
<script src="./Components/Header/Header.js"></script>
<script src="./Components/SlideBar/Sidebar.js"></script>
<script src="./Components/SlideBar/main.js"></script>
<script src="./Components/Footer/Footer.js"></script>


<script type="text/javascript" src="./main.js"></script>
</body>

</html>
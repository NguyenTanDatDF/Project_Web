<!DOCTYPE html>
<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Your store</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
        integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="./Pages_Customer/ProductPage/style.css">
    <link rel="stylesheet" href="./Components_Customer/CategorySideBar/CategorySideBar.css">
    <link rel="stylesheet" href="./Components_Customer/Footer/Footer.css">
    <link rel="stylesheet" href="./Components_Customer/Header/Header.css">
</head>

<body>
    <div id="header"></div>
    <div class="d-md-flex align-items-stretch">
        <div id="slide_bar"></div>
        <div id="content product_container" class=" p-md-5 pt-5">
            <div class="introduction">
                <h2>Men's Shoes</h2>
                <img src="https://opencart.mahardhi.com/MT04/noriva/01/image/cache/catalog/banners/cat_banner-1394x240.jpg">
                <p>Shop Laptop feature only the best laptop deals on the market. By comparing laptop deals from the likes of PC World, Comet, Dixons, The Link and Carphone Warehouse, Shop Laptop has the most comprehensive selection of laptops on the internet. At Shop Laptop, we pride ourselves on offering customers the very best laptop deals. From refurbished laptops to netbooks, Shop Laptop ensures that every laptop - in every colour, style, size and technical spec - is featured on the site at the lowest possible price.</p>
            </div>
            <div class="sort_items">
                <div class="sort_bar">
                    <h5>Sort by:</h5>
                    <div class="custom_select">
                        <select>
                            <option value="1">Default</option>
                            <option value="2">Name (A - Z)</option>
                            <option value="3">Name (Z - A)</option>
                            <option value="4">Price (Low - High)</option>
                            <option value="5">Price (High - Low)</option>
                        </select>
                    </div>
                </div>
                <div class="show_item">
                    <h5>Show:</h5>
                    <div class="show_item_select" onchange="getProductItem()">
                        <select id="show_value">
                            <option value="1">12</option>
                            <option value="2">24</option>
                            <option value="3">36</option>
                            <option value="4">48</option>
                        </select>
                    </div>
                </div>
            </div>
            <div class="product_container">
                <c:forEach var="item" items="${listProduct}">
           
                <div class="item"><product-card id="card_item" productName="${item.name}" productPrice="${item.price}" productImg="${item.picture_url}"/></div>
           
            </c:forEach>
            </div>
        </div>
    </div>
    <div id="footer"></div>
</body>
<script type="module" src="./Components_Customer/ProductCard/ProductCard.js"></script>
<script src="https://kit.fontawesome.com/e82e1ec9a6.js" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
    integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
    crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
    integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
    crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script src="./Components_Customer/CategorySideBar/CategorySideBar.js"></script>
<script src="./Components_Customer/CategorySideBar/CategorySideBarMain.js"></script>
<script src="./Components_Customer/Footer/Footer.js"></script>
<script src="./Components_Customer/Header/Header.js"></script>
<script src="./Pages_Customer/ProductPage/main.js"></script>

</html>
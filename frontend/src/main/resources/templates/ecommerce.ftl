<!DOCTYPE html>
<html lang="en">
<head>
<title>E-Commerce</title>
<meta http-equiv="content-type" content="text/html;charset=utf-8" />
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="e-commerce site well design with responsive view." />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<link href="image/catalog/cart.png" rel="icon" />
<link href="assets/css/bootstrap.min.css" rel="stylesheet" media="screen" />
<link href="assets/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
<link href='http://fonts.googleapis.com/css?family=Roboto+Slab' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Arimo' rel='stylesheet' type='text/css'>
 <!--<link href="assets/css/stylesheet.css" rel="stylesheet"> -->
<link href="assets/css/responsive.css" rel="stylesheet">
<link href="assets/css/owl.carousel.css" type="text/css" rel="stylesheet" media="screen" />
<link href="assets/css/owl.transitions.css" type="text/css" rel="stylesheet" media="screen" />
<script src="assets/vendor/jquery/jquery.min.js" type="text/javascript"></script>
<script src="assets/vendor/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script type="text/javascript" src="javascript/template_js/jstree.min.js"></script>
<script type="text/javascript" src="javascript/template_js/template.js"></script>
<script src="javascript/common.js" type="text/javascript"></script>
<script src="javascript/global.js" type="text/javascript"></script>
<script src="javascript/owl-carousel/owl.carousel.min.js" type="text/javascript"></script>
</head>
<body>
<div class="preloader loader" style="display: block;"> <img src="image/loader.gif"  alt="#"/></div>
<header>
    <div class="header-top">
        <div class="container">
            <div class="row">
                <div class="col-sm-12">
                    <div class="top-left pull-left">
                        <div class="language">
                            <form action="#" method="post" enctype="multipart/form-data" id="language">
                                <div class="btn-group">
                                    <button class="btn btn-link dropdown-toggle" data-toggle="dropdown" aria-expanded="false"> <img src="image/flags/gb.png" alt="English" title="English"> <i class="fa fa-caret-down"></i></button>
                                    <ul class="dropdown-menu">
                                        <li><a href="#"><img src="image/flags/lb.png" alt="Arabic" title="Arabic"> Arabic</a></li>
                                        <li><a href="#"><img src="image/flags/gb.png" alt="English" title="English"> English</a></li>
                                    </ul>
                                </div>
                            </form>
                        </div>
                        <div class="currency">
                            <form action="#" method="post" enctype="multipart/form-data" id="currency">
                                <div class="btn-group">
                                    <button class="btn btn-link dropdown-toggle" data-toggle="dropdown"> <strong>$</strong> <i class="fa fa-caret-down"></i> </button>
                                    <ul class="dropdown-menu">
                                        <li>
                                            <button class="currency-select btn btn-link btn-block" type="button" name="EUR">€ Euro</button>
                                        </li>
                                        <li>
                                            <button class="currency-select btn btn-link btn-block" type="button" name="GBP">£ Pound Sterling</button>
                                        </li>
                                        <li>
                                            <button class="currency-select btn btn-link btn-block" type="button" name="USD">$ US Dollar</button>
                                        </li>
                                    </ul>
                                </div>
                            </form>
                        </div>
                    </div>
                    <div class="top-right pull-right">
                        <div id="top-links" class="nav pull-right">
                            <ul class="list-inline">
                                <li class="dropdown"><a href="#" title="My Account" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> <span>My Account</span> <span class="caret"></span></a>
                                    <ul class="dropdown-menu dropdown-menu-right">
                                        <li><a href="register.html">Register</a></li>
                                        <li><a href="login.html">Login</a></li>
                                    </ul>
                                </li>
                                <li><a href="#" id="wishlist-total" title="Wish List (0)"><i class="fa fa-heart"></i> <span>Wish List</span><span> (0)</span></a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="header-inner">
            <div class="col-sm-4 col-xs-6 header-left">
            <div class="shipping">
                        <div class="shipping-img"></div>
                        <div class="shipping-text">Free Shipping <span class="shipping-detail">Free on all products</span></div>
                    </div>
                
            </div>
            <div class="col-sm-4 col-xs-6 header-middle">
                <div class="header-middle-top">
                    
                    <div id="logo"> <a href="index.html"><img src="image/logo.png" title="E-Commerce" alt="E-Commerce" class="img-responsive" /></a> </div>
                </div>
            </div>
            <div class="col-sm-4 col-xs-6 header-right">
                <div id="cart" class="btn-group btn-block">
                    <button type="button" class="btn btn-inverse btn-block btn-lg dropdown-toggle cart-dropdown-button"><span id="cart-total">1 item(s) - $254.00</span><i class="fa fa-caret-down"></i></button>
                    <ul class="dropdown-menu pull-right cart-dropdown-menu">
                        <li>
                            <table class="table table-striped">
                                <tbody>
                                    <tr>
                                        <td class="text-center"><a href="#"><img class="img-thumbnail" title="iPhone" alt="iPhone" src="image/product/7product50x59.jpg"></a></td>
                                        <td class="text-left"><a href="#">iPhone</a></td>
                                        <td class="text-right">x 1</td>
                                        <td class="text-right">$254.00</td>
                                        <td class="text-center"><button class="btn btn-danger btn-xs" title="Remove" type="button"><i class="fa fa-times"></i></button></td>
                                    </tr>
                                </tbody>
                            </table>
                        </li>
                        <li>
                            <div>
                                <table class="table table-bordered">
                                    <tbody>
                                        <tr>
                                            <td class="text-right"><strong>Sub-Total</strong></td>
                                            <td class="text-right">$210.00</td>
                                        </tr>
                                        <tr>
                                            <td class="text-right"><strong>Eco Tax (-2.00)</strong></td>
                                            <td class="text-right">$2.00</td>
                                        </tr>
                                        <tr>
                                            <td class="text-right"><strong>VAT (20%)</strong></td>
                                            <td class="text-right">$42.00</td>
                                        </tr>
                                        <tr>
                                            <td class="text-right"><strong>Total</strong></td>
                                            <td class="text-right">$254.00</td>
                                        </tr>
                                    </tbody>
                                </table>
                                <p class="text-right"> <span class="btn-viewcart"><a href="cart.html"><strong><i class="fa fa-shopping-cart"></i> View Cart</strong></a></span> <span class="btn-checkout"><a href="checkout.html"><strong><i class="fa fa-share"></i> Checkout</strong></a></span> </p>
                            </div>
                        </li>
                    </ul>
                </div>
                <div id="search" class="input-group">
                    <input type="text" name="search" value="" placeholder="Search" class="form-control input-lg" />
                    <span class="input-group-btn">
                    <button type="button" class="btn btn-default btn-lg"><i class="fa fa-search"></i></button>
                    </span> </div>
            </div>
        </div>
    </div>
</header>
<nav id="menu" class="navbar">
    <div class="nav-inner container">
        <div class="navbar-header"><span id="category" class="visible-xs">Categories</span>
            <button type="button" class="btn btn-navbar navbar-toggle" ><i class="fa fa-bars"></i></button>
        </div>
        <div class="navbar-collapse">
            <ul class="main-navigation">
                <li><a href="index.html"   class="parent"  >Home</a> </li>
                <li><a href="category.html"   class="parent"  >Electronics</a> </li>
                <li><a href="category.html"   class="parent"  >Mobile</a> </li>
                <li><a href="category.html"   class="parent"  >Fashio & Beauty</a> </li>
                <li><a href="category.html"   class="parent"  >Audio</a> </li>
                <li><a href="category.html"   class="parent"  >Home & Family</a> </li>
                <li><a href="#" class="active parent">Page</a>
                    <ul>
                        <li><a href="category.html">Category Page</a></li>
                        <li><a href="cart.html">Cart Page</a></li>
                        <li><a href="checkout.html">Checkout Page</a></li>
                        <li><a href="blog.html" >Blog Page</a></li>
                        <li><a href="singale-blog.html" >Singale Blog Page</a></li>
                        <li><a href="register.html">Register Page</a></li>
                        <li><a href="contact.html">Contact Page</a></li>
                    </ul>
                </li>
                <li><a href="blog.html" class="parent"  >Blog</a></li>
                <li><a href="about-us.html" >About us</a></li>
                <li><a href="contact.html" >Contact Us</a> </li>
                
            </ul>
        </div>
    </div>
</nav>
<div class="container col-2">
    <div class="row">
        <div class="col-md-12">
            <div id="main-banner" class="owl-carousel home-slider">
                <div class="item"> <a href="#"><img src="image/banners/Main-Banner1.jpg" alt="main-banner1" class="img-responsive" /></a> </div>
                <div class="item"> <a href="#"><img src="image/banners/Main-Banner2.jpg" alt="main-banner2" class="img-responsive" /></a> </div>
                <div class="item"> <a href="#"><img src="image/banners/Main-Banner3.jpg" alt="main-banner3" class="img-responsive" /></a> </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="cms_banner">
            <div class="col-md-4 cms-banner-left"> <a href="#"><img alt="#" src="image/banners/subbanner1.jpg"></a> </div>
            <div class="col-md-4 cms-banner-middle"> <a href="#"><img alt="#" src="image/banners/subbanner2.jpg"></a> </div>
            <div class="col-md-4 cms-banner-right"> <a href="#"><img alt="#" src="image/banners/subbanner3.jpg"></a> </div>
        </div>
    </div>
    <div class="row">
        <div id="column-left" class="col-sm-3 hidden-xs column-left">
            <div class="column-block">
                <div class="columnblock-title">Categories</div>
                <div class="category_block">
                    <ul class="box-category treeview-list treeview">
                        <li><a href="#" class="activSub">Desktops</a>
                            <ul>
                                <li><a href="#">PC</a></li>
                                <li><a href="#">MAC</a></li>
                            </ul>
                        </li>
                        <li><a href="#" class="activSub">Laptops &amp; Notebooks</a>
                            <ul>
                                <li><a href="#">Macs</a></li>
                                <li><a href="#">Windows</a></li>
                            </ul>
                        </li>
                        <li><a href="#" class="activSub">Components</a>
                            <ul>
                                <li><a href="#">Mice and Trackballs</a></li>
                                <li><a href="#" class="activSub" >Monitors</a>
                                    <ul>
                                        <li><a href="#"  >test 1</a></li>
                                        <li><a href="#"  >test 2</a></li>
                                    </ul>
                                </li>
                                <li><a href="#">Windows</a></li>
                            </ul>
                        </li>
                        <li><a href="#">Tablets</a></li>
                        <li><a href="#">Software</a></li>
                        <li><a href="#">Phones & PDAs</a></li>
                        <li><a href="#">Cameras</a></li>
                        <li><a href="#">MP3 Players</a></li>
                    </ul>
                </div>
            </div>
            <div class="blog">
                <div class="blog-heading">
                    <h3>Latest Blogs</h3>
                </div>
                <div class="blog-inner">
                    <ul id="Latest-blog" class="list-unstyled blog-wrapper">
                        <li class="item blog-slider-item">
                            <div class="panel-default">
                                <div class="blog-image"> <a class="blog-imagelink" href="#"><img src="image/blog/blog_1.jpg" alt="#"></a> </div>
                                <div class="blog-content"> <a class="blog-name" href="#">
                                    <h2>Nunc rutrum scel potent</h2>
                                    </a> <span class="blog-date">06/07/2015</span> </div>
                            </div>
                        </li>
                        <li class="item blog-slider-item">
                            <div class="panel-default">
                                <div class="blog-image"> <a class="blog-imagelink" href="#"><img src="image/blog/blog_2.jpg" alt="#"></a> </div>
                                <div class="blog-content"> <a class="blog-name" href="#">
                                    <h2>Nunc rutrum scel potent</h2>
                                    </a> <span class="blog-date">06/07/2015</span> </div>
                            </div>
                        </li>
                        <li class="item blog-slider-item">
                            <div class="panel-default">
                                <div class="blog-image"> <a class="blog-imagelink" href="#"><img src="image/blog/blog_5.jpg" alt="#"></a> </div>
                                <div class="blog-content"> <a class="blog-name" href="#">
                                    <h2>Nunc rutrum scel potent</h2>
                                    </a> <span class="blog-date">06/07/2015</span> </div>
                            </div>
                        </li>
                        <li class="item blog-slider-item">
                            <div class="panel-default">
                                <div class="blog-image"> <a class="blog-imagelink" href="#"><img src="image/blog/blog_4.jpg" alt="#"></a> </div>
                                <div class="blog-content"> <a class="blog-name" href="#">
                                    <h2>Nunc rutrum scel potent</h2>
                                    </a> <span class="blog-date">06/07/2015</span> </div>
                            </div>
                        </li>
                    </ul>
                    <div class="buttons text-right seeall">
                        <button type="button" onClick="location='blog.html';" class="btn btn-primary">See all Blogs</button>
                    </div>
                </div>
            </div>
            <h3 class="productblock-title">Latest</h3>
            <div class="row latest-grid product-grid">
                <div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 product-grid-item">
                    <div class="product-thumb transition">
                        <div class="image product-imageblock"><a href="product.html"><img src="image/product/1product50x59.jpg" alt="iPod Classic" title="iPod Classic" class="img-responsive" /></a>
                            <div class="button-group">
                                <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List"><i class="fa fa-heart-o"></i></button>
                                <button type="button" class="addtocart-btn">Add to Cart</button>
                                <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                            </div>
                        </div>
                        <div class="caption product-detail">
                            <h4 class="product-name"><a href="#" title="iPod Classic">iPod Classic</a></h4>
                            <p class="price product-price">$122.00<span class="price-tax">Ex Tax: $100.00</span></p>
                            <div class="rating"> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star-o fa-stack-2x"></i></span> </div>
                        </div>
                        <div class="button-group">
                            <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                            <button type="button" class="addtocart-btn" >Add to Cart</button>
                            <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 product-grid-item">
                    <div class="product-thumb transition">
                        <div class="image product-imageblock"><a href="#"><img src="image/product/2product50x59.jpg" alt="iPod Classic" title="iPod Classic" class="img-responsive" /></a>
                            <div class="button-group">
                                <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List"><i class="fa fa-heart-o"></i></button>
                                <button type="button" class="addtocart-btn">Add to Cart</button>
                                <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product"><i class="fa fa-exchange"></i></button>
                            </div>
                        </div>
                        <div class="caption product-detail">
                            <h4 class="product-name"><a href="#" title="iPod Classic">iPod Classic</a></h4>
                            <p class="price product-price">$122.00<span class="price-tax">Ex Tax: $100.00</span></p>
                            <div class="rating"> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star-o fa-stack-2x"></i></span> </div>
                        </div>
                        <div class="button-group">
                            <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                            <button type="button" class="addtocart-btn" >Add to Cart</button>
                            <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 product-grid-item">
                    <div class="product-thumb transition">
                        <div class="image product-imageblock"><a href="#"><img src="image/product/3product50x59.jpg" alt="iPod Classic" title="iPod Classic" class="img-responsive" /></a>
                            <div class="button-group">
                                <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                <button type="button" class="addtocart-btn">Add to Cart</button>
                                <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                            </div>
                        </div>
                        <div class="caption product-detail">
                            <h4 class="product-name"><a href="#" title="iPod Classic">iPod Classic</a></h4>
                            <p class="price product-price">$122.00<span class="price-tax">Ex Tax: $100.00</span></p>
                            <div class="rating"> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star-o fa-stack-2x"></i></span> </div>
                        </div>
                        <div class="button-group">
                            <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                            <button type="button" class="addtocart-btn">Add to Cart</button>
                            <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                        </div>
                    </div>
                </div>
            </div>
            <h3 class="productblock-title">Specials</h3>
            <div class="row special-grid product-grid">
                <div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 product-grid-item">
                    <div class="product-thumb transition">
                        <div class="image product-imageblock"> <a href="#"><img src="image/product/4product50x59.jpg" alt="iPhone" title="iPhone" class="img-responsive" /></a>
                            <div class="button-group">
                                <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                <button type="button" class="addtocart-btn" >Add to Cart</button>
                                <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                            </div>
                        </div>
                        <div class="caption product-detail">
                            <h4 class="product-name"> <a href="product.html" title="iPhone">iPhone</a> </h4>
                            <p class="price product-price"> <span class="price-new">$254.00</span> <span class="price-old">$272.00</span> <span class="price-tax">Ex Tax: $210.00</span> </p>
                        </div>
                        <div class="button-group">
                            <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                            <button type="button" class="addtocart-btn" >Add to Cart</button>
                            <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 product-grid-item">
                    <div class="product-thumb transition">
                        <div class="image product-imageblock"> <a href="#"><img src="image/product/5product50x59.jpg" alt="iPhone" title="iPhone" class="img-responsive" /></a>
                            <div class="button-group">
                                <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                <button type="button" class="addtocart-btn" >Add to Cart</button>
                                <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                            </div>
                        </div>
                        <div class="caption product-detail">
                            <h4 class="product-name"> <a href="product.html" title="iPhone">iPhone</a> </h4>
                            <p class="price product-price"> <span class="price-new">$254.00</span> <span class="price-old">$272.00</span> <span class="price-tax">Ex Tax: $210.00</span> </p>
                        </div>
                        <div class="button-group">
                            <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                            <button type="button" class="addtocart-btn" >Add to Cart</button>
                            <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 product-grid-item">
                    <div class="product-thumb transition">
                        <div class="image product-imageblock"> <a href="#"><img src="image/product/6product50x59.jpg" alt="iPhone" title="iPhone" class="img-responsive" /></a>
                            <div class="button-group">
                                <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                <button type="button" class="addtocart-btn" >Add to Cart</button>
                                <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                            </div>
                        </div>
                        <div class="caption product-detail">
                            <h4 class="product-name"> <a href="product.html" title="iPhone">iPhone</a> </h4>
                            <p class="price product-price"> <span class="price-new">$254.00</span> <span class="price-old">$272.00</span> <span class="price-tax">Ex Tax: $210.00</span> </p>
                        </div>
                        <div class="button-group">
                            <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                            <button type="button" class="addtocart-btn" >Add to Cart</button>
                            <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div id="content" class="col-sm-9">
            <div class="customtab">
                <div id="tabs" class="customtab-wrapper">
                    <ul class='customtab-inner'>
                        <li class='tab'><a href="#tab-latest">Latest</a></li>
                        <li class='tab'><a href="#tab-special">Special</a></li>
                        <li class='tab'><a href="#tab-bestseller">Bestseller</a></li>
                    </ul>
                </div>
                <div id="tab-latest" class="tab-content">
                    <div class="box">
                        <div id="latest-slidertab" class="row owl-carousel product-slider">
                            <div class="item">
                                <div class="product-thumb transition">
                                    <div class="image product-imageblock"> <a href="product.html"><img src="image/product/product1.jpg" alt="iPod Classic" title="iPod Classic" class="img-responsive" /> </a>
                                        <div class="button-group">
                                            <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                            <button type="button" class="addtocart-btn" >Add to Cart</button>
                                            <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                        </div>
                                    </div>
                                    <div class="caption product-detail">
                                        <h4 class="product-name"><a href="#" title="iPod Classic">iPod Classic</a></h4>
                                        <p class="price product-price">$122.00<span class="price-tax">Ex Tax: $100.00</span></p>
                                        <div class="rating"> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star-o fa-stack-2x"></i></span> </div>
                                    </div>
                                    <div class="button-group">
                                        <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                        <button type="button" class="addtocart-btn" >Add to Cart</button>
                                        <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                    </div>
                                </div>
                            </div>
                            <div class="item">
                                <div class="product-thumb transition">
                                    <div class="image product-imageblock"> <a href="product.html"><img src="image/product/product2.jpg" alt="iPod Classic" title="iPod Classic" class="img-responsive" /> </a>
                                        <div class="button-group">
                                            <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                            <button type="button" class="addtocart-btn" >Add to Cart</button>
                                            <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                        </div>
                                    </div>
                                    <div class="caption product-detail">
                                        <h4 class="product-name"><a href="#" title="iPod Classic">iPod Classic</a></h4>
                                        <p class="price product-price">$122.00<span class="price-tax">Ex Tax: $100.00</span></p>
                                        <div class="rating"> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star-o fa-stack-2x"></i></span> </div>
                                    </div>
                                    <div class="button-group">
                                        <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                        <button type="button" class="addtocart-btn" >Add to Cart</button>
                                        <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                    </div>
                                </div>
                            </div>
                            <div class="item">
                                <div class="product-thumb transition">
                                    <div class="image product-imageblock"> <a href="product.html"><img src="image/product/product3.jpg" alt="iPod Classic" title="iPod Classic" class="img-responsive" /> </a>
                                        <div class="button-group">
                                            <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                            <button type="button" class="addtocart-btn" >Add to Cart</button>
                                            <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                        </div>
                                    </div>
                                    <div class="caption product-detail">
                                        <h4 class="product-name"><a href="#" title="iPod Classic">iPod Classic</a></h4>
                                        <p class="price product-price">$122.00<span class="price-tax">Ex Tax: $100.00</span></p>
                                        <div class="rating"> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star-o fa-stack-2x"></i></span> </div>
                                    </div>
                                    <div class="button-group">
                                        <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                        <button type="button" class="addtocart-btn" >Add to Cart</button>
                                        <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                    </div>
                                </div>
                            </div>
                            <div class="item">
                                <div class="product-thumb transition">
                                    <div class="image product-imageblock"> <a href="product.html"><img src="image/product/product4.jpg" alt="iPod Classic" title="iPod Classic" class="img-responsive" /> </a>
                                        <div class="button-group">
                                            <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                            <button type="button" class="addtocart-btn" >Add to Cart</button>
                                            <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                        </div>
                                    </div>
                                    <div class="caption product-detail">
                                        <h4 class="product-name"><a href="#" title="iPod Classic">iPod Classic</a></h4>
                                        <p class="price product-price">$122.00<span class="price-tax">Ex Tax: $100.00</span></p>
                                        <div class="rating"> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star-o fa-stack-2x"></i></span> </div>
                                    </div>
                                    <div class="button-group">
                                        <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                        <button type="button" class="addtocart-btn" >Add to Cart</button>
                                        <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                    </div>
                                </div>
                            </div>
                            <div class="item">
                                <div class="product-thumb transition">
                                    <div class="image product-imageblock"> <a href="product.html"><img src="image/product/product5.jpg" alt="iPod Classic" title="iPod Classic" class="img-responsive" /> </a>
                                        <div class="button-group">
                                            <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                            <button type="button" class="addtocart-btn" >Add to Cart</button>
                                            <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                        </div>
                                    </div>
                                    <div class="caption product-detail">
                                        <h4 class="product-name"><a href="#" title="iPod Classic">iPod Classic</a></h4>
                                        <p class="price product-price">$122.00<span class="price-tax">Ex Tax: $100.00</span></p>
                                        <div class="rating"> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star-o fa-stack-2x"></i></span> </div>
                                    </div>
                                    <div class="button-group">
                                        <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                        <button type="button" class="addtocart-btn" >Add to Cart</button>
                                        <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                    </div>
                                </div>
                            </div>
                            <div class="item">
                                <div class="product-thumb transition">
                                    <div class="image product-imageblock"> <a href="product.html"><img src="image/product/product6.jpg" alt="iPod Classic" title="iPod Classic" class="img-responsive" /> </a>
                                        <div class="button-group">
                                            <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                            <button type="button" class="addtocart-btn" >Add to Cart</button>
                                            <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                        </div>
                                    </div>
                                    <div class="caption product-detail">
                                        <h4 class="product-name"><a href="#" title="iPod Classic">iPod Classic</a></h4>
                                        <p class="price product-price">$122.00<span class="price-tax">Ex Tax: $100.00</span></p>
                                        <div class="rating"> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star-o fa-stack-2x"></i></span> </div>
                                    </div>
                                    <div class="button-group">
                                        <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                        <button type="button" class="addtocart-btn" >Add to Cart</button>
                                        <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- tab-latest-->
                <div id="tab-special" class="tab-content">
                    <div class="box">
                        <div id="special-slidertab" class="row owl-carousel product-slider">
                            <div class="item">
                                <div class="product-thumb transition">
                                    <div class="image product-imageblock"> <a href="product.html"> <img src="image/product/product4.jpg" alt="iPhone" title="iPhone" class="img-responsive" /> </a>
                                        <div class="button-group">
                                            <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                            <button type="button" class="addtocart-btn" >Add to Cart</button>
                                            <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                        </div>
                                    </div>
                                    <div class="caption product-detail">
                                        <h4 class="product-name"><a href="product.html" title="iPhone">iPhone</a></h4>
                                        <p class="price product-price"> <span class="price-new">$254.00</span> <span class="price-old">$272.00</span> <span class="price-tax">Ex Tax: $210.00</span> </p>
                                    </div>
                                    <div class="button-group">
                                        <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                        <button type="button" class="addtocart-btn" >Add to Cart</button>
                                        <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                    </div>
                                </div>
                            </div>
                            <div class="item">
                                <div class="product-thumb transition">
                                    <div class="image product-imageblock"> <a href="product.html"> <img src="image/product/product5.jpg" alt="iPhone" title="iPhone" class="img-responsive" /> </a>
                                        <div class="button-group">
                                            <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                            <button type="button" class="addtocart-btn" >Add to Cart</button>
                                            <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                        </div>
                                    </div>
                                    <div class="caption product-detail">
                                        <h4 class="product-name"><a href="product.html" title="iPhone">iPhone</a></h4>
                                        <p class="price product-price"> <span class="price-new">$254.00</span> <span class="price-old">$272.00</span> <span class="price-tax">Ex Tax: $210.00</span> </p>
                                    </div>
                                    <div class="button-group">
                                        <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                        <button type="button" class="addtocart-btn" >Add to Cart</button>
                                        <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                    </div>
                                </div>
                            </div>
                            <div class="item">
                                <div class="product-thumb transition">
                                    <div class="image product-imageblock"> <a href="product.html"> <img src="image/product/product5.jpg" alt="iPhone" title="iPhone" class="img-responsive" /> </a>
                                        <div class="button-group">
                                            <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                            <button type="button" class="addtocart-btn" >Add to Cart</button>
                                            <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                        </div>
                                    </div>
                                    <div class="caption product-detail">
                                        <h4 class="product-name"><a href="product.html" title="iPhone">iPhone</a></h4>
                                        <p class="price product-price"> <span class="price-new">$254.00</span> <span class="price-old">$272.00</span> <span class="price-tax">Ex Tax: $210.00</span> </p>
                                    </div>
                                    <div class="button-group">
                                        <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                        <button type="button" class="addtocart-btn" >Add to Cart</button>
                                        <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                    </div>
                                </div>
                            </div>
                            <div class="item">
                                <div class="product-thumb transition">
                                    <div class="image product-imageblock"> <a href="product.html"> <img src="image/product/product6.jpg" alt="iPhone" title="iPhone" class="img-responsive" /> </a>
                                        <div class="button-group">
                                            <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                            <button type="button" class="addtocart-btn" >Add to Cart</button>
                                            <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                        </div>
                                    </div>
                                    <div class="caption product-detail">
                                        <h4 class="product-name"><a href="product.html" title="iPhone">iPhone</a></h4>
                                        <p class="price product-price"> <span class="price-new">$254.00</span> <span class="price-old">$272.00</span> <span class="price-tax">Ex Tax: $210.00</span> </p>
                                    </div>
                                    <div class="button-group">
                                        <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                        <button type="button" class="addtocart-btn" >Add to Cart</button>
                                        <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                    </div>
                                </div>
                            </div>
                            <div class="item">
                                <div class="product-thumb transition">
                                    <div class="image product-imageblock"> <a href="product.html"> <img src="image/product/product7.jpg" alt="iPhone" title="iPhone" class="img-responsive" /> </a>
                                        <div class="button-group">
                                            <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                            <button type="button" class="addtocart-btn" >Add to Cart</button>
                                            <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product"><i class="fa fa-exchange"></i></button>
                                        </div>
                                    </div>
                                    <div class="caption product-detail">
                                        <h4 class="product-name"><a href="product.html" title="iPhone">iPhone</a></h4>
                                        <p class="price product-price"> <span class="price-new">$254.00</span> <span class="price-old">$272.00</span> <span class="price-tax">Ex Tax: $210.00</span> </p>
                                    </div>
                                    <div class="button-group">
                                        <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                        <button type="button" class="addtocart-btn" >Add to Cart</button>
                                        <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                    </div>
                                </div>
                            </div>
                            <div class="item">
                                <div class="product-thumb transition">
                                    <div class="image product-imageblock"> <a href="#"> <img src="image/product/product6.jpg" alt="iPhone" title="iPhone" class="img-responsive" /> </a>
                                        <div class="button-group">
                                            <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                            <button type="button" class="addtocart-btn" >Add to Cart</button>
                                            <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                        </div>
                                    </div>
                                    <div class="caption product-detail">
                                        <h4 class="product-name"><a href="product.html" title="iPhone">iPhone</a></h4>
                                        <p class="price product-price"> <span class="price-new">$254.00</span> <span class="price-old">$272.00</span> <span class="price-tax">Ex Tax: $210.00</span> </p>
                                    </div>
                                    <div class="button-group">
                                        <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                        <button type="button" class="addtocart-btn" >Add to Cart</button>
                                        <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- tab-special-->
                <div id="tab-bestseller" class="tab-content">
                    <div class="box">
                        <div id="bestseller-slidertab" class="row owl-carousel product-slider">
                            <div class="item">
                                <div class="product-thumb transition">
                                    <div class="image product-imageblock"> <a href="#"> <img src="image/product/product7.jpg" alt="iPhone" title="iPhone" class="img-responsive" /> </a>
                                        <div class="button-group">
                                            <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                            <button type="button" class="addtocart-btn" >Add to Cart</button>
                                            <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                        </div>
                                    </div>
                                    <div class="caption product-detail">
                                        <h4 class="product-name"><a href="product.html" title="iPhone">iPhone</a></h4>
                                        <p class="price product-price"> <span class="price-new">$254.00</span> <span class="price-old">$272.00</span> <span class="price-tax">Ex Tax: $210.00</span> </p>
                                    </div>
                                    <div class="button-group">
                                        <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                        <button type="button" class="addtocart-btn" >Add to Cart</button>
                                        <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                    </div>
                                </div>
                            </div>
                            <div class="item">
                                <div class="product-thumb transition">
                                    <div class="image product-imageblock"> <a href="product.html"> <img src="image/product/product8.jpg" alt="iPhone" title="iPhone" class="img-responsive" /> </a>
                                        <div class="button-group">
                                            <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                            <button type="button" class="addtocart-btn" >Add to Cart</button>
                                            <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                        </div>
                                    </div>
                                    <div class="caption product-detail">
                                        <h4 class="product-name"><a href="product.html" title="iPhone">iPhone</a></h4>
                                        <p class="price product-price"> <span class="price-new">$254.00</span> <span class="price-old">$272.00</span> <span class="price-tax">Ex Tax: $210.00</span> </p>
                                    </div>
                                    <div class="button-group">
                                        <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                        <button type="button" class="addtocart-btn" >Add to Cart</button>
                                        <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                    </div>
                                </div>
                            </div>
                            <div class="item">
                                <div class="product-thumb transition">
                                    <div class="image product-imageblock"> <a href="product.html"> <img src="image/product/product1.jpg" alt="iPhone" title="iPhone" class="img-responsive" /> </a>
                                        <div class="button-group">
                                            <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                            <button type="button" class="addtocart-btn" >Add to Cart</button>
                                            <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                        </div>
                                    </div>
                                    <div class="caption product-detail">
                                        <h4 class="product-name"><a href="product.html" title="iPhone">iPhone</a></h4>
                                        <p class="price product-price"> <span class="price-new">$254.00</span> <span class="price-old">$272.00</span> <span class="price-tax">Ex Tax: $210.00</span> </p>
                                    </div>
                                    <div class="button-group">
                                        <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                        <button type="button" class="addtocart-btn" >Add to Cart</button>
                                        <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                    </div>
                                </div>
                            </div>
                            <div class="item">
                                <div class="product-thumb transition">
                                    <div class="image product-imageblock"> <a href="product.html"> <img src="image/product/product2.jpg" alt="iPhone" title="iPhone" class="img-responsive" /> </a>
                                        <div class="button-group">
                                            <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                            <button type="button" class="addtocart-btn" >Add to Cart</button>
                                            <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                        </div>
                                    </div>
                                    <div class="caption product-detail">
                                        <h4 class="product-name"><a href="product.html" title="iPhone">iPhone</a></h4>
                                        <p class="price product-price"> <span class="price-new">$254.00</span> <span class="price-old">$272.00</span> <span class="price-tax">Ex Tax: $210.00</span> </p>
                                    </div>
                                    <div class="button-group">
                                        <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                        <button type="button" class="addtocart-btn" >Add to Cart</button>
                                        <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                    </div>
                                </div>
                            </div>
                            <div class="item">
                                <div class="product-thumb transition">
                                    <div class="image product-imageblock"> <a href="product.html"> <img src="image/product/product3.jpg" alt="iPhone" title="iPhone" class="img-responsive" /> </a>
                                        <div class="button-group">
                                            <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                            <button type="button" class="addtocart-btn" >Add to Cart</button>
                                            <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                        </div>
                                    </div>
                                    <div class="caption product-detail">
                                        <h4 class="product-name"><a href="product.html" title="iPhone">iPhone</a></h4>
                                        <p class="price product-price"> <span class="price-new">$254.00</span> <span class="price-old">$272.00</span> <span class="price-tax">Ex Tax: $210.00</span> </p>
                                    </div>
                                    <div class="button-group">
                                        <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                        <button type="button" class="addtocart-btn" >Add to Cart</button>
                                        <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div id="subbanner4" class="banner" >
                    <div class="item"> <a href="#"><img src="image/banners/subbanner4.jpg" alt="Sub Banner4" class="img-responsive" /></a> </div>
                </div>
                <div id="subbanner5" class="banner" >
                    <div class="item"> <a href="#"><img src="image/banners/subbanner5.jpg" alt="Sub Banner5" class="img-responsive" /></a> </div>
                </div>
                <h3 class="productblock-title">Featured</h3>
                <div class="box">
                    <div id="feature-slider" class="row owl-carousel product-slider">
                        <div class="item product-slider-item">
                            <div class="product-thumb transition">
                                <div class="image product-imageblock"> <a href="product.html"> <img src="image/product/product4.jpg" alt="iPhone" title="iPhone" class="img-responsive" /> </a>
                                    <div class="button-group">
                                        <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                        <button type="button" class="addtocart-btn" >Add to Cart</button>
                                        <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                    </div>
                                </div>
                                <div class="caption product-detail">
                                    <h4 class="product-name"><a href="product.html" title="iPhone">iPhone</a></h4>
                                    <p class="price product-price"> <span class="price-new">$254.00</span> <span class="price-old">$272.00</span> <span class="price-tax">Ex Tax: $210.00</span> </p>
                                </div>
                                <div class="button-group">
                                    <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                    <button type="button" class="addtocart-btn" >Add to Cart</button>
                                    <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                </div>
                            </div>
                        </div>
                        <div class="item product-slider-item">
                            <div class="product-thumb transition">
                                <div class="image product-imageblock"> <a href="product.html"> <img src="image/product/product5.jpg" alt="iPhone" title="iPhone" class="img-responsive" /> </a>
                                    <div class="button-group">
                                        <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                        <button type="button" class="addtocart-btn" >Add to Cart</button>
                                        <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                    </div>
                                </div>
                                <div class="caption product-detail">
                                    <h4 class="product-name"><a href="product.html" title="iPhone">iPhone</a></h4>
                                    <p class="price product-price"> <span class="price-new">$254.00</span> <span class="price-old">$272.00</span> <span class="price-tax">Ex Tax: $210.00</span> </p>
                                </div>
                                <div class="button-group">
                                    <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                    <button type="button" class="addtocart-btn" >Add to Cart</button>
                                    <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                </div>
                            </div>
                        </div>
                        <div class="item product-slider-item">
                            <div class="product-thumb transition">
                                <div class="image product-imageblock"> <a href="product.html"> <img src="image/product/product6.jpg" alt="iPhone" title="iPhone" class="img-responsive" /> </a>
                                    <div class="button-group">
                                        <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                        <button type="button" class="addtocart-btn" >Add to Cart</button>
                                        <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                    </div>
                                </div>
                                <div class="caption product-detail">
                                    <h4 class="product-name"><a href="product.html" title="iPhone">iPhone</a></h4>
                                    <p class="price product-price"> <span class="price-new">$254.00</span> <span class="price-old">$272.00</span> <span class="price-tax">Ex Tax: $210.00</span> </p>
                                </div>
                                <div class="button-group">
                                    <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                    <button type="button" class="addtocart-btn" >Add to Cart</button>
                                    <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                </div>
                            </div>
                        </div>
                        <div class="item product-slider-item">
                            <div class="product-thumb transition">
                                <div class="image product-imageblock"> <a href="#"> <img src="image/product/product7.jpg" alt="iPhone" title="iPhone" class="img-responsive" /> </a>
                                    <div class="button-group">
                                        <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                        <button type="button" class="addtocart-btn" >Add to Cart</button>
                                        <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                    </div>
                                </div>
                                <div class="caption product-detail">
                                    <h4 class="product-name"><a href="product.html" title="iPhone">iPhone</a></h4>
                                    <p class="price product-price"> <span class="price-new">$254.00</span> <span class="price-old">$272.00</span> <span class="price-tax">Ex Tax: $210.00</span> </p>
                                </div>
                                <div class="button-group">
                                    <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                    <button type="button" class="addtocart-btn" >Add to Cart</button>
                                    <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                </div>
                            </div>
                        </div>
                        <div class="item product-slider-item">
                            <div class="product-thumb transition">
                                <div class="image product-imageblock"> <a href="#"> <img src="image/product/product8.jpg" alt="iPhone" title="iPhone" class="img-responsive" /> </a>
                                    <div class="button-group">
                                        <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                        <button type="button" class="addtocart-btn" >Add to Cart</button>
                                        <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                    </div>
                                </div>
                                <div class="caption product-detail">
                                    <h4 class="product-name"><a href="product.html" title="iPhone">iPhone</a></h4>
                                    <p class="price product-price"> <span class="price-new">$254.00</span> <span class="price-old">$272.00</span> <span class="price-tax">Ex Tax: $210.00</span> </p>
                                </div>
                                <div class="button-group">
                                    <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                    <button type="button" class="addtocart-btn" >Add to Cart</button>
                                    <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                </div>
                            </div>
                        </div>
                        <div class="item product-slider-item">
                            <div class="product-thumb transition">
                                <div class="image product-imageblock"> <a href="#"> <img src="image/product/product1.jpg" alt="iPhone" title="iPhone" class="img-responsive" /> </a>
                                    <div class="button-group">
                                        <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                        <button type="button" class="addtocart-btn" >Add to Cart</button>
                                        <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                    </div>
                                </div>
                                <div class="caption product-detail">
                                    <h4 class="product-name"><a href="product.html" title="iPhone">iPhone</a></h4>
                                    <p class="price product-price"> <span class="price-new">$254.00</span> <span class="price-old">$272.00</span> <span class="price-tax">Ex Tax: $210.00</span> </p>
                                </div>
                                <div class="button-group">
                                    <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                                    <button type="button" class="addtocart-btn" >Add to Cart</button>
                                    <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="blog">
                    <div class="blog-heading">
                        <h3>Latest Blogs</h3>
                    </div>
                    <div class="blog-inner box">
                        <ul class="list-unstyled blog-wrapper" id="latest-blog">
                            <li class="item blog-slider-item">
                                <div class="panel-default">
                                    <div class="blog-image"> <a href="#" class="blog-imagelink"><img src="image/blog/blog_1.jpg" alt="#"></a> <span class="blog-hover"></span> <span class="blog-date">06/07/2015</span> <span class="blog-readmore-outer"><a href="#" class="blog-readmore">read more</a></span> </div>
                                    <div class="blog-content"> <a href="#" class="blog-name">
                                        <h2>Nunc rutrum scel potent</h2>
                                        </a>
                                        <div class="blog-desc">Lorem ipsum doLorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna.Lorem ipsum doLorem ipsum dolor sit amet, consectetur adipisicing...</div>
                                        <a href="#" class="blog-readmore">read more</a> <span class="blog-date">06/07/2015</span> </div>
                                </div>
                            </li>
                            <li class="item blog-slider-item">
                                <div class="panel-default">
                                    <div class="blog-image"> <a href="#" class="blog-imagelink"><img src="image/blog/blog_2.jpg" alt="#"></a> <span class="blog-hover"></span> <span class="blog-date">06/07/2015</span> <span class="blog-readmore-outer"><a href="#" class="blog-readmore">read more</a></span> </div>
                                    <div class="blog-content"> <a href="#" class="blog-name">
                                        <h2>Nunc rutrum scel potent</h2>
                                        </a>
                                        <div class="blog-desc">Lorem ipsum doLorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna.Lorem ipsum doLorem ipsum dolor sit amet, consectetur adipisicing...</div>
                                        <a href="singale-blog.html" class="blog-readmore">read more</a> <span class="blog-date">06/07/2015</span> </div>
                                </div>
                            </li>
                            <li class="item blog-slider-item">
                                <div class="panel-default">
                                    <div class="blog-image"> <a href="#" class="blog-imagelink"><img src="image/blog/blog_3.jpg" alt="#"></a> <span class="blog-hover"></span> <span class="blog-date">06/07/2015</span> <span class="blog-readmore-outer"><a href="singale-blog.html" class="blog-readmore">read more</a></span> </div>
                                    <div class="blog-content"> <a href="#" class="blog-name">
                                        <h2>Nunc rutrum scel potent</h2>
                                        </a>
                                        <div class="blog-desc">Lorem ipsum doLorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna.Lorem ipsum doLorem ipsum dolor sit amet, consectetur adipisicing...</div>
                                        <a href="singale-blog.html" class="blog-readmore">read more</a> <span class="blog-date">06/07/2015</span> </div>
                                </div>
                            </li>
                            <li class="item blog-slider-item">
                                <div class="panel-default">
                                    <div class="blog-image"> <a href="#" class="blog-imagelink"><img src="image/blog/blog_4.jpg" alt="#"></a> <span class="blog-hover"></span> <span class="blog-date">06/07/2015</span> <span class="blog-readmore-outer"><a href="#" class="blog-readmore">read more</a></span> </div>
                                    <div class="blog-content"> <a href="#" class="blog-name">
                                        <h2>Nunc rutrum scel potent</h2>
                                        </a>
                                        <div class="blog-desc">Lorem ipsum doLorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna.Lorem ipsum doLorem ipsum dolor sit amet, consectetur adipisicing...</div>
                                        <a href="#" class="blog-readmore">read more</a> <span class="blog-date">06/07/2015</span> </div>
                                </div>
                            </li>
                            <li class="item blog-slider-item">
                                <div class="panel-default">
                                    <div class="blog-image"> <a href="#" class="blog-imagelink"><img src="image/blog/blog_5.jpg" alt="#"></a> <span class="blog-hover"></span> <span class="blog-date">06/07/2015</span> <span class="blog-readmore-outer"><a href="#" class="blog-readmore">read more</a></span> </div>
                                    <div class="blog-content"> <a href="#" class="blog-name">
                                        <h2>Nunc rutrum scel potent</h2>
                                        </a>
                                        <div class="blog-desc">Lorem ipsum doLorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna.Lorem ipsum doLorem ipsum dolor sit amet, consectetur adipisicing...</div>
                                        <a href="#" class="blog-readmore">read more</a> <span class="blog-date">06/07/2015</span> </div>
                                </div>
                            </li>
                        </ul>
                        <div class="buttons text-right seeall">
                            <button class="btn btn-primary" onClick="location='blog.html';" type="button">See all Blogs</button>
                        </div>
                    </div>
                </div>
            </div>
            <div id="brand_carouse" class="owl-carousel brand-logo">
                <div class="item text-center"> <a href="#"><img src="image/brand/brand1.png" alt="Disney" class="img-responsive" /></a> </div>
                <div class="item text-center"> <a href="#"><img src="image/brand/brand2.png" alt="Dell" class="img-responsive" /></a> </div>
                <div class="item text-center"> <a href="#"><img src="image/brand/brand3.png" alt="Harley" class="img-responsive" /></a> </div>
                <div class="item text-center"> <a href="#"><img src="image/brand/brand4.png" alt="Canon" class="img-responsive" /></a> </div>
                <div class="item text-center"> <a href="#"><img src="image/brand/brand5.png" alt="Canon" class="img-responsive" /></a> </div>
                <div class="item text-center"> <a href="#"><img src="image/brand/brand6.png" alt="Canon" class="img-responsive" /></a> </div>
                <div class="item text-center"> <a href="#"><img src="image/brand/brand7.png" alt="Canon" class="img-responsive" /></a> </div>
                <div class="item text-center"> <a href="#"><img src="image/brand/brand8.png" alt="Canon" class="img-responsive" /></a> </div>
                <div class="item text-center"> <a href="#"><img src="image/brand/brand9.png" alt="Canon" class="img-responsive" /></a> </div>
                <div class="item text-center"> <a href="#"><img src="image/brand/brand5.png" alt="Canon" class="img-responsive" /></a> </div>
            </div>
        </div>
    </div>
</div>
<footer>
    <div class="container">
        <div class="footer-top-cms">
            <div class="footer-logo"> <a href="#"><img alt="index.html" src="image/logo-footer.png"></a> </div>
            <div class="footer-desc"> <span>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. </span> </div>
            <div class="footer-social">
                <h5>Social</h5>
                <ul>
                    <li class="facebook"><a href="#"><i class="fa fa-facebook"></i></a></li>
                    <li class="linkedin"><a href="#"><i class="fa fa-linkedin"></i></a></li>
                    <li class="twitter"><a href="#"><i class="fa fa-twitter"></i></a></li>
                    <li class="gplus"><a href="#"><i class="fa fa-google-plus"></i></a></li>
                    <li class="youtube"><a href="#"><i class="fa fa-youtube-play"></i></a></li>
                </ul>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-3 footer-block">
                <h5 class="footer-title">Information</h5>
                <ul class="list-unstyled ul-wrapper">
                    <li><a href="about-us.html">About Us</a></li>
                    <li><a href="checkout.html">Delivery Information</a></li>
                    <li><a href="#">Privacy Policy</a></li>
                    <li><a href="#">Terms &amp; Conditions</a></li>
                </ul>
            </div>
            <div class="col-sm-3 footer-block">
                <h5 class="footer-title">Customer Service</h5>
                <ul class="list-unstyled ul-wrapper">
                    <li><a href="contact.html">Contact Us</a></li>
                    <li><a href="#">Returns</a></li>
                    <li><a href="#">Site Map</a></li>
                    <li><a href="#">Wish List</a></li>
                </ul>
            </div>
            <div class="col-sm-3 footer-block">
                <h5 class="footer-title">Extras</h5>
                <ul class="list-unstyled ul-wrapper">
                    <li><a href="#">Brands</a></li>
                    <li><a href="gift.html">Gift Vouchers</a></li>
                    <li><a href="affiliate.html">Affiliates</a></li>
                    <li><a href="#">Specials</a></li>
                </ul>
            </div>
            <div class="col-sm-3 footer-block">
                <div class="content_footercms_right">
                    <div class="footer-contact">
                        <h5 class="contact-title footer-title">Contact Us</h5>
                        <ul class="ul-wrapper">
                            <li><i class="fa fa-map-marker"></i><span class="location2"> Warehouse & Offices,<br>
                                12345 Street name, California<br>
                                USA</span></li>
                            <li><i class="fa fa-envelope"></i><span class="mail2"><a href="#">info@localhost.com</a></span></li>
                            <li><i class="fa fa-mobile"></i><span class="phone2">+ 0987-654-321</span></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <a id="scrollup">Scroll</a> </footer>
<div class="footer-bottom">
    <div class="container">
        <div class="copyright">Powered By<a class="yourstore" href="http://www.lionode.com/">lionode &copy; 2016 </a> </div>
        <div class="footer-bottom-cms">
            <div class="footer-payment">
                <ul>
                    <li class="mastero"><a href="#"><img alt="" src="image/payment/mastero.jpg"></a></li>
                    <li class="visa"><a href="#"><img alt="" src="image/payment/visa.jpg"></a></li>
                    <li class="currus"><a href="#"><img alt="" src="image/payment/currus.jpg"></a></li>
                    <li class="discover"><a href="#"><img alt="" src="image/payment/discover.jpg"></a></li>
                    <li class="bank"><a href="#"><img alt="" src="image/payment/bank.jpg"></a></li>
                </ul>
            </div>
        </div>
    </div>
</div>
</body>
</html>

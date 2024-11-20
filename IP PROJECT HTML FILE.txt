<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Online Food Shopping</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="style.css">
    <style>
        /* Initially hide the dynamic content sections */
        #product-details, #about-section, #contact-section, #products, #cart {
            display: none;
            color:white;
        }
        .product-image {
            max-height: 1000px;
            object-fit: cover;
        }
        .hero {
            background-size: cover;
            background-position: center;
        }
        .products .card {
            margin-bottom: 100px;
        }
        .cart{
            color:white;
        }
        .hero-section {
            position: relative;
            display: flex;
            justify-content: center;
            align-items: center;
            text-align: center;
            height: 600px;
            color: dark;
        }
    </style>
</head>
<body>

    <!-- Navigation Bar -->
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">FoodShop</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="#" onclick="showSection('home')">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#" onclick="showSection('products')">Products</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#" onclick="showSection('about-section')">About</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#" onclick="showSection('contact-section')">Contact</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#" onclick="showSection('cart')">Cart</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- Home Section -->
    <section id="home" class="hero-section text-white text-center py-5" style="background-image: url('homepage.jpg');">
        <div class="container">
            <h1><b>WELCOME TO OUR FOODSHOP FOODIE'S DELIGHT</b></h1><br>      
            <h2>Your one-stop shop for fresh food delivered to your door!</h2><br><br>     
            <a href="#" class="btn btn-light btn-lg" onclick="showSection('products')">Shop Now</a>
        </div>
    </section>

    <!-- Product Section -->
<section id="products" class="hero-section " style="background-image: url('product.jpg'); background-size: cover; background-position: center; height: 900px; position: relative;">     
         
    <div class="container">
        <h2 class="text-center mb-4">Our Featured Products</h2>
        <div class="row">
            <!-- Product 1: Biryani -->
            <div class="col-md-4">
                <div class="card">
                    
                    <div class="card-body text-primary">
					<img src="briyani.jpg" alt="briyani">
                        <h5 class="card-title"> Chicken Briyani</h5>
                        <p class="card-text">Cost: 100</p>
                        <p class="card-text">Quantity:</p>
						<select id="quantity-biryani" class="form-select">
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                </select>
                        <a href="#" class="btn btn-secondary" onclick="addToCart('Biryani','300','2')">Add to Cart</a>
                    </div>
                </div>
            </div>

            <!-- Product 2: Parotta -->
            <div class="col-md-4">
                <div class="card">
                    
                    <div class="card-body text-primary"" >
					<img src="pic.jpeg" alt="pic" >
                        <h5 class="card-title">Parotta</h5>
                        <p class="card-text">Cost: 30</p>
                        <p class="card-text">Quantity:</p>
						<select id="quantity-parotta" class="form-select">
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                </select>
                        <a href="#" class="btn btn-secondary" onclick="addToCart('Parotta', '50', '5 pcs')">Add to Cart</a>
                    </div>
                </div>
            </div>

            <!-- Product 3: Dosa -->
            <div class="col-md-4">
                <div class="card">
                    
                    <div class="card-body text-primary">
					<img src="dosa.jpg" alt="dosa">
                        <h5 class="card-title">Dosa</h5>
                        <p class="card-text">Cost: 30</p>
                        <p class="card-text">Quantity: </p>
						<select id="quantity-dosa" class="form-select">
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                </select>
                        <a href="#" class="btn btn-secondary" onclick="addToCart('Dosa', '60', '2 pcs')">Add to Cart</a>
                    </div>
                </div>
            </div>

            <!-- Product 4: Pongal -->
            <div class="col-md-4 mt-4">
                <div class="card">
                   
                    <div class="card-body text-primary"">
					<img src="pongal.jpeg" alt="pongal">
                        <h5 class="card-title">Pongal</h5>
                        <p class="card-text">Cost: 50</p>
                        <p class="card-text">Quantity:</p>
						<select id="quantity-pongal" class="form-select">
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                </select>
                        <a href="#" class="btn btn-secondary" onclick="addToCart('Pongal', '50', '500g')">Add to Cart</a>
                    </div>
                </div>
            </div>

            <!-- Product 5: Pani Poori -->
            <div class="col-md-4 mt-4">
                <div class="card">
                   
                    <div class="card-body text-primary">
					<img src="poori.jpeg" alt="poori">
                        <h5 class="card-title">Pani Poori</h5>
                        <p class="card-text">Cost: 30</p>
                        <p class="card-text">Quantity:</p>
						<select id="quantity-panipoori" class="form-select">
                                    <option value="1">5pcs</option>
                                    <option value="2">10pcs</option>
                                    <option value="3">15pcs</option>
                                </select>
                        <a href="#" class="btn btn-secondary" onclick="addToCart('Pani Poori', '40', '10 pcs')">Add to Cart</a>
                    </div>
                </div>
            </div>

            <!-- Product 6: Gulab Jamun (Sweet) -->
            <div class="col-md-4 mt-4">
                <div class="card">
                   
                    <div class="card-body text-primary">
					<img src="gulab.jpeg" alt="gulab">
                        <h5 class="card-title">Gulab Jamun</h5>
                        <p class="card-text">Cost:40</p>
                        <p class="card-text">Quantity:</p>
						<select id="quantity-gulabjamun" class="form-select">
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                </select>
                        <a href="#" class="btn btn-secondary" onclick="addToCart('Gulab Jamun', '180', '6 pcs')">Add to Cart</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>


    <!-- Product Details Section -->
    <section id="product-details" class="py-5" style="display:none;">
        <div class="container">
            <h2>Product Details</h2>
            <div class="row">
                <div class="col-md-6">
                    <img id="product-image" src="" alt="Product Image" class="img-fluid">
                </div>
                <div class="col-md-6">
                    <p id="product-info"></p>
                </div>
            </div>
        </div>
    </section>

    <!-- About Section -->
    <section id="about-section" class="hero-section" style="background-image: url('about.jpg');">
        <div class="container">
            <h1><b>About Our Shop<b></h1><br><br>
            <h2>Welcome to <strong>Foodie's Delight</strong>, located in the heart of the city, Chennai. We offer fresh, organic, and delicious food items at affordable prices. Currently, we have a <strong>30% discount</strong> on all items for first-time customers. Visit us from <strong>9 AM to 9 PM, Monday to Saturday</strong>.</h2>
        </div>
    </section>

   <!-- Contact Section -->
<section id="contact-section" class="hero-section" style="background-image: url('contact.jpg'); background-size: cover; background-position: center; height: 900px; position: relative;">     
    <div class="container"><br>
        <h2>Contact Us</h2>
        <form action="process.php" method="POST">
            <div class="row mb-3">
                <label for="name" class="col-sm-2 col-form-label">Your Name</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="name" name="name" placeholder="Enter your name" required>
                </div>
            </div><br>
            <div class="row mb-3">
                <label for="email" class="col-sm-2 col-form-label">Your Email</label>
                <div class="col-sm-10">
                    <input type="email" class="form-control" id="email" name="email" placeholder="Enter your email" required>
                </div>
            </div><br>
            <div class="row mb-3">
                <label for="phone" class="col-sm-2 col-form-label">Phone Number</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="phoneno" name="phoneno" placeholder="Enter your phone number" required>
                </div>
            </div><br>
            <div class="row mb-3">
                <label for="address" class="col-sm-2 col-form-label">Address</label>
                <div class="col-sm-10">
                    <textarea class="form-control" id="address" name="address" rows="2" placeholder="Your address" required></textarea>
                </div>
            </div><br>
            <div class="row mb-3">
                <label for="product" class="col-sm-2 col-form-label">Product</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="product" name="product" placeholder="Enter product name" required>
                </div>
            </div><br>
            <div class="row mb-3">
                <label for="quantity" class="col-sm-2 col-form-label">Quantity</label>
                <div class="col-sm-10">
                    <input type="number" class="form-control" id="quantity" name="quantity" placeholder="Enter quantity" required>
                </div>
            </div><br>
            <div class="row mb-3">
                <label for="cost" class="col-sm-2 col-form-label">Cost</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="cost" name="cost" placeholder="Enter cost" required>
                </div>
            </div>
            <button type="submit" class="btn btn-primary">place order</button><br>
        </form>
    </div>
</section>


            </form>
        </div>
    </section>

    <!-- Cart Section -->
    <section id="cart" class="hero-section" style="background-image: url('paage.jpg');">
        <div class="container">
            <h2 class="text-white">Your Cart</h2>
            <form id="cart-form">
                <ul id="cart-items" class="list-group mb-4"></ul><br><br><br>
				<h1>THANK YOU FOR THE PURCHASE<h1>
           
            </form>
        </div>
    </section>

    <!-- Footer -->
    <footer class="bg-dark text-white text-center py-3">
        <p>&copy; 2024 Foodie's Delight. All Rights Reserved.</p>
    </footer>

    <!-- JavaScript Logic -->
    <script>
        function showSection(sectionId) {
            // Hide all sections
            document.querySelectorAll('section').forEach(section => {
                section.style.display = 'none';
            });
            // Show the selected section
            document.getElementById(sectionId).style.display = 'block';
        }

        function addToCart(productName, productPrice, productQuantity) {
            const cartItems = document.getElementById('cart-items');
            const listItem = document.createElement('li');
            listItem.innerHTML = `${productName} - ₹${productPrice} - Quantity: ${productQuantity}`;
            cartItems.appendChild(listItem);
            alert(`${productName} has been added to the cart.`);
        }

        // Show home section on load
        window.onload = () => {
            showSection('home');
        };
    </script>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>

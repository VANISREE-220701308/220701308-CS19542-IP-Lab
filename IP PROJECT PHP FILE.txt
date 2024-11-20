<?php
// Database connection settings
$servername = "localhost:3307";
$username = "root";  // Replace with your MySQL username
$password = "";      // Replace with your MySQL password
$dbname = "php4";

// Create connection
 $con = mysqli_connect("localhost:3307", "root", "", "php4");
// Check connection
if ($con->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Collect form data
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $name = $_POST['name'];
    $email = $_POST['email'];
    $phoneno = $_POST['phoneno'];
    $address = $_POST['address'];
    $product = $_POST['product'];
    $quantity = $_POST['quantity'];
    $cost = $_POST['cost'];

    // Prepare the SQL statement
    $sql = "INSERT INTO contacts (name, email, phoneno, address, product, quantity, cost)
            VALUES ('$name', '$email', '$phoneno', '$address', '$product', '$quantity', '$cost')";

    if ($con->query($sql) === TRUE) {
        echo "Order Placed Successfully!";
    } else {
        echo "Error: " . $sql . "<br>" . $con->error;
    }
}

// Close connection
$con->close();
?>

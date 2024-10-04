<?php


if (!isset($_POST['submit'])) {
    // Retrieving form data safely
    $CID = $_POST['CID'];
    $CNAME = $_POST['CNAME'];
    $CEMAIL = $_POST['CEMAIL'];
    $CPHONE = $_POST['CPHONE'];
	$CADDRESS = $_POST['CADDRESS'];

    // Database connection
    $con = mysqli_connect("localhost:3307", "root", "", "php");

    // Check connection
    if (!$con) {
        die("Connection failed: " . mysqli_connect_error());
    }

    // Correct SQL query with proper quotes
    $sql = "INSERT INTO customers (CID, CNAME, CEMAIL, CPHONE,CADDRESS) VALUES ('$CID', '$CNAME', '$CEMAIL', '$CPHONE','$CADDRESS')";

    // Executing the query
    $result = mysqli_query($con, $sql);

    // Check if insertion was successful
    if ($result) {
        echo "Inserted Successfully";
    } else {
        echo "Not inserted: " . mysqli_error($con); // Output error if any
    }

    // Close connection
    mysqli_close($con);
} else {
    echo "Form not submitted.";
}
?>

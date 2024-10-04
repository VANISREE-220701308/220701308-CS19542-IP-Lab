<?php


if (!isset($_POST['submit'])) {
    // Retrieving form data safely
    $ANO = $_POST['ANO'];
    $ATYPE = $_POST['ATYPE'];
    $BALANCE = $_POST['BALANCE'];
    $CID = $_POST['CID'];

    // Database connection
    $con = mysqli_connect("localhost:3307", "root", "", "php");

    // Check connection
    if (!$con) {
        die("Connection failed: " . mysqli_connect_error());
    }

    // Correct SQL query with proper quotes
    $sql = "INSERT INTO accounts (ANO, ATYPE, BALANCE, CID) VALUES ('$ANO', '$ATYPE', '$BALANCE', '$CID')";

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


<?php
// Check if form is submitted for updating data
if (isset($_POST['update'])) {
    // Database connection
    $con = mysqli_connect("localhost:3307", "root", "", "php2");
	
	// Check connection
    if (!$con) {
        die("Connection failed: " . mysqli_connect_error());
    }

    // Get form data
    $EmpID = $_POST['EmpID'];
    $Name = $_POST['Name'];
    $Designation = $_POST['Designation'];
    $Salary = $_POST['Salary'];
    $DOJ = $_POST['DOJ'];

    // SQL query to update employee data
    $sql = "UPDATE employees SET Name='$Name', Designation='$Designation', Salary='$Salary', DOJ='$DOJ' WHERE EmpID='$EmpID'";

    // Execute the query
    if (mysqli_query($con, $sql)) {
        echo "Record updated successfully.";
    } else {
        echo "Error updating record: " . mysqli_error($con);
    }

    // Close connection
    mysqli_close($con);
}
?>




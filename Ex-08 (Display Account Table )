<?php
// Database connection
$con = mysqli_connect("localhost:3307", "root", "", "php");

// Check connection
if (!$con) {
    die("Connection failed: " . mysqli_connect_error());
}

// SQL query to fetch ANO, ATYPE, and BALANCE columns from accounts table
$sql = "SELECT * FROM accounts";
$result = mysqli_query($con, $sql);

// Check if there are any results
if (mysqli_num_rows($result) > 0) {
    // Start HTML table
    echo "<table border='1'>
            <tr>
                <th> ANO</th>
                <th>ATYPE</th>
                <th>BALANCE</th>
				<th>CID</th>
            </tr>";

    // Fetch and display each row of data
    while ($row = mysqli_fetch_assoc($result)) {
        echo "<tr>
                <td>" . $row['ANO'] . "</td>
                <td>" . $row['ATYPE'] . "</td>
                <td>" . $row['BALANCE'] . "</td>
				<td>" . $row['CID'] . "</td>
              </tr>";
    }

    // End HTML table
    echo "</table>";
} else {
    echo "No data found in the accounts table.";
}

// Close connection
mysqli_close($con);
?>

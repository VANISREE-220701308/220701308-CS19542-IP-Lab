<html>
<head>
    <title>Employees Form</title>
</head>
<body>

<h2>Update Employee Details</h2>
<form method="POST" action="update.php">
    <label for="EmpID">EmpID:</label>
    <input type="text" name="EmpID" required><br><br>

    <label for="Name">Name:</label>
    <input type="text" name="Name" required><br><br>

    <label for="Designation">Designation:</label>
    <input type="text" name="Designation" required><br><br>

    <label for="Salary">Salary:</label>
    <input type="text" name="Salary" required><br><br>

    <label for="DOJ">DOJ:</label>
    <input type="date" name="DOJ" required><br><br>

    <input type="submit" name="update" value="Update Employee">
</form>
</body>
</html>
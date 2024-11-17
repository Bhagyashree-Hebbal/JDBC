<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>E-commerce Form</title>
<!-- Bootstrap CSS -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center">E-commerce Form</h1>
        <form action="send" method="post">
            <div class="form-group">
                <label for="productId">Product Id</label>
                <input type="number" class="form-control" id="productId" name="productId" required>
            </div>
            <div class="form-group">
                <label for="productName">Product Name</label>
                <input type="text" class="form-control" id="productName" name="productName" required>
            </div>
            <div class="form-group">
                <label for="productType">Product Type</label>
                <input type="text" class="form-control" id="productType" name="productType" required>
            </div>
            <div class="form-group">
                <label for="price">Price</label>
                <input type="number" class="form-control" id="price" name="price" required>
            </div>
            <div class="form-group">
                <label for="customerId">Customer Id</label>
                <input type="number" class="form-control" id="customerId" name="customerId" required>
            </div>
            <div class="form-group">
                <label for="customerName">Customer Name</label>
                <input type="text" class="form-control" id="customerName" name="customerName" required>
            </div>
            <button type="submit" class="btn btn-primary btn-block">Order</button>
        </form>
    </div>

    <!-- Bootstrap JS and dependencies (Optional, if you want to add JS functionality) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

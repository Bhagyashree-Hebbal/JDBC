<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>App</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f7f7f7;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }
    h1 {
        text-align: center;
        color: #333;
    }
    form {
        background-color: #fff;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        width: 300px;
    }
    label {
        display: block;
        margin-bottom: 5px;
        color: #666;
    }
    input[type="text"], input[type="email"], input[type="name"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 10px;
        border: 1px solid #ccc;
        border-radius: 5px;
    }
    input[type="submit"] {
        width: 100%;
        padding: 10px;
        border: none;
        border-radius: 5px;
        background-color: #5cb85c;
        color: white;
        font-size: 16px;
        cursor: pointer;
    }
    input[type="submit"]:hover {
        background-color: #4cae4c;
    }
    .error {
        color: red;
        font-size: 12px;
    }
</style>
</head>
<body>
    <div>
        <h1>Application Form</h1>
        <form action="submit" method="post">
            <div>
                <label>Name</label>
                <input type="name" name="name" required="required">
                <span class="error" id="nameError"></span>
            </div>
            <div>
                <label>Last Name</label>
                <input type="text" name="lastName" required="required">
                <span class="error" id="lastNameError"></span>
            </div>
            <div>
                <label>Email</label>
                <input type="email" name="email" required="required">
                <span class="error" id="emailError"></span>
            </div>
            <div>
                <label>Address</label>
                <input type="text" name="address" required="required">
                <span class="error" id="addressError"></span>
            </div>
            <input type="submit" value="Submit">
        </form>
    </div>
</body>
</html>

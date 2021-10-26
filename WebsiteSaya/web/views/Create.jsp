<%-- 
    Document   : Create
    Created on : Jul 13, 2021, 5:06:50 PM
    Author     : Ghufran Tripa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link ref="stylesheet" href="https://maxcdn.bootstrap.cdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQlacWXA+056RXPxPg6fy4IWvTNh0E2"
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="co1-md-12 mt-5 mt-3">
                    <h3> from create data</h3>
                    <form role="form" action="CreateProduct" method="POST">
                        <div class="form-group">
                            <label>name</label>
                            <input class="form-control" name="name" type="text" required />
                        </div>
                        <div class="form-group">
                            <label>type</label>
                            <select class="form-control" name="type">
                                <option value="makanan & Minuman"> makanan dan minuman </option>
                                <option value="produk kecantikan"> produk kecantikan </option>
                            </select>
                        </div>
                        
                        <div class="form-group">
                            <label>price</label>
                            <input class="form-control" name="price" type="number" min="0" required />
                        </div>
                    </form>
                </div>
            </div>
        </div>
        
    </body>
</html>

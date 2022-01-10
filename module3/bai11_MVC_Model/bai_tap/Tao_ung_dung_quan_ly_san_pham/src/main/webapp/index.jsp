<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/1/2022
  Time: 3:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>Bootstrap CRUD Data Table for Database with Modal Form</title>
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="./css/productManagement.css">
  <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
  <script src="js/productManagement.js"></script>
</head>
<body>
<div class="container-xl">
  <div class="table-responsive">
    <div class="table-wrapper">
      <div class="table-title">
        <div class="row">
          <div class="col-md-3 col-sm-6">
            <h2>Manage <b>Employees</b></h2>
          </div>
          <div class="col-md-5">
            <form action="?action=search" method="post">
              <input name="search">
              <button>Search</button>
            </form>
          </div>
          <div class="col-md-4 col-sm-6">
            <a href="#addEmployeeModal" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Add New Employee</span></a>
            <a href="#deleteEmployeeModal" class="btn btn-danger" data-toggle="modal"><i class="material-icons">&#xE15C;</i> <span>Delete</span></a>
          </div>
        </div>
      </div>
      <table class="table table-striped table-hover">
        <thead>
        <tr>
          <th>
							<span class="custom-checkbox">
								<input type="checkbox" id="selectAll">
								<label for="selectAll"></label>
							</span>
          </th>
          <th>Id</th>
          <th>Name</th>
          <th>Price</th>
          <th>Description</th>
          <th>Manufacture</th>
          <th>Action</th>
        </tr>
        </thead>
        <c:forEach var="product" items="${products}">
          <tbody>
          <tr>
            <td>
							<span class="custom-checkbox">
								<input type="checkbox" id="checkbox1" name="options[]" value="1">
								<label for="checkbox1"></label>
							</span>
            </td>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.description}</td>
            <td>${product.manufacture}</td>
            <td>
              <a href="#editEmployeeModal" class="edit" data-toggle="modal"
                 data-id="${product.id}"
                 data-name="${product.name}"
                 data-price="${product.price}"
                 data-description="${product.description}"
                 data-manufacture="${product.manufacture}"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
              <a href="#deleteEmployeeModal" class="delete" data-id="${product.id}" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
            </td>
          </tr>
          </tbody>
        </c:forEach>
      </table>
      <div class="clearfix">
        <div class="hint-text">Showing <b>${products.size()}</b> out of <b>${products.size()}</b> products</div>
<%--        <ul class="pagination">--%>
<%--          <li class="page-item disabled"><a href="#">Previous</a></li>--%>
<%--          <li class="page-item"><a href="#" class="page-link">1</a></li>--%>
<%--          <li class="page-item"><a href="#" class="page-link">2</a></li>--%>
<%--          <li class="page-item active"><a href="#" class="page-link">3</a></li>--%>
<%--          <li class="page-item"><a href="#" class="page-link">4</a></li>--%>
<%--          <li class="page-item"><a href="#" class="page-link">5</a></li>--%>
<%--          <li class="page-item"><a href="#" class="page-link">Next</a></li>--%>
<%--        </ul>--%>
      </div>
    </div>
  </div>
</div>
<!-- Add Modal HTML -->
<div id="addEmployeeModal" class="modal fade">
  <div class="modal-dialog">
    <div class="modal-content">
      <form action="/product?action=create" method="post">
        <div class="modal-header">
          <h4 class="modal-title">Add Product</h4>
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        </div>
        <div class="modal-body">
          <div class="form-group">
            <input type="text" name="id" value="0" class="form-control" hidden>
          </div>
          <div class="form-group">
            <label>Name</label>
            <input type="text" name="name" class="form-control" required>
          </div>
          <div class="form-group">
            <label>Price</label>
            <input type="text" name="price" class="form-control" required>
          </div>
          <div class="form-group">
            <label>Description</label>
            <textarea class="form-control" name="description" required></textarea>
          </div>
          <div class="form-group">
            <label>Manufacture</label>
            <input type="text" name="manufacture" class="form-control" required>
          </div>
        </div>
        <div class="modal-footer">
          <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
          <input type="submit" class="btn btn-success" value="Add">
        </div>
      </form>
    </div>
  </div>
</div>
<!-- Edit Modal HTML -->
<div id="editEmployeeModal" class="modal fade">
  <div class="modal-dialog">
    <div class="modal-content">
      <form method="post" action="/product?action=edit">
        <div class="modal-header">
          <h4 class="modal-title">Edit Product</h4>
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        </div>
        <div class="modal-body">
          <div class="form-group">
            <input type="text" name="id" class="form-control" hidden>
          </div>
          <div class="form-group">
            <label>Name</label>
            <input type="text" name="name" class="form-control" required>
          </div>
          <div class="form-group">
            <label>Price</label>
            <input type="text" name="price" class="form-control" required>
          </div>
          <div class="form-group">
            <label>Description</label>
            <textarea class="form-control" name="description" required></textarea>
          </div>
          <div class="form-group">
            <label>Manufacture</label>
            <input type="text" name="manufacture" class="form-control" required>
          </div>
        </div>
        <div class="modal-footer">
          <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
          <input type="submit" class="btn btn-info" value="Save">
        </div>
      </form>
    </div>
  </div>
</div>
<!-- Delete Modal HTML -->
<div id="deleteEmployeeModal" class="modal fade">
  <div class="modal-dialog">
    <div class="modal-content">
      <form method="post" action="/product?action=delete">
        <input type="text" name="id" hidden>
        <div class="modal-header">
          <h4 class="modal-title">Delete Product</h4>
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        </div>
        <div class="modal-body">
          <p>Are you sure you want to delete these Records?</p>
          <p class="text-warning"><small>This action cannot be undone.</small></p>
        </div>
        <div class="modal-footer">
          <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
          <input type="submit" class="btn btn-danger" value="Delete">
        </div>
      </form>
    </div>
  </div>
</div>
</body>
</html>

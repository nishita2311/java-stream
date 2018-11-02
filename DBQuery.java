package com.accenture.jdbc.dao;

public interface DBQuery {

	String GET_ALL_PRODUCTS = "SELECT * FROM Product";
	String GET_PRODUCT_BYID = "SELECT * FROM Product WHERE product_id = ?";
	String INSERT_PRODUCT = "INSERT INTO Product VALUES ( ?,?,?)";
	String DEL_PRODUCT_BYID = "DELETE FROM Product WHERE product_id = ?";
	String UPDATE_PRODUCT = "UPDATE Product SET product_name = ?, price = ? WHERE product_id = ?";

}

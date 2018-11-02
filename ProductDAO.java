package com.accenture.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import com.accenture.jdbc.entity.Product;
import com.accenture.jdbc.util.DBUtil;

//This DAO can do CRUD operations, it can Create, Retreive, Updata, Delete from our table.
public class ProductDAO {

	public Set<Product> selectAllProducts() {
		Set<Product> products = new HashSet<>();
		Connection connection = DBUtil.getDbConnection();
		try {
			PreparedStatement pstmt = connection.prepareStatement(DBQuery.GET_ALL_PRODUCTS);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int productId = rs.getInt(1);
				String productName = rs.getString(2);
				double price = rs.getDouble(3);
				products.add(new Product(productId, productName, price));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBUtil.closeDbConnection();
		return products;
	}

	public Product selectProductById(int searchId) {
		Product product = null;
		Connection connection = DBUtil.getDbConnection();
		try {
			PreparedStatement pstmt = connection.prepareStatement(DBQuery.GET_PRODUCT_BYID);
			pstmt.setInt(1, searchId);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				int productId = rs.getInt(1);
				String productName = rs.getString(2);
				double price = rs.getDouble(3);
				product = new Product(productId, productName, price);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBUtil.closeDbConnection();
		return product;
	}

	public int insertProduct(Product product) {
		Connection connection = DBUtil.getDbConnection();
		int result = 0;
		try {
			PreparedStatement pstmt = connection.prepareStatement(DBQuery.INSERT_PRODUCT);
			pstmt.setInt(1, product.getProductId());
			pstmt.setString(2, product.getProductName());
			pstmt.setDouble(3, product.getPrice());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBUtil.closeDbConnection();
		return result;
	}

	public int updateProduct(Product product) {
		Connection connection = DBUtil.getDbConnection();
		int result = 0;
		try {
			PreparedStatement pstmt = connection.prepareStatement(DBQuery.UPDATE_PRODUCT);

			pstmt.setString(1, product.getProductName());
			pstmt.setDouble(2, product.getPrice());
			pstmt.setInt(3, product.getProductId());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBUtil.closeDbConnection();
		return result;
	}

	public int deleteProduct(int productId) {
		Connection connection = DBUtil.getDbConnection();
		int result = 0;
		try {
			PreparedStatement pstmt = connection.prepareStatement(DBQuery.DEL_PRODUCT_BYID);
			pstmt.setInt(1, productId);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBUtil.closeDbConnection();
		return result;
	}

}

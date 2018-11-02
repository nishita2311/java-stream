package com.accenture.jdbc.ui;

import java.util.Scanner;
import java.util.Set;

import com.accenture.jdbc.entity.Product;
import com.accenture.jdbc.service.ProductService;
//UI
public class ProductMain {
	public static void main(String[] args) {
		ProductService service = new ProductService();
		Scanner input = new Scanner(System.in);
		

		int choice = 0;
		while (true) {
			System.out.println("1. Show All Product");
			System.out.println("2. Search Product");
			System.out.println("3. Add Product");
			System.out.println("4. Update Product");
			System.out.println("5. Delete Product");
			System.out.println("6. Exit");
			System.out.println("---------------------------------");
			System.out.print("Choose Option : ");
			
			choice = input.nextInt();
			switch (choice) {
			case 1:
				getAllProducts(service);
				System.out.println("===========================================================");
				break;
			case 2:
				System.out.print("Enter Product Id to Search : ");
				int searchId = input.nextInt();
				getProductById(service, searchId);
				System.out.println("===========================================================");
				break;
			case 3:
				System.out.print("Enter Product Id  : ");
				int productId = input.nextInt();
				System.out.print("Enter Product Name : ");
				String productName = input.next();
				System.out.print("Enter Product Price : ");
				double price = input.nextDouble();
				int result = addProduct(service, productId, productName, price);
				if (result == 1) {
					System.out.println("SUCCESS : Product Added");
				} else {
					System.out.println("ERROR : Unable to Add Product");
				}
				System.out.println("===========================================================");
				break;
			case 4:
				System.out.print("Enter Product Id  : ");
				int id = input.nextInt();
				Product product = service.getProductById(id);
				if (product != null) {
					int modifyResult = modifyProduct(service, input, product);
					if (modifyResult == 1) {
						System.out.println("SUCCESS : Product Updated ");
					}
				} else {
					System.out.println("ERROR : Product Does not Exist");
				}
				System.out.println("===========================================================");
				break;
			case 5:
				System.out.print("Enter Product Id to Delete : ");
				int delId = input.nextInt();
				delProduct(service, delId);
				System.out.println("===========================================================");
				break;
			case 6:
				System.out.println("Application STOPED");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
			}
		}
	}

	private static int modifyProduct(ProductService service, Scanner input, Product product) {

		System.out.print("Enter New Product Name : ");
		String newProductName = input.next();
		System.out.print("Enter New Product Price : ");
		double newPrice = input.nextDouble();
		product.setProductName(newProductName);
		product.setPrice(newPrice);
		int result = service.modifyProduct(product);
		return result;
	}

	private static void delProduct(ProductService service, int delId) {
		int delResult = service.removeProduct(delId);
		if (delResult == 1) {
			System.out.println("SUCCESS : Record Deleted");
		} else {
			System.out.println("ERROR : Unable to Delete");
		}
	}

	private static int addProduct(ProductService service, int productId, String productName, double price) {
		Product product = new Product(productId, productName, price);
		int result = service.addProduct(product);
		return result;
	}

	private static void getProductById(ProductService service, int searchId) {
		Product product = service.getProductById(searchId);
		if (product != null) {
			System.out.println(product.getProductId() + " " + product.getProductName() + " " + product.getPrice());
		} else {
			System.out.println("ERROR : Product not found");
		}
	}

	private static void getAllProducts(ProductService service) {
		Set<Product> productList = service.getAllProducts();
		for (Product product : productList) {
			System.out.println(product.getProductId() + " " + product.getProductName() + " " + product.getPrice());
		}
	}
}

package application;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		SimpleDateFormat sdf = new SimpleDateFormat(String.format("dd/MM/yyyy"));
		
		Department obj = new Department(1, "books");
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, obj);
		
		System.out.println(seller);

	}

}

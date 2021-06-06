package application;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		SimpleDateFormat sdf = new SimpleDateFormat(String.format("dd/MM/yyyy"));
	
		SellerDao sellerdao = DaoFactory.createSellerDao();
		System.out.println("===TEST 1: seller findById ===");
		Seller seller = sellerdao.findById(3);
		
		System.out.println(seller);

	}

}

package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Departiment;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Departiment obj = new Departiment(1, "Books");
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, obj);
		
		SellerDao sellerDao =  DaoFactory.createSellerDao();
		
		System.out.println(seller);
		
	}

}

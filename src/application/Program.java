package application;

import java.util.Date;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj =  new Department(1, "Books");
		
		Seller seller = new Seller(15, "Tom", "tom@email.com", new Date(), 3000.0, obj);
		
		SellerDAO sellerDao = DAOFactory.createSellerDao();
		
		System.out.println(seller);

	}

}

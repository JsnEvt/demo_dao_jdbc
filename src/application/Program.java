package application;

import java.util.Date;
import java.util.List;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDAO sellerDao = DAOFactory.createSellerDao();
		
		System.out.println();
		System.out.println("=== TEST1: seller findById ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println();
		System.out.println("=== TEST2: seller findByDepartment ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj: list) {
			System.out.println(obj);
		}
		System.out.println();
		System.out.println("=== TEST3: seller findAll ====");
		list = sellerDao.findAll();
		for (Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("=== TEST4: seller Insert ====");
		Seller newSeller = new Seller(null, "Brunno", "brunno@email.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());

	}

}

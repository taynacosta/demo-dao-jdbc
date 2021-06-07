package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entites.Department;
import model.entites.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("===TEST 1: department findById ===");
		Department department = departmentDao.findById(2);
		System.out.println(department);

		
		System.out.println("\n===TEST 2: department findAll ===");
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		System.out.println("\n===TEST 3: department insert ===");
		int idmore1 = 1 + department.getId().SIZE;
		Department dep = new Department(null, "D1");
		departmentDao.insert(dep);
		System.out.println("Inserting Complected!");
		
		System.out.println("\n===TEST 4: department update ===");
		department = departmentDao.findById(4);
		department.setName("xuxu");
		departmentDao.update(department);
		System.out.println("Update Complected!");
		
		System.out.println("\n===TEST 5: department delete ===");
		System.out.println("Enter a id for delete: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete complectd!");
		
		sc.close();
		
	}

}

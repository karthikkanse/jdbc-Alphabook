package samplemavenproject;
import java.util.*;
public class Driver {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the id");
		int id=s.nextInt();
		System.out.println("Enter the name");
		String name=s.next();
		System.out.println("Enter the phone");
		long phone=s.nextLong();
		
		Employee employee=new Employee();
		employee.setId(id);
		employee.setName(name);
	    employee.setPhone(phone);
	    
//	    System.out.println("Enter the operation to be performed");
//	    System.out.println("1.Read Employee\n2.Read By Id\n3.Insert ");
		
		EmployeeCRUD crud=new EmployeeCRUD();
		//crud.saveEmployee(employee);
		crud.deleteEmployee(id);
		//crud.updateEmployee(id,employee);
		//crud.readByEmployeeId(id);
		//crud.readEmployee();
		
	}

}

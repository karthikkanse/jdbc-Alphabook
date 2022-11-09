package samplemavenproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class MainDriver {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "root");
			PreparedStatement preparedStatement=connection.prepareStatement("Insert into employee value(?,?,?)");
			for(int i=1;i<=5;i++)
			{
				System.out.println("Enter the "+i+" id");
				int id=scanner.nextInt();
				System.out.println("Enter the "+i+" name");
				String name=scanner.next();
				System.out.println("Enter the "+i+" phone number");
				long phone=scanner.nextLong();
				
				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, name);
				preparedStatement.setLong(3, phone);
				
				preparedStatement.addBatch();
				
			}
			preparedStatement.executeBatch();
			connection.close();
			System.out.println("Data Successfully added");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
	}

	}}

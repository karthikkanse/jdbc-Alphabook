package Alphabook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SocialMedia {
	Connection connection=new ConnectionHelper().getConnectionObject();
	private User user;
public void login(String email,String password,User user)
{
	try {
		PreparedStatement ps=connection.prepareStatement("Select * from alpha where email=? and password=?");
		ps.setString(1, user.getEmail() );
		ps.setString(2, user.getPassword());
		ResultSet rs=ps.executeQuery();
		String mail="";
		String pass="";
		while(rs.next())
		{
		 mail=rs.getString(6);
		 pass=rs.getString(7);
		}
		if(mail.equals(user.getEmail())&&pass.equals(user.getPassword()))
		{
			System.out.println("***"+mail+" user Login Successfull ***");
			Scanner s=new Scanner(System.in);
			System.out.println("*** Status Tab ***");
			System.out.println("1.Create Status\n2.Dont create");
			int st=s.nextInt();
			switch(st)
			{
			case 1:
			{
				SocialMedia sm=new SocialMedia();
				System.out.println("Enter the status");
				s.nextLine();
				String entry = s.nextLine();
				sm.status(user,datetime);
			}
			break;
			case 2:
			{
				System.out.println("Thank You");
				System.exit(0);
			}}
		}
		else
			System.out.println("*** Invalid Password ***");
			System.out.println("*** Please enter the following choice ***");
	System.out.println("==================");
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public void signup(User users)
{
	try {
		Scanner s=new Scanner(System.in);
		PreparedStatement ps=connection.prepareStatement("Insert into alpha value(?,?,?,?,?,?,?)");
		ps.setString(1, users.getFirstName());
		ps.setString(2, users.getLastName());
		ps.setString(3, users.getGender());
		ps.setLong(4, users.getContactnumber());
		ps.setString(5, users.getDateOfBirth());
		ps.setString(6, users.getEmail());
		ps.setString(7, users.getPassword());
		System.out.println("1.Submit\n2.Cancel");
		int choice=s.nextInt();
		switch(choice)
		{
		case 1:
		{
			ps.execute();
			System.out.println("SignUp Successfull");
		}
		break;
		case 2:
		{
			System.out.println("Thank You");
		}
		}
		
		connection.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}
public void status(User user,String status,String datetime){
	String query="INSERT INTO STATUS VALUE(?,?,?)";
	String query1="Select * from status where email=?";
		try {
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setString(1, user.getEmail());
			ps.setString(2, status);
			ps.setString(3, user.ld);
			ps.executeUpdate();
			System.out.println("Status added successful");
			
			PreparedStatement ps1=connection.prepareStatement(query1);
			ps1.setString(1, user.getEmail());
			ResultSet rs=ps1.executeQuery();
			while(rs.next())
			{
				System.out.println("================");
				System.out.println("Old status");
				System.out.println(rs.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


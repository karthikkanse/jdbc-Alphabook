package Alphabook;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class AlphaBookDriver {
	Connection connection=new ConnectionHelper().getConnectionObject();

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean condition=true;
		while(condition)
		{
		System.out.println("***** Welcome to ALPHABOOK *****");
		System.out.println("1.Login\n2.Signup\n3.Exit");
		System.out.println("***** Enter your Choice *****");
		int select=scanner.nextInt();
		switch(select)
		{
		case 1:
		{
			Scanner s=new Scanner(System.in);
			User u=new User();
			SocialMedia sd=new SocialMedia();
			System.out.println("Enter your email");
			String email=scanner.next();
			System.out.println("Enter your password");
			String password=scanner.next();
			u.setEmail(email);
			u.setPassword(password);
			sd.login(email,password,u);
			
			}
		break;
		case 2:
		{
			System.out.println("***** ALPHABOOK SIGNUP *****");
			User user=new User();
			SocialMedia sd=new SocialMedia();
			System.out.println("Enter the first name");
			String firstname=scanner.next();
			System.out.println("Enter the last name");
			String lastname=scanner.next();
			System.out.println("Enter the Gender");
			String gender=scanner.next();
			System.out.println("Enter the contact number");
			long contactNumber=scanner.nextLong();
			System.out.println("Enter the DOB");
			String DOB=scanner.next();
			System.out.println("Enter the emailid");
			String mailid=scanner.next();
			System.out.println("Enter the password");
			String password=scanner.next();
			user.setFirstName(firstname);
			user.setLastName(lastname);
			user.setGender(gender);
			user.setContactnumber(contactNumber);
			user.setDateOfBirth(DOB);
			user.setEmail(mailid);
			user.setPassword(password);
			sd.signup(user);
		}
		break;
		case 3:
		{
			System.out.println("** Thank You for using ALPHABOOK **");
			System.exit(0);
		}}
		}}}


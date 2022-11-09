package Alphabook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {
	Connection connection=new ConnectionHelper().getConnectionObject();
private String firstName;
private String lastName;
private String gender;
private long contactnumber;
private String dateOfBirth;
private String email;
private String password;
LocalDateTime ld;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public long getContactnumber() {
	return contactnumber;
}
public void setContactnumber(long contactnumber) {
	this.contactnumber = contactnumber;
}
public String getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
//public void postStatus()
//{
//	String query="Insert into status value(?)";
//	try {
//		PreparedStatement ps=connection.
//	}
//	
//}

}

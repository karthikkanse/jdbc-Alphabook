package samplemavenproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeCRUD {
Connection connection=new EmployeeHelper().getConnectionObject();
public void saveEmployee(Employee employee)
{
	String query="Insert into employee value(?,?,?)";
	try {
	PreparedStatement preparedStatement = connection.prepareStatement(query);
	preparedStatement.setInt(1,employee.getId());
	preparedStatement.setString(2,employee.getName());
	preparedStatement.setLong(3,employee.getPhone());
	preparedStatement.executeUpdate();
	connection.close();
	System.out.println("Saved Successfully");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public void deleteEmployee(int id)
{
	String query="Delete from employee where id=?";
	try {
	PreparedStatement preparedStatement = connection.prepareStatement(query);
	preparedStatement.setInt(1,id);
	preparedStatement.executeUpdate();
	connection.close();
	System.out.println("Deleted Successfully");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
public void updateEmployee(int id,Employee employee)
{
	String query="Update employee set name=?,phone=? where id=?";
	try {
	PreparedStatement preparedStatement = connection.prepareStatement(query);
	preparedStatement.setString(1,employee.getName());
	preparedStatement.setLong(2,employee.getPhone());
	preparedStatement.setInt(3,id);
	preparedStatement.executeUpdate();
	connection.close();
	System.out.println("Updated Successfully");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
public void readByEmployeeId(int id)
{
	String query="Select * from employee where id=?";
	try {
	PreparedStatement preparedStatement = connection.prepareStatement(query);
	preparedStatement.setInt(1,id);
	ResultSet rs=preparedStatement.executeQuery();
	while(rs.next())
	{
		System.out.print(rs.getInt(1)+" ");
		System.out.print(rs.getString(2)+" ");
		System.out.println(rs.getLong(3));
	}
	connection.close();
	System.out.println("Read by Id Successful");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
public void readEmployee()
{
	String query="Select * from employee";
	try {
	PreparedStatement preparedStatement = connection.prepareStatement(query);
	ResultSet rs=preparedStatement.executeQuery();
	while(rs.next())
	{
		System.out.print(rs.getInt(1)+" ");
		System.out.print(rs.getString(2)+" ");
		System.out.println(rs.getLong(3));
		System.out.println("=================");
	}
	connection.close();
	System.out.println("Read Successfull");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
}

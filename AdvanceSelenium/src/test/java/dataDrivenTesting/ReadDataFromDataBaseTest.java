package dataDrivenTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class ReadDataFromDataBaseTest {
	@Test
	public void test() throws Throwable {
		//step 1:load/register the driver
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		//step 2:connect to data base						  							username  password													//username password
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
										//url syntax="jdbc:vendor:ip address:portno/name of the database"
		System.out.println("=====connected to DB=========");
		//step 3:create sql statement
		Statement stat = conn.createStatement();
		//step 4:execute select query and get result
		ResultSet resultset = stat.executeQuery("select * from persons");
		while(resultset.next()) {
			System.out.println(resultset.getString(1)+"\t"+resultset.getString(2)+"\t"+resultset.getString(3)+"\t"+resultset.getString(4)+"\t"+resultset.getString(5));
		}
		//step 5: close the connection
		conn.close();
	}
}

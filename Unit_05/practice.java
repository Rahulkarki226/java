package Unit_05;

import java.sql.*;
public class practice { 
	public static void main(String args[])
	{
		Connection myconn=null;
		Statement mystmt=null;
		ResultSet myrs=null;
		try {
			myconn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDatabase","root","root");
			mystmt=myconn.createStatement();
			int a=mystmt.executeUpdate("INSERT INTO jdbc_tbl VALUES (30,'mysql','karki','2011-9-11')");
			myrs=mystmt.executeQuery("select * from jdbc_tbl");
			while(myrs.next())
			{
				System.out.println(myrs.getString("Id")+", "+myrs.getString("Name")+", "
						+myrs.getString("Gender")+myrs.getString("Address"));
			}
		}catch(Exception e)
			{
				e.printStackTrace();
			}
			finally {
				myrs.close();
				mystmt.close();
				myconn.close();
			}
		}
	}
}

import java.sql.*;
class DBConnect
{
	public static void main(String[] args)
 	{
		try 
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			String dbname = "C:/java/programs/dbstud.mdb";
			String database = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb,*.accdb)};DBQ=";database+= dbname.trim() + ";DriverID=22;READONLY=true}"; 
			// add on to the end 
			// now we can get the connection from the DriverManager
			Connection con = DriverManager.getConnection( database ,"","");				// username and password
			Statement s = con.createStatement();
			s.execute("select * from student");
			ResultSet rs = s.getResultSet();
			if (rs != null)
			{
				System.out.println("\n\t\t******STUDENT******\n");
				System.out.println("\t\tName\tRollnumber");
				System.out.println("\t\t----\t----------");
				while ( rs.next() ) 
				{
					System.out.println("\t\t" + rs.getString(1)+"\t" + rs.getString(2));
				}
			}
			else
			{
				System.out.println("No such record");
			}

 		}
 		catch (Exception e)
		{
			System.out.println("Error: " + e);
 		}
 	}
}
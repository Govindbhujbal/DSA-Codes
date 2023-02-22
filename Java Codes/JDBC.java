package learningJava;
// 1. importing packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBC {
	public static void main(String[] args) throws Exception{
//		Class.forName("com.mysql.jdbc.Driver"); // 2. load and registering drivers
		Connection con = 
				DriverManager.getConnection
				("jdbc:mysql://localhost:3306/employee","root","Gsb@1234");
		// 3. Establishing the connections
		
		Statement st = con.createStatement(); 
		
//		String query = "create table sit ( dno int(2) primary key, dname varchar(11))";
//		st.execute(query);
//		st.execute("insert into sit values(1,'comp')");
//		String query = "insert into emp values(4,'govind',14)";
//		String query = "update emp set name = 'krishna' where id = 4";
//		String query = "delete from emp where id = 2";
//		st.execute(query);
		
		ResultSet rs = st.executeQuery("select * from sit");
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
//			int sal = rs.getInt(3);
			System.out.println(id+" "+name);			
		}	
		
		st.close();
		con.close();
	}
}

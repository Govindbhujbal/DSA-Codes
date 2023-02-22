package learningJava;
import java.sql.*;
public class Nitin {
	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Gsb@1234");
		Statement st = con.createStatement();
		
//		st.executeUpdate("insert into emp (id,name,salary) values (8,'ravan',55)");
		ResultSet rs = st.executeQuery("select * from emp");
	    
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			int salary = rs.getInt(3);
			System.out.println(id+" "+name+" "+salary);			
		}
	    st.close();
	    con.close();
	}
}
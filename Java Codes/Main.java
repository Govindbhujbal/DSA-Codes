package learningJava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Main {
	public static void main(String[] args)throws Exception {
		// url , username, pass
		Connection con = 
				DriverManager.getConnection
				("jdbc:mysql://localhost:3306/emp","root","Gsb@1234");
		
		 // insert into student values(7,'abc',3,52)
		
		Statement st = con.createStatement();
		
		
//		String str = "insert into student values(7,'abc',3,52)";
		String str = "update student set sname='vinayak' where id=3";
		st.execute(str);
		ResultSet rs = st.executeQuery("select * from student");
		// marks sname id rollNo
		
		int i=0;
		
		System.out.println("Marks name id rollNo");
		while(rs.next()) {
			
			int marks = rs.getInt("marks");
			String name = rs.getString("sname");
			int id = rs.getInt("id");
			int rollNO = rs.getInt("rollNo");
			i++;
			System.out.println(marks+"\t"+name+"\t"+id+"\t"+rollNO);
			
		}
		
			
		st.close();
		con.close();
	}
}
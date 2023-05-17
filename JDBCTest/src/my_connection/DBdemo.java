package my_connection;
import java.sql.*;
import java.util.Scanner;


public class DBdemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //Boy I guess this is just a thing you have to look up
			System.out.println("Driver Loaded");
//			Connection con = DriverManager.getConnection(url,username, password);
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_java_db", "root", "password");
			System.out.println("Connected");
//			Statement stmt = con.createStatement();
			
//			//Insert
//			int res = stmt.executeUpdate("insert into product values(4, 'steamdeck', 500)");
//			if(res>0) {
//				System.out.println("Record Inserted");
//			}
			
			//Delete
//			int res = stmt.executeUpdate("delete from product where pid = 100");//no product with this pid
//			if(res>0) {
//				System.out.println("Record Deleted");
//			} else {
//				System.out.println("Product Not Found/Error");
//			}
			
//			//Update
//			int res = stmt.executeUpdate("update product set price = 650 where pname = 'steamdeck'");//no product with this pid
//			if(res>0) {
//				System.out.println("Record Updated");
//			} else {
//				System.out.println("Product Not Found/Error");
//			}

//			ResultSet rs = stmt.executeQuery("select * from product");
//			while(rs.next()) {
//				System.out.println("PID: "+rs.getInt(1)+" Product:"+rs.getString(2)+" Price: $"+rs.getFloat(3)); 
//				//get next, one int. Is our PID
//				//get name
//				//get price;
//			}
//			rs.close();
//			
			Scanner sc = new Scanner(System.in);
			
			//INSERT USING PREPARED STATEMENT
//			PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?)");
//			System.out.println("Enter PID to be added: ");
//			int pid = sc.nextInt();
//			pstmt.setInt(1,pid);
//			System.out.println("Enter Product Name to be added: ");
////			String pname = sc.next(); // Split on space, so cant take multiple words
//			sc.nextLine();
//			String pname = sc.nextLine();
//			pstmt.setString(2,pname);
//			System.out.println("Enter Product Price to be added: ");
//			float pprice = sc.nextFloat();
//			pstmt.setFloat(3,pprice);
//			int res = pstmt.executeUpdate();
//			if(res>0) {
//				System.out.println("Record Updated");
//			} else {
//			System.out.println("Product Not Found/Error");
//			}

			//DELETE USING PREPARED STATMENT
//			PreparedStatement pstmt = con.prepareStatement("delete from product where pid = ?");
//			System.out.println("Enter PID to be deleted: ");
//			int pid = sc.nextInt();
//			pstmt.setInt(1,pid); //ONE INDEXED
//			int res = pstmt.executeUpdate();
//			if(res>0) {
//				System.out.println("Record Deleted");
//			} else {
//			System.out.println("Product Not Found/Error");
//			}
//			
			
//			//UPDATE USING PREPARED STATEMENT
//			PreparedStatement pstmt = con.prepareStatement("update product set price = ? where pid = ?");
//			System.out.println("Enter PID to be updated: ");
//			int pid = sc.nextInt();
//			pstmt.setInt(2,pid);//NOTE!!!! We are using the index of the ? marks in the ptstmt, UNRELEATED to DB cols
//			System.out.println("Enter new Price: ");
//			float pprice = sc.nextFloat();
//			pstmt.setFloat(1,pprice);    //NOTE!!!! We are using the index of the ? marks in the ptstmt, UNRELEATED to DB cols
//			int res = pstmt.executeUpdate();
//			if(res>0) {
//				System.out.println("Record Updated");
//			} else {
//			System.out.println("Product Not Found/Error");
//			}			
//			
			//RETRIEVE USING PREPARED STATEMENT
			PreparedStatement pstmt = con.prepareStatement("select * from product where price >?");
			System.out.println("Enter min Price: ");
			float pprice = sc.nextFloat();
			pstmt.setFloat(1,pprice);    //NOTE!!!! We are using the index of the ? marks in the ptstmt, UNRELEATED to DB cols
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				while(rs.next()) {
					System.out.println("PID: "+rs.getInt(1)+" Product:"+rs.getString(2)+" Price: $"+rs.getFloat(3)); 
					//get next, one int. Is our PID
					//get name
					//get price;
				}
			} else {
				System.out.println("No Products of price greater than $"+pprice);
			}
			rs.close();
			
			pstmt.close();
			con.close();
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			
		}
	
	}

		
}

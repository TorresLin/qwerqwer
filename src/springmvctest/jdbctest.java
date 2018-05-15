package springmvctest;

import java.sql.*;
import com.microsoft.sqlserver.jdbc.*;


public class jdbctest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String connectionString = "jdbc:sqlserver://localhost:1434;"
                                 +"database=msdb;"
                                 +"user=sa;"
                                 +"password=1qaz2wsx;"
                                 +"encrypt=false;"
                                 +"trustServerCertificate=false;"
                                 +"hostNameIncertificate=*"
                                 +"loginTimeout=30;";
        Connection conn = null;
        Statement stat = null;
        ResultSet rsltSet = null;
        
        try {
            conn = DriverManager.getConnection(connectionString);
            
            String selectSql = "select top 10 Title, FirstName, LastName from SaleLT.Customer";
            stat = conn.createStatement();
            rsltSet = stat.executeQuery(selectSql);
            
            while (rsltSet.next())   
            {  
                System.out.println(rsltSet.getString(2) + " "  
                    + rsltSet.getString(3));  
            }  
        }
        catch (Exception e) {  
            e.printStackTrace();  
        }  
        finally {  
            // Close the connections after the data has been handled.  
            if (rsltSet != null) try { rsltSet.close(); } catch(Exception e) {}  
            if (stat != null) try { stat.close(); } catch(Exception e) {}  
            if (conn != null) try { conn.close(); } catch(Exception e) {}  
        }  
	}

}

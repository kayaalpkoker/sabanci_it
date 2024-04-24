package edu.kayaalp.koker.q2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBWriter {

	public DBWriter() {
		super();
	}

	public void writeTextToDatabase(String fileName) {
		        
		String url = "jdbc:mysql://localhost/IT524";
		String username = "root";
		String password = "Sabanci99!!";
		
		try (FileReader reader = new FileReader(fileName);
				BufferedReader bufferedReader = new BufferedReader(reader);
				Connection connection = DriverManager.getConnection(url, username, password)) {
			
			while(true) {
				
				String line = bufferedReader.readLine();
				if(line==null)
					break;
				
				String[] values;
				line = line.replace("{ name : ", "");
				line = line.replace(" }", "");
				values = line.split(" , count : ");
				
				//System.out.print(values[0]);
				//System.out.println(values[1]);
				
				int valueInt = Integer.parseInt(values[1]);
				
				PreparedStatement selectPS = connection.prepareStatement("select * from product where name = ?");
	            selectPS.setString(1, values[0]);
				
				ResultSet resultSet = selectPS.executeQuery();
				
				if (resultSet.next()) {
					String count = resultSet.getString("count");
                    int countInt = Integer.parseInt(count);
                    
                    PreparedStatement updatePS = connection.prepareStatement("update product set count = ? where name = ?");
                    updatePS.setInt(1, (valueInt + countInt));
                    updatePS.setString(2, values[0]);
                    updatePS.executeUpdate();
                    
				} else {
                    PreparedStatement insertPS = connection.prepareStatement("insert into product (name,count) values (?,?)");
                    insertPS.setString(1, values[0]);
                    insertPS.setInt(2, valueInt);
                    insertPS.executeUpdate();
                }
				
			}
			
			System.out.println("Successful! Kan, ter, gözyaşı :)");
						
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}
}
	


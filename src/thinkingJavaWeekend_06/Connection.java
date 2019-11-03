package thinkingJavaWeekend_06;

public class Connection {
	public static int count = 0;
  
	
	
	private Connection() {
		// TODO Auto-generated constructor stub
	}

	private static Connection conn;

	public Connection createMass(){
		Connection [] arr = new Connection[3];	
		for (int i = 0; i < arr.length; i++) {
			
			
		}
		
		
		
		return null;
	}
	
	
	public static Connection getConnection() {

		if (conn == null) {
			conn = new Connection();
		}
		count++;

		if (count == 3) {
			return null;
		}
		return conn;
	}

}

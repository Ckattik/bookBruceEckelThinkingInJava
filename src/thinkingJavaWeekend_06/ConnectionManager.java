package thinkingJavaWeekend_06;

public class ConnectionManager {

	public static Connection addConn() {

		return Connection.getConnection();
	}

	public static void main(String[] args) {

		Connection con = addConn();
		Connection con1 = addConn();
		Connection con3 = addConn();
		Connection con4 = addConn();
		System.out.println(con.toString());
		System.out.println(con1.toString());
		System.out.println(con3.toString());
		System.out.println(con4.toString());
	}

}

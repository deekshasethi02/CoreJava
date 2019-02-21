package Interface;

public class DBTest {

	public static void main(String[] args) {
		//ConnectDB con = new MySqlDriver();
		ConnectDB con = new OracleDriver();
		con.connect();
		con.disConnect();
		con.use();

	}

}

package Interface;

public class MySqlDriver implements ConnectDB {

	@Override
	public void connect() {
		System.out.println("my SQL Driver connected");
	}

	@Override
	public void use() {
		System.out.println("my SQL Driver used");

	}

	@Override
	public void disConnect() {
		System.out.println("my SQL Driver disconnected");

	}

}

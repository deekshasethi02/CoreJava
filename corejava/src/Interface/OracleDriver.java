package Interface;

public class OracleDriver implements ConnectDB {

	@Override
	public void connect() {
		System.out.println("Oracle Driver connected");

	}

	@Override
	public void use() {
		System.out.println("Oracle Driver used");

	}

	@Override
	public void disConnect() {
		System.out.println("Oracle Driver disconnected");

	}

}

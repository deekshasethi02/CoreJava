
public class DBTool {
	private String server;
	private String username;
	private String password;

	public void setServer(String server) {
		this.server = server;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public void prompt() {
		if(server.equalsIgnoreCase("NySql")) {
			//MySql mysql= new MySql(this.username,this.password);
		}
		
	}
}

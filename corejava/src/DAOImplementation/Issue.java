package DAOImplementation;

import java.util.Date;

public class Issue {
	private String name;
	private String createdDate;
	private boolean status;

	public void setName(String name) {
		this.name = name;
	}



	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}



	public void setStatus(boolean status) {
		this.status = status;
	}



	
	

	public Issue(String name, String createdDate,boolean status) {
		this.name = name;
		this.createdDate = createdDate;
		this.status = status;
	}



	public String getName() {
		return name;
	}



	public String getCreatedDate() {
		return createdDate;
	}



	public boolean isStatus() {
		return status;
	}

	
}

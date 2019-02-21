
public class Employee {
String fname;
String lname;
String company;
String role;

public String generatePassword() {
	
	String result= fname.substring(0, 2) + lname.substring(0,2)+ company.substring(0, 2) + role.substring(0, 2);
	return result;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public String getCompany() {
	return company;
}

public void setCompany(String company) {
	this.company = company;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}
}
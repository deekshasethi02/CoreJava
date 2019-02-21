
public class Member {
String firstName, lastName , email,role, password;

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
public String showMemberDetail() {
	return "Member [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", role=" + role
			+ ", password=" + password + "]";
}


}

package kz.nurk.model;

public class User {
	
	public String login;
	public String password;
	
	public User() {}
	public User(String login, String password) {
		this.login = login;
		this.password = password;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean authValidate() {
		
		if("a".equalsIgnoreCase(this.login) && "pas".equalsIgnoreCase(this.password)) {
			return true;
		}
		
		return false;
	}
}

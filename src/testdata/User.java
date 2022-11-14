package testdata;

import util.Reader;

public class User {
	private String username;
	private String password;
	private String email;
	
	public User(String fileName) {
		this.username = Reader.json(fileName).get("username").toString();
		this.password = Reader.json(fileName).get("password").toString();
		this.email = Reader.json(fileName).get("email").toString();
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return this.username;
	}
	public String getPassword() {
		return this.password;
	}
	public String getEmail() {
		return this.email;
	}
}

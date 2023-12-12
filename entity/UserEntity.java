package com.Online_book_Store.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name="user id")
public class UserEntity {
 private int user_id;
 private String username;
 private int password;
 private String first_name;
 private String last_name;
 private String email;
 private String role;
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public int getPassword() {
	return password;
}
public void setPassword(int password) {
	this.password = password;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
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

}




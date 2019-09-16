package com.restassured.pom;

public class Data {
private int id;
private String email;
private String first_name;
private String last_name;
private String avatar;

public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getAvatar() {
	return avatar;
}
public void setAvatar(String avatar) {
	this.avatar = avatar;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((avatar == null) ? 0 : avatar.hashCode());
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
	result = prime * result + id;
	result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Data other = (Data) obj;
	if (avatar == null) {
		if (other.avatar != null)
			return false;
	} else if (!avatar.equals(other.avatar))
		return false;
	if (email == null) {
		if (other.email != null)
			return false;
	} else if (!email.equals(other.email))
		return false;
	if (first_name == null) {
		if (other.first_name != null)
			return false;
	} else if (!first_name.equals(other.first_name))
		return false;
	if (id != other.id)
		return false;
	if (last_name == null) {
		if (other.last_name != null)
			return false;
	} else if (!last_name.equals(other.last_name))
		return false;
	return true;
}

}

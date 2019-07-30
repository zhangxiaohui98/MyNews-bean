package com.zhang.mynews.bean;
/**
 * 	用户
 * @author zhang
 *
 */
public class User {
	private int id;              
	private String password;     //密码
	private String username;     //用户姓名
	private String tel;          //电话号码
	private String email;        //邮箱地址
	private int gender;          //性别 0：未知，1：男，2：女
	private String avatar;       //头像地址
	private String creationtime; //注册时间
	public User() {
		
	}
	public User(int id, String password, String username, String tel, String email, int gender,
			String avatar, String creationtime) {
		super();
		this.id = id;
		this.password = password;
		this.username = username;
		this.tel = tel;
		this.email = email;
		this.gender = gender;
		this.avatar = avatar;
		this.creationtime = creationtime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getCreationtime() {
		return creationtime;
	}
	public void setCreationtime(String creationtime) {
		this.creationtime = creationtime;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", username=" + username
				+ ", tel=" + tel + ", email=" + email + ", gender=" + gender + ", avatar=" + avatar + ", creationtime="
				+ creationtime + "]";
	}
	
	
}

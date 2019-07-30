package com.zhang.mynews.bean;
/**
 * 	用户-角色关系
 * @author zhang
 *
 */
public class UserRole {
	private int id;
	private int roleid;  //角色名
	private int userid;  //用户
	public UserRole() {
		// TODO Auto-generated constructor stub
	}
	public UserRole(int id, int roleid, int userid) {
		super();
		this.id = id;
		this.roleid = roleid;
		this.userid = userid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "UserRole [id=" + id + ", roleid=" + roleid + ", userid=" + userid + "]";
	}
	
}

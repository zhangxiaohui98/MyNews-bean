package com.zhang.mynews.bean;
/**
 * 	角色
 * @author zhang
 *
 */
public class Role {
	private int id;
	private String rolename;//角色名
	public Role(int id, String rolename) {
		super();
		this.id = id;
		this.rolename = rolename;
	}
	public Role() {

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", rolename=" + rolename + "]";
	}
	
	
}

package com.zhang.mynews.bean;
/**
 * 	角色-许可关系
 * @author zhang
 *
 */
public class RoleLicense {
	private int id;
	private int roleid;     //角色
	private int licenseid;  //许可
	public RoleLicense() {
		// TODO Auto-generated constructor stub
	}
	public RoleLicense(int id, int roleid, int licenseid) {
		super();
		this.id = id;
		this.roleid = roleid;
		this.licenseid = licenseid;
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
	public int getLicenseid() {
		return licenseid;
	}
	public void setLicenseid(int licenseid) {
		this.licenseid = licenseid;
	}
	@Override
	public String toString() {
		return "RoleLicense [id=" + id + ", roleid=" + roleid + ", licenseid=" + licenseid + "]";
	}
	
}

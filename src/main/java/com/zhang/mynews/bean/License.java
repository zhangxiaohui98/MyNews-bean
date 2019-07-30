package com.zhang.mynews.bean;
/**
 * 	许可
 * @author zhang
 *
 */
public class License {
	private int id;
	private int pid;             //父许可
	private String licensename;  //许可名
	private String icon;         //图标
	private String url;          //路径
	public License() {
		// TODO Auto-generated constructor stub
	}
	public License(int id, int pid, String licensename, String icon, String url) {
		super();
		this.id = id;
		this.pid = pid;
		this.licensename = licensename;
		this.icon = icon;
		this.url = url;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getLicensename() {
		return licensename;
	}
	public void setLicensename(String licensename) {
		this.licensename = licensename;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "License [id=" + id + ", pid=" + pid + ", licensename=" + licensename + ", icon=" + icon + ", url=" + url
				+ "]";
	}
	
}

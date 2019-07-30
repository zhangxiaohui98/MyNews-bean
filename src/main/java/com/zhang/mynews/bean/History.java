package com.zhang.mynews.bean;
/**
 * 	历史记录
 * @author zhang
 *
 */
public class History {
	private int id;
	private int userid;       //用户
	private int newsid;       //新闻
	private String creationtime; //创建时间
	public History() {
		// TODO Auto-generated constructor stub
	}
	public History(int id, int userid, int newsid, String creationtime) {
		super();
		this.id = id;
		this.userid = userid;
		this.newsid = newsid;
		this.creationtime = creationtime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getNewsid() {
		return newsid;
	}
	public void setNewsid(int newsid) {
		this.newsid = newsid;
	}
	public String getCreationtime() {
		return creationtime;
	}
	public void setCreationtime(String creationtime) {
		this.creationtime = creationtime;
	}
	@Override
	public String toString() {
		return "History [id=" + id + ", userid=" + userid + ", newsid=" + newsid + ", creationtime=" + creationtime
				+ "]";
	}
	
	
}

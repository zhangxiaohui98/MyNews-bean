package com.zhang.mynews.bean;
/**
 * 	评论
 * @author zhang
 *
 */
public class Comment {
	private int id;
	private int newsid;   //新闻
	private int floor;    //楼层
	private int likes;    //点赞数
	private int author;   //作者
	private int visible;  //是否可见
	private String content;//评论内容
	private String creationtime;//创建时间
	public Comment() {
		// TODO Auto-generated constructor stub
	}
	public Comment(int id, int newsid, int floor, int likes, int author, int visible, String content,
			String creationtime) {
		super();
		this.id = id;
		this.newsid = newsid;
		this.floor = floor;
		this.likes = likes;
		this.author = author;
		this.visible = visible;
		this.content = content;
		this.creationtime = creationtime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNewsid() {
		return newsid;
	}
	public void setNewsid(int newsid) {
		this.newsid = newsid;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public int getAuthor() {
		return author;
	}
	public void setAuthor(int author) {
		this.author = author;
	}
	public int getVisible() {
		return visible;
	}
	public void setVisible(int visible) {
		this.visible = visible;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreationtime() {
		return creationtime;
	}
	public void setCreationtime(String creationtime) {
		this.creationtime = creationtime;
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", newsid=" + newsid + ", floor=" + floor + ", likes=" + likes + ", author="
				+ author + ", visible=" + visible + ", content=" + content + ", creationtime=" + creationtime + "]";
	}
	
	
}

package com.zhang.mynews.bean;
/**
 * 	新闻
 * @author zhang
 *
 */
public class News {
	private int id;
	private String title;               //标题
	private String content;             //内容
	private String coverpicture;        //封面图路径
	private int author;                 //作者
	private int readtimes;              //点击次数
	private int collections;            //收藏次数
	private int likes;                  //点赞次数
	private String creationtime;        //发布时间
	private int visible;                //是否可见
	private String type;                //新闻类型
	public News() {
		// TODO Auto-generated constructor stub
	}
	public News(int id, String title, String content, String coverpicture, int author, int readtimes, int collections,
			int likes, String creationtime, int visible, String type) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.coverpicture = coverpicture;
		this.author = author;
		this.readtimes = readtimes;
		this.collections = collections;
		this.likes = likes;
		this.creationtime = creationtime;
		this.visible = visible;
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCoverpicture() {
		return coverpicture;
	}
	public void setCoverpicture(String coverpicture) {
		this.coverpicture = coverpicture;
	}
	public int getAuthor() {
		return author;
	}
	public void setAuthor(int author) {
		this.author = author;
	}
	public int getReadtimes() {
		return readtimes;
	}
	public void setReadtimes(int readtimes) {
		this.readtimes = readtimes;
	}
	public int getCollections() {
		return collections;
	}
	public void setCollections(int collections) {
		this.collections = collections;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public String getCreationtime() {
		return creationtime;
	}
	public void setCreationtime(String creationtime) {
		this.creationtime = creationtime;
	}
	public int getVisible() {
		return visible;
	}
	public void setVisible(int visible) {
		this.visible = visible;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", content=" + content + ", coverpicture=" + coverpicture
				+ ", author=" + author + ", readtimes=" + readtimes + ", collections=" + collections + ", likes="
				+ likes + ", creationtime=" + creationtime + ", visible=" + visible + ", type=" + type + "]";
	}
	
	
}     

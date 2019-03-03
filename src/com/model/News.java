package com.model;

public class News {
	
	private int id;
	
	public News(int id, String title, String content, String publish,
			String creater) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.publish = publish;
		this.creater = creater;
	}

	private String title;
	
	private String content;
	
	
	private String publish;
	
	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", content=" + content
				+ ", publish=" + publish + ", creater=" + creater + "]";
	}

	public News() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String creater;

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

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

}

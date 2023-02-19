package com.sai.spring.jpa.postgresql.model;

import javax.persistence.*;

@Entity
@Table(name = "tutorials")
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;
	
	@Column(name = "official_refrence_links")
	private String officalRefLinks;

	@Column(name = "published")
	private boolean published;

	public Tutorial() {

	}

	public Tutorial(String title, String description,String officalRefLinks, boolean published) {
		this.title = title;
		this.description = description;
		this.published = published;
		this.officalRefLinks = officalRefLinks;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

	public String getOfficalRefLinks() {
		return officalRefLinks;
	}

	public void setOfficalRefLinks(String officalRefLinks) {
		this.officalRefLinks = officalRefLinks;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean isPublished) {
		this.published = isPublished;
	}

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description +",officalRefLinks="+officalRefLinks+", published=" + published + "]";
	}

}

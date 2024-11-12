package com.SIGPAR.demo.dto;

import com.SIGPAR.demo.entities.Game;
import com.SIGPAR.demo.projections.GameMinProjection;

public class GameMinDTO {
	
	
	private long    id;
	private String  title;	
	private Integer year;
	private String  img_url;
	private String  short_description;	
	
	
	
	public  GameMinDTO() {}


	public GameMinDTO(Game entity) {
		
		this.id                 = entity.getId();
		this.title              = entity.getTitle();
		this.year               = entity.getYear();
		this.img_url            = entity.getImgUrl();
		this.short_description  = entity.getShortDescription();
		
		
	}

	public GameMinDTO(GameMinProjection projection) {
		
		this.id                 = projection.getId();
		this.title              = projection.getTitle();
		this.year               = projection.getYear();
		this.img_url            = projection.getImgUrl();
		this.short_description  = projection.getShortDescription();
		
		
	}


	public long getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}


	public Integer getYear() {
		return year;
	}


	public String getImg_url() {
		return img_url;
	}


	public String getShort_description() {
		return short_description;
	}


	
	
	
	
}

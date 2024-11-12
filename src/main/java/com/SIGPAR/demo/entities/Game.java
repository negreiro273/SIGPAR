package com.SIGPAR.demo.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_game")
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long    id;
	private String  title;
	@Column(name = "game_year")
	private Integer year;
	private String  genre;
	private String  platforms;
	private Double  score;
	private String  img_url;
	@Column(columnDefinition = "TEXT")
	private String  short_description;
	@Column(columnDefinition = "TEXT")
	private String  long_description;
	
	public Game() {}

	public Game(long id, String title, Integer year, String genre, String platforms,Double  score, String img_url,
			String short_description, String long_description) {
		
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.platforms = platforms;
		this.score =  score;
		this.img_url = img_url;
		this.short_description = short_description;
		this.long_description = long_description;
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatform() {
		return platforms;
	}

	public void setPlatform(String platforms) {
		this.platforms = platforms;
	}
	
	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getImgUrl() {
		return img_url;
	}

	public void setImgUrl(String img_url) {
		this.img_url = img_url;
	}

	public String getShortDescription() {
		return short_description;
	}

	public void setShortDescription(String short_description) {
		this.short_description = short_description;
	}

	public String getLongDescription() {
		return long_description;
	}

	public void setLongDescription(String long_description) {
		this.long_description = long_description;
	}
	
    // Para Comparar um Objeto com o Outro
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return id == other.id;
	}
	
	
	
	
}

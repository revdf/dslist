package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
/*ANOTEIXON KKKK   configura a classe java para que ela seja 
igual a uma tabela do BANCO DE DADOS
Ctrl + Shift + O  para importar a biblioteca nescesaria 
para o Entity          */

@Table(name = "tb_game") // CUSTOMIZA A TABELA DO BANCO DE DADOS
public class Game {

	@Id               //configura o id como chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)   // AUTOENCREMENT 
	private Long id;
	private String title;
	
	@Column(name = "game_year")  // CUSTOMIZA a palavra RESERVADA
	private Integer year;    //**year é uma palavra reservada em banco de dados
	private String genre;
	private String plataforms;
	private Double score;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	
	public Game() {
	}


	public Game(Long id, String title, Integer year, String genre, String plataforms, Double score, String imgUrl,
			String shortDescription, String longDescription) {
	
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.plataforms = plataforms;
		this.score = score;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
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


	public String getPlataforms() {
		return plataforms;
	}


	public void setPlataforms(String plataforms) {
		this.plataforms = plataforms;
	}


	public Double getScore() {
		return score;
	}


	public void setScore(Double score) {
		this.score = score;
	}


	public String getImgUrl() {
		return imgUrl;
	}


	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}


	public String getShortDescription() {
		return shortDescription;
	}


	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}


	public String getLongDescription() {
		return longDescription;
	}


	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

// compara se dois ou mais games sao iguais ele COMPARA OS OBJETOS
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}
	
}

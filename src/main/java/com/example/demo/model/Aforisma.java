package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "aforismi")
public class Aforisma {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "testo")
	private String testo;
	public Aforisma() {
	}
	public Aforisma(String testo) {
		this.testo = testo;
	}
	public Aforisma(Integer id, String testo) {
		this.id = id;
		this.testo = testo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTesto() {
		return testo;
	}
	public void setTesto(String testo) {
		this.testo = testo;
	}
	@Override
	public String toString() {
		return "Aforisma [id=" + id + ", testo=" + testo + "]";
	}
}

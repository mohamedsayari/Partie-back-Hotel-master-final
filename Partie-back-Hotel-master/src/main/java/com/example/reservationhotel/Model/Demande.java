package com.example.reservationhotel.Model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.NotNull;


@Entity
public class Demande {
@Id
@GeneratedValue( strategy = GenerationType.IDENTITY)
 private long id;
 @NotNull
 private String nubpersonne;
 @NotNull
 private String delai;
 @NotNull
 private String date;
 @NotNull
 private String prix;
 
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getNubpersonne() {
	return nubpersonne;
}
public void setNubpersonne(String nubpersonne) {
	this.nubpersonne = nubpersonne;
}
public String getDelai() {
	return delai;
}
public void setDelai(String delai) {
	this.delai = delai;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getPrix() {
	return prix;
}
public void setPrix(String prix) {
	this.prix = prix;
}
 
}

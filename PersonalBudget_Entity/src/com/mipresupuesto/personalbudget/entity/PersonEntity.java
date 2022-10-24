package com.mipresupuesto.personalbudget.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;

@Entity
@Table(name="Person")
public class PersonEntity {
	
	@Id
	@Column(name="id")
	private UUID id;
	
	@Column(name="idCard")
	private String idCard;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="middleName")
	private String middleName;
	
	@Column(name="firstSurname")
	private String firstSurname;
	
	@Column(name="secondSurname")
	private String secondSurname;
	
	public PersonEntity() {
		
		setId(UtilUUID.DEFAULT_UUID);
		
		setIdCard("");
		setFirstName("");
		setMiddleName("");
		setFirstSurname("");
		setSecondSurname("");
		
	}
	
	public PersonEntity(UUID id, String idCard, String firstName, String middleName, String firstSurname,
			String secondSurname) {
		setId(id);
		setIdCard(idCard);
		setFirstName(firstName);
		setMiddleName(middleName);
		setFirstSurname(firstSurname);
		setSecondSurname(secondSurname);
		
	}
	public final UUID getId() {
		if (id == null) {
			setId(UtilUUID.DEFAULT_UUID);
		}
		return id;
	}
	public final void setId(UUID id) {
		this.id = id;
	}
	public final String getIdCard() {
		if (idCard == null) {
			setIdCard("");
		}
		return idCard;
	}
	public final void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public final String getFirstName() {
		return firstName;
	}
	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public final String getMiddleName() {
		return middleName;
	}
	public final void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public final String getFirstSurname() {
		return firstSurname;
	}
	public final void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}
	public final String getSecondSurname() {
		return secondSurname;
	}
	public final void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}
	
	
	
	
}

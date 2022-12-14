package com.mipresupuesto.personalbudget.domain.builder;

import java.util.UUID;

import com.mipresupuesto.personalbudget.domain.YearDomain;

public final class YearDomainBuilder {
	
	private UUID id; 
	private int year;
	
	private YearDomainBuilder() {
		
		setId(UUID.randomUUID());
		setYear(0);
	}
	
	public static final YearDomainBuilder get() {
		return new YearDomainBuilder();
	}

	public final YearDomainBuilder setId(final UUID id) {
		this.id = (id == null) ? UUID.randomUUID(): id;
		return this;
	}

	public final YearDomainBuilder setYear(final int year) {
		this.year = year;
		return this;
	}
	

	public YearDomain build() {
		return YearDomain.create(id, year); 
	}
	
	
//  estos getters se pueden omitir, cambiando setId() por id
//  se puede dejar directamente, para que sobren estos getters
//	private final UUID getId() {
//		return id;
//	}
//
//	private final int getYear() {
//		return year;
//	}
	
//	BLOQUE DE CODIGO NO VA EN ESTE OBJETO SOLO ES PARA USO DE METODO 
//	ejemplos para la creacion del año 
//	public static void main(String[] args) {
//		//construir los domain el builder es el que se cargo con la logica de creacion
//		
//		
//		YearDomain myYear = YearDomainBuilder.get().setYear(2020).build();
//		YearDomain myYearTwo = YearDomainBuilder.get().setId(null).build();
//		YearDomain myYearThree = YearDomainBuilder.get().setId(null).build();
//		YearDomain myYearFour = YearDomainBuilder.get().build();
//		YearDomain myYearFive = YearDomainBuilder.get().setYear(2020).setId(null).build();
//		
//	}
	
}

package com.mipresupuesto.personalbudget.application.service.dtoassembler.implementation;

import com.mipresupuesto.personalbudget.application.service.dtoassembler.DTOAssembler;
import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;
import com.mipresupuesto.personalbudget.domain.YearDomain;
import com.mipresupuesto.personalbudget.domain.builder.YearDomainBuilder;
import com.mipresupuesto.personalbudget.dto.YearDTO;

public class YearDtoAssembler implements DTOAssembler<YearDTO, YearDomain> {
	
	

	@Override
	public YearDomain assembleDomain(YearDTO dto) {
		YearDomain domain = YearDomainBuilder.get().build();
		
		if (dto != null) {
			domain = YearDomainBuilder.get()
					.setId(UtilUUID.getUUIDFromString(dto.getId()))
					.setYear(dto.getYear()).build();
			
		}
		return domain;
	}

	@Override
	public final YearDTO assembleDTO(final YearDomain domain) {
		// TODO Auto-generated method stub
		YearDTO dto = new YearDTO();
		
		if (domain != null) {
			dto = new YearDTO(UtilUUID
					.getStringFromUUID(domain.getId()),domain.getYear());
		} 

		return dto;
	}
	
}
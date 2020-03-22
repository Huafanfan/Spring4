package com.huafanfan.service.impl;

import java.util.List;

import com.huafanfan.mapper.AirportMapper;
import com.huafanfan.pojo.Airport;
import com.huafanfan.service.AirportService;

public class AirportServiceImpl implements AirportService{
	private AirportMapper airportMapper;
	
	
	public AirportMapper getAirportMapper() {
		return airportMapper;
	}

	public void setAirportMapper(AirportMapper airportMapper) {
		this.airportMapper = airportMapper;
	}

	@Override
	public List<Airport> show() {
		return airportMapper.selAll();
	}

}

package com.fredyjimenezrendon.springangular.services;

import java.util.List;

import com.fredyjimenezrendon.springangular.beans.RailwayStation;

public interface RailwayStationService
{

	public List<RailwayStation> getAllRailwayStations();

	public RailwayStation getRailwayStationById(Long id);

	public boolean addRailwayStation(RailwayStation RailwayStation);

	public void deleteRailwayStationById(Long id);

	public void deleteAll();

	public void updateRailwayStation(RailwayStation RailwayStation);
}

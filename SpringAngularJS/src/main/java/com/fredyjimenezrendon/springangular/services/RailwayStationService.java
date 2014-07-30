package com.fredyjimenezrendon.springangular.services;

import com.fredyjimenezrendon.springangular.beans.RailwayStation;
import com.fredyjimenezrendon.springangular.controllers.RailwayStationController;

import java.util.List;

public interface RailwayStationService
{

	public List<RailwayStationController> getAllRailwayStations();

	public RailwayStation getRailwayStationById(Long id);

	public void addRailwayStation(RailwayStation RailwayStation);

	public void deleteRailwayStationById(Long id);

	public void deleteAll();

	public void updateRailwayStation(RailwayStation RailwayStation);
}

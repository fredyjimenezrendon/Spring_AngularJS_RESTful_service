package com.fredyjimenezrendon.springangular.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fredyjimenezrendon.springangular.beans.RailwayStation;
import com.fredyjimenezrendon.springangular.services.RailwayStationService;

@Service("RailwayStationService")
public class RailwayStationServiceImpl implements RailwayStationService
{

	private static List<RailwayStation> RailwayStationList = new ArrayList<RailwayStation>();
	private static Long id = 0L;

	public List<RailwayStation> getAllRailwayStations()
	{
		return RailwayStationList;
	}

	public RailwayStation getRailwayStationById(Long id)
	{
		return findRailwayStationById(id);
	}

	private RailwayStation findRailwayStationById(Long id)
	{
		for (RailwayStation rs: RailwayStationList)
		{
			if (rs.getId() == id)
			{
				return rs;
			}
		}

		return null;
	}

	public boolean addRailwayStation(RailwayStation railwayStation)
	{
		railwayStation.setId(++id);
		RailwayStationList.add(railwayStation);
		return true;

	}

	public void deleteRailwayStationById(Long id)
	{
		RailwayStation found = findRailwayStationById(id);
		if (found != null)
		{
			RailwayStationList.remove(found);
			id--;
		}

	}

	public void deleteAll()
	{
		RailwayStationList.clear();
		id = 0L;

	}

	public void updateRailwayStation(RailwayStation railwayStation)
	{
		RailwayStation found = findRailwayStationById(railwayStation.getId());
		if (found != null)
		{
			RailwayStationList.remove(found);
			RailwayStationList.add(railwayStation);
		}

	}

}

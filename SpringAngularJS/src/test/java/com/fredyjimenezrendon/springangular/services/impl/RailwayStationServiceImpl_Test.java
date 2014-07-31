package com.fredyjimenezrendon.springangular.services.impl;

import java.util.Arrays;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.fredyjimenezrendon.springangular.beans.RailwayStation;

@RunWith(value = Parameterized.class)
public class RailwayStationServiceImpl_Test
{
	private Boolean contains;
	private RailwayStation railwayStation;
	private RailwayStationServiceImpl railwayStationServiceImpl;

	@Before
	public void initialize()
	{
		railwayStationServiceImpl = new RailwayStationServiceImpl();
	}

	@Parameters
	public static Iterable<Object[]> data()
	{
		RailwayStation buenosAires = new RailwayStation();
		buenosAires.setId(1L);
		buenosAires.setName("Buenos aires");
		RailwayStation cartagena = new RailwayStation();
		buenosAires.setId(1L);
		buenosAires.setName("Cartagena");
		RailwayStation sanFrancisco = new RailwayStation();
		buenosAires.setId(3L);
		buenosAires.setName("San Francisco");
		Object[][] data = new Object[][] { { true, buenosAires }, { true, cartagena }, { true, sanFrancisco } };

		return Arrays.asList(data);
	}

	public RailwayStationServiceImpl_Test(Boolean contains, RailwayStation railwayStation)
	{
		this.contains = contains;
		this.railwayStation = railwayStation;
	}

	@Test
	public void americaStations()
	{

		// Arrange
		// Parametrized Test

		// Act
		Boolean result = railwayStationServiceImpl.addRailwayStation(railwayStation);

		// Assert
		Assert.assertEquals(contains.booleanValue(), result.booleanValue());

	}

}

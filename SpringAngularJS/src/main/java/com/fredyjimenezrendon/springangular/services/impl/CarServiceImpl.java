package com.fredyjimenezrendon.springangular.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.fredyjimenezrendon.springangular.services.CarService;

@Service("carService")
public class CarServiceImpl implements CarService
{
	private static List<String> carList = new ArrayList<String>();
	Logger logger = Logger.getLogger("MyLogger");

	public List<String> getAllCars()
	{
		logger.setLevel(Level.INFO);
		logger.info(carList.toString());
		return carList;
	}

	public void addCar(String car)
	{
		carList.add(car);

	}

	public void deleteCar(String car)
	{
		if (carList.contains(car))
		{
			carList.remove(car);
		}

	}

	public void deleteAll()
	{
		carList.clear();

	}

}

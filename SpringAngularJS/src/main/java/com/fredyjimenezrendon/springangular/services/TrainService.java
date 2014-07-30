package com.fredyjimenezrendon.springangular.services;

import java.util.List;

import com.fredyjimenezrendon.springangular.beans.Train;

public interface TrainService
{
	public List<Train> getAllTrains();

	public Train getTrainById(Long id);

	public void addTrain(Train train);

	public void deleteTrainById(Long id);

	public void deleteAll();

	public void updateTrain(Train train);
}

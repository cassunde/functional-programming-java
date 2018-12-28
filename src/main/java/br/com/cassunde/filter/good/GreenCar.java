package br.com.cassunde.filter.good;

import br.com.cassunde.Car;

public class GreenCar implements CarPredicate{

	@Override
	public boolean test(Car car) {
		return car.getColor().equals("Green");
	}
}

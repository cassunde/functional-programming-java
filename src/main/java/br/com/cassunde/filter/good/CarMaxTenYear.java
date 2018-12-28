package br.com.cassunde.filter.good;

import java.time.LocalDate;

import br.com.cassunde.Car;

public class CarMaxTenYear implements CarPredicate{

	@Override
	public boolean test(Car car) {
		return car.getYear() >= LocalDate.now().getYear() - 10;
	}
}

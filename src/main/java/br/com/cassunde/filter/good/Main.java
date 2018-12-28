package br.com.cassunde.filter.good;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.cassunde.Car;

/**
 * 
 * Hummm <br> This example is interesting, exist only method generic, 
 * we transfer the responsibility of the conditions for an specific implementation 
 * 
 * see {@link CarPredicate}, and {@link GreenCar} and {@link CarMaxTenYear}
 *
 * */
public class Main {

	private static List<Car> filterCar(List<Car> cars, CarPredicate predicate){
		
		List<Car> result = new ArrayList<>();
		
		for( Car car : cars ) {
			if( predicate.test(car) ) {
				result.add(car);
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		List<Car> cars = Arrays.asList(new Car("Green", 2017), new Car("Red", 2016), new Car("Black", 1995));
		
		System.out.println(filterCar(cars, new GreenCar()));
		System.out.println(filterCar(cars, new CarMaxTenYear()));
		
		//without lambda
		System.out.println(filterCar(cars, new CarPredicate() {

			@Override
			public boolean test(Car car) {
				return car.getColor().equals("Red");
			}
		}));
		
		//With lambda
		System.out.println(filterCar(cars, car -> car.getColor().equals("Red")));
	}
}

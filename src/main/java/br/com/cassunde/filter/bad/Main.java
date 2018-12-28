package br.com.cassunde.filter.bad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.cassunde.Car;

/**
 * 
 * This example is very bad, if you need create some filters, 
 * you should some methods to filter the List of Car.
 *
 * */
public class Main {

	private static List<Car> filterGreenCar(List<Car> cars){
		
		List<Car> result = new ArrayList<>();
		
		for( Car car : cars ) {
			if( car.getColor().equals("Green") ) {
				result.add(car);
			}
		}
		
		return result;
	}
	
	private static List<Car> filterRedCar(List<Car> cars){
		
		List<Car> result = new ArrayList<>();
		
		for( Car car : cars ) {
			if( car.getColor().equals("Red") ) {
				result.add(car);
			}
		}
		
		return result;
	}
	
	/*
	
	private static List<Car> filterNewCondition(List<Car> cars){
		
		...
	}
	
	*/
	
	public static void main(String[] args) {
		
		List<Car> cars = Arrays.asList(new Car("Green", 2017), new Car("Red", 2016), new Car("Black", 1995));
		
		System.out.println(filterGreenCar(cars));
		System.out.println(filterRedCar(cars));
	}
}

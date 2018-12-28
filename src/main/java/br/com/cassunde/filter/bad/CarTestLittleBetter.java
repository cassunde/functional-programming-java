package br.com.cassunde.filter.bad;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.cassunde.Car;

/**
 * 
 * This example is Less bad, When you need filter by one Field, now exist only one method, the:
 * 
 *  <b>filterCarByColor</b>
 *  
 *  But now i need filtered by Year, create new method... the <b>filterCarWithMaxTenYear</b>
 *  
 *  This example is still bad
 *
 * */
public class CarTestLittleBetter {

	private static List<Car> filterCarByColor(List<Car> cars, String color){
		
		List<Car> result = new ArrayList<>();
		
		for( Car car : cars ) {
			if( car.getColor().equals(color) ) {
				result.add(car);
			}
		}
		
		return result;
	}
	
	private static List<Car> filterCarWithMaxTenYear(List<Car> cars){
		
		List<Car> result = new ArrayList<>();
		
		for( Car car : cars ) {
			if( car.getYear() >= LocalDate.now().getYear() - 10 ) {
				result.add(car);
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		List<Car> cars = Arrays.asList(new Car("Green", 2017), new Car("Red", 2016), new Car("Black", 1995));
		
		System.out.println(filterCarByColor(cars, "Green"));
		System.out.println(filterCarByColor(cars, "Red"));
		System.out.println(filterCarWithMaxTenYear(cars));
	}
}

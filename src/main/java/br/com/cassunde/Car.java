package br.com.cassunde;


/**
 * Simple class represent model Car
 * */
public class Car {

	private String name;
	private String color;
	private int year;

	public Car(String color, int year) {
		this.name = "Gol";
		this.color = color;
		this.year = year;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", year=" + year + "]";
	}
}

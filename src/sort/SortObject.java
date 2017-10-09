package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortObject {
	
	private static final List<Car> cars = new ArrayList<Car>(Arrays.asList(
			new Car("Padmini", "Fiat", 100008.00),
			new Car("XYlo", "Mahindra", 100000.00),
			new Car("Swift", "Maruti", 200000.00)					
			));
	public static void sortIt(){
		Collections.sort(cars,new NameComparator());
	}
	
	public static void sortItCost(){
		Collections.sort(cars,new CostComparator());
	}
	public static void main(String[] args) {
		SortObject.sortItCost();
		for(Car car : cars){
			System.out.print(car.getName()+ " ");
			System.out.print(car.getBrand() + " ");
			System.out.print(car.getCost() + " ");
			System.out.println();
		}

	}

}

class NameComparator implements Comparator<Car>{

	@Override
	public int compare(Car car1, Car car2) {
		// TODO Auto-generated method stub
		return car1.getName().compareTo(car2.getName());
	}
	
}

class CostComparator implements Comparator<Car>{

	@Override
	public int compare(Car o1, Car o2) {
		// TODO Auto-generated method stub
		return new Double(o1.getCost()).compareTo(new Double(o2.getCost()));
	}
	
}


class Car {

    private String name;
    private String brand;
    private double cost;

    public Car(String name, String brand, double cost) {

        this.name = name;
        this.brand = brand;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String toString() {

        return getName();
    }

}

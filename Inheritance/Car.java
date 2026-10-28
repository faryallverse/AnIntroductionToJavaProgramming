//SubClass of Vehicle
public class Car extends Vehicle{
	int cc;
	int gears;

	public void displayCarAttributes(){
		//Using the attribuutes of the superclass
		System.out.println("Color of the car: " + color);
		System.out.println("Speed of the car: " + speed);
		System.out.println("Size of the car: " + size);
		//Using its own attributes
		System.out.println("CC of the car: " + cc);
		System.out.println("Number of gears of the car: " + gears);
	}
}
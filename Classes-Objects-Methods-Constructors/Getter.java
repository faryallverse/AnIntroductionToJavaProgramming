class Person{
	String name;
	int age;

	void speak(){
		System.out.println("My name is " + name + ".");
	}

	int yearsToRetirement(){
		int yearsLeft = 65 - age;
		return yearsLeft;
	}

	int getAge(){
		return age;
	}

	String getName(){
		return name;
	}
}

public class Getter{
	public static void main(String[] args){
		Person p1 = new Person();

		p1.name = "Iqra Sarfraz";
		p1.age = 30;

		int years = p1.yearsToRetirement();
		System.out.println("Years till retirement: " + years);

		int age = p1.getAge();
		String name = p1.getName();

		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
class Student{

	int id;
	String name;

	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean bool;
	String text;

	//No construct is explicitly created. Thus, the compiler is gonna generate a default one.

	void display(){
		System.out.println(id + " " + name);
	}

	void displayDefaultValues(){
		System.out.println("\nDefault values for different data types: ");
		System.out.println("byte: " + b);
		System.out.println("short: " + s);
		System.out.println("int: " + i);
		System.out.println("long: " + l);
		System.out.println("float: " + f);
		System.out.println("double: " + d);
		System.out.println("char: " + c);
		System.out.println("boolean: " + bool);
		System.out.println("Reference Data Type (String) : " + text);
	}

	static void main(String[] args){
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.display();
		s2.display();
		s3.displayDefaultValues();
	}
}
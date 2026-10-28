public class MyToString{
	int id;
	String name;
	final String UNI = "CUI LAHORE";

	public MyToString(int id, String name){
		this.id = id;
		this.name = name;
	}

	//Overriding the toString() method
	public String toString(){
		return "MyToString{Name: " + name + " ID: " + String.format("%03d", id)  + " University: " + UNI + "}";
	}

	public static void main(String[] args){
		MyToString s1 = new MyToString(19, "Faryal Sarfraz");
		MyToString s2 = new MyToString(1, "LaLaLaLa OkOkOk");

		System.out.println(s1);
		System.out.println(s2);
	}
}
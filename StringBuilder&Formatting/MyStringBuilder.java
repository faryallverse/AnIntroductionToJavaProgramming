public class MyStringBuilder{
	public static void main(String[] args){
		
		/*In the following method, because String is immutable, every time the operator += is used,
		Java creates a brand new String object in memory and discards the old one.
		This results in 4 different string objects being created sequentially just to print one line.
		While Java's compiler dynamically optimizes simple, single-line concatenations (like "A" + "B"),
		it cannot efficiently optimize complex concatenations or loops.
		Making the following simple String way to print the text inefficient.

		String info = " ";
		info += "My name is Faryal." ;
		info += " ";
		info += "I am a programmer.";

		System.out.println(info);*/

		//String Builder method creates a String and then modify it using different functions.

		//Create a single StringBuilder(built-in class) object
		StringBuilder sb1 = new StringBuilder(" ");
		//Append text directly to the existing object
		sb1.append("My name is Faryal.");
		sb1.append(" ");
		sb1.append("I am a programmer.");

		//toString(): Convert it to a normal String when you are ready to print
		System.out.println(sb1.toString());

		StringBuilder sb2 = new StringBuilder(" Hello");
		sb2.append(" ");
		sb2.insert(1, "Java"); //insert(i, "text"): Inserts text at the index number i of whatever is stored in sb2
		sb2.append("!");
		sb2.append(" What y'all doin'?");
		sb2.replace(13,23, "How you");
		sb2.append("lalaala");
		sb2.delete(27,34); //(i, y): i is inclusivs, y is exclusive
		System.out.println(sb2.toString());
	}
}

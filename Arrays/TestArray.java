public class TestArray{
	public static void main(String[] args){
		double[] myList = {0.33, 8.77, 4.555, 7.5343};
		
		//Printing the array elements
		for(int i = 0; i < myList.length; i++){
			System.out.print(myList[i] + " ");
		}

		//Summing all the elements
		double total = 0;
		for(int i = 0; i < myList.length; i++){
			total += myList[i];
		}
		System.out.println("\nTotal: " + total);

		//Subtracting all the elements
		double difference = 0;
		for(int i = 0; i < myList.length; i++){
			difference -= myList[i];
		}
		System.out.println("Difference: " + difference);
	}
}

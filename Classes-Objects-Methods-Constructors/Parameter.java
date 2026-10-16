public class Parameter{
	public static void main(String[] args){
		int a = 177;
		int b = 1829;
		int c = smallNum(a, b);
		System.out.println("Smaller Number: " + c);
	}

	//Function with two parameters
	public static int smallNum(int n1, int n2){
		int min;
		if (n1 > n2)
			min = n2;
		else
			min = n1;

		return min;
	}
}
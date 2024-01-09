import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		System.out.println("Hello World");
		Scanner scanner = new Scanner(System.in);
		Scanner scanForStr = new Scanner(System.in);

		System.out.println("enter first number: ");
		int a = scanner.nextInt();

		System.out.println("enter second number: ");
		int b = scanner.nextInt();

		switch(scanForStr.nextline){
			case "+" -> System.out.println(a+b);
			case "-" -> System.out.println(a-b);
			case "*" -> System.out.println(a*b);
			case "/" -> System.out.println(a/b);
                }
		int[] nums = new int []{1,2,3,4,5};
		int summa = 0;
		for (int i = 0; i < nums.length; i++){
			sum += nums[i];
		}
		System.out.println(sum);

		System.out.println("enter the number");
		int n = scanner.nextInt();
		if(n > 0){
			System.out.println("On san");
		}else if(n < 0){
			System.out.println("Ters san");
		}else System.out.print("Nol");

		for (int i = 0; i < 10; i++){
			System.out.println("i");
                }


		

	}
}

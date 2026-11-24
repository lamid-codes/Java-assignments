import java.util.Scanner;
public class average{
	public static void main(String...args){
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int count = 0;
		while (count != -1){
			System.out.print("Enter a number: ");
			int number = input.nextInt();
			number += counter;
			count += 1;
			int average = number / count;
			System.out.println(average);
		}
	}
}
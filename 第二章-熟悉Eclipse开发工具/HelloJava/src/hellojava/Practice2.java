package hellojava;
import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("请输入第一个数：");
			double i1 = sc.nextInt();
			System.out.println("请输入第二个数：");
			double i2 = sc.nextInt();
			// int i1 = 123;
			// int i2 = 456;
			double sum = i1 + i2;
			double substract = i1 - i2;
			double divide = i1/i2;
			System.out.println("Sum: " + sum);
			System.out.println("Substract: " + substract);
			System.out.println("Divide: " + divide);
		}
	}

}

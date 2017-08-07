package demopgm;

import java.util.Scanner;

public class fibonacciSeries {
	public static void main(String a[]) {
		System.out.println("Enter any no.which u want Series:");
		Scanner sc = new Scanner(System.in);
		int febCount = sc.nextInt();
		int[] feb = new int[febCount];
		feb[0] = 0;
		feb[1] = 1;
		for (int i = 2; i < febCount; i++) {
			feb[i] = feb[i - 1] + feb[i - 2];
		}
		System.out.println("fibonacciSeries");
		for (int i = 0; i < febCount; i++) {
			System.out.print(feb[i] + " ");
		}
	}

}

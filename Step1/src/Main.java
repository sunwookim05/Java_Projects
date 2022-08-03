import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int a = sc.nextInt();
		int cnt = 0;
		for (int j = 0; j < a; j++) {
			for (int i = 0; i < a; i++) {
				System.out.print(cnt + " ");
				cnt++;
			}
			System.out.println();
		}
	}
}

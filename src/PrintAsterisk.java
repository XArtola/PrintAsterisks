
/**
 * 
 */
import java.util.Scanner;

/**
 * @author ik013043z1
 *
 */
public class PrintAsterisk {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		boolean end = false;

		while (!end) {

			System.out.println("Please enter the height of the pyramid");

			String height = sc.next();

			while (!(height.matches("^[0-9]+"))) {

				System.out.println("Please enter a number and only a number");
				height = sc.next();

			}

			int heightInt = Integer.parseInt(height);

			for (int a = 1; a < heightInt; a++) {

				for (int b = 0; b < a; b++) {

					System.out.print("*");

				}

				System.out.println("\n");

			}

			System.out.println("Do you want to continue?[y/n] \n");

			char option = sc.next().charAt(0);

			while (option != 'y' && option != 'n') {

				System.out.println("This is not a valid option, please enter y or n\n");

				option = sc.next().charAt(0);
			}

			if (option == 'n') {

				end = true;

				System.out.println("Bye bye");

			}

		}

	}

}

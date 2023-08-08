import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Enter the amount: ");
			double amount = sc.nextDouble();

			sc.nextLine();
			System.out.print("Enter the source currency (e.g., USD): ");
			String sourceCurrency = sc.nextLine().toUpperCase();

			System.out.print("Enter the target currency (e.g., EUR): ");
			String targetCurrency = sc.nextLine().toUpperCase();

			double convertedAmount = amount * convertedAmount(sourceCurrency, targetCurrency);
			if (convertedAmount != -1) {
				System.out.println("Converted amount: " + convertedAmount + " " + targetCurrency);
			} else
				System.out.println("Invalid currency code(s).");

			System.out.print("Do you want to perform another conversion? (yes/no): ");
			String anotherConversion = sc.nextLine().toLowerCase();
			if (!anotherConversion.equals("yes")) {
				break;
			}
		}
		System.out.println("Thank you for using the currency converter!");
		sc.close();
	}
	private static double convertedAmount(String sourceCurrency, String targetCurrency){

		if(sourceCurrency.equals("USD") && targetCurrency.equals("EUR")) {
			return 0.91;
		}else if (sourceCurrency.equals("USD") && targetCurrency.equals("RUP")) {
			return 82.88;
		}else if (sourceCurrency.equals("USD") && targetCurrency.equals("YEN")) {
			return 143.23;
		}else if (sourceCurrency.equals("EUR") && targetCurrency.equals("USD")) {
			return 1.09;
		}else if (sourceCurrency.equals("EUR") && targetCurrency.equals("RUP")) {
			return 90.74;
		}else if (sourceCurrency.equals("EUR") && targetCurrency.equals("YEN")) {
			return 156.81;
		}else if (sourceCurrency.equals("RUP") && targetCurrency.equals("USD")) {
			return 0.012;
		}else if (sourceCurrency.equals("RUP") && targetCurrency.equals("EUR")) {
			return 0.011;
		}else if(sourceCurrency.equals("RUP")&& targetCurrency.equals("YEN")){
			return 1.73;
		}else if(sourceCurrency.equals("YEN")&& targetCurrency.equals("USD")) {
			return 0.0070;
		}else if(sourceCurrency.equals("YEN")&& targetCurrency.equals("EUR")) {
			return 0.0064;
		}else if(sourceCurrency.equals("YEN")&& targetCurrency.equals("RUP")) {
			return 0.58;
		}
		return 0;
	}
}





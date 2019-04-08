import java.util.Random;
import java.util.Scanner;
public class zadanie1 {
	public static void main (String[] args)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Random liczLos = new Random();
		int liczba;
		int liczbaUser, i = 0;
		String answer = "";
		do {
			liczba = liczLos.nextInt(2);
			i = i + 1;
			System.out.println("Podaj liczbe: ");
			liczbaUser = input.nextInt();
			if (liczbaUser > liczba)
			{
				System.out.println("Liczba jest WIEKSZA od wylosowanej.");
			}
			else if (liczbaUser < liczba)
			{
				System.out.println("Liczba jest MNIEJSZA od wylosowanej.");
			}
			else if (liczbaUser == liczba)
			{
				System.out.printf("Zgadles po %d probie!\n", i);
				System.out.printf("Chcialbys zagrac ponownie?: ");
				answer = input.next();
				if (answer.equals("tak"))
						{
							i = 0;
						}
				else if (answer.equals("nie"))
				{
					return;
				}
			}
		} 
		while (liczba != liczbaUser || answer.equals("tak"));
	}
}

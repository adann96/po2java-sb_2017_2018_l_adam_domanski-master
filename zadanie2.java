public class zadanie2 {
	public static void main (String[] args)
	{
		if(args.length != 3) {
			System.out.println("Zła liczba argumentów!");
			return;
		}
		try {
			
			int i = Integer.parseInt(args[1]);
			int j = Integer.parseInt(args[2]);
			System.out.println(args[0].substring(i, j + 1));
		} 
		
		catch(NumberFormatException e) {
			System.out.println("Nie podałeś liczb: " + e.getLocalizedMessage());
		} 
		
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Nieprawidłowe indeksy: " + e.getLocalizedMessage());
		}

	}
}
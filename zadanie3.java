public class zadanie3 {

	public static void main(String[] args) {
		if(args.length < 3) {
			System.out.println("Za ma�o parametr�w");
			return;
		}
		try {
			Integer a, b, c;
			a = Integer.valueOf(args[0]);
			b = Integer.valueOf(args[1]);
			c = Integer.valueOf(args[2]);
			
			if(a.intValue() == 0) {
				System.out.println("To nie jest r�wnanie kwadratowe.");
				return;
			}
			
			int d = b.intValue() * b.intValue() - 4 * a.intValue() * c.intValue();
			
			if(d < 0) 
				{
				System.out.println("Brak pierwiastk�w rzeczywistych.");
				} 
				else if(d == 0) 
				{
				int x = -b.intValue() / (2 * a.intValue());
				System.out.println("Jeden pierwiastek: " + x);
				} 
				else 
				{
				double sd = Math.sqrt(d);
				double x1 = (-b.intValue() - sd) / (2 * a.intValue());
				double x2 = (-b.intValue() + sd) / (2 * a.intValue());
				System.out.println("Dwa pierwiastki: " + x1 + " i " + x2);
				}
		}
		catch(NumberFormatException e) {
			System.out.println("Z�y format liczby: " + e.getLocalizedMessage());
		}

	}

}

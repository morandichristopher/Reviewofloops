public class TempConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Fehrenheit       Celsius");
		
		
		for (int i = 0; i <= 212; i = i + 2) {
			int fahrenheit = i;
			double celsius = (i-32) / 1.8;
			  System.out.printf("%d                %.2f \n", fahrenheit, celsius);
			}
		System.out.println();
		System.out.println("Celsius          Fehrenheit");
		
		
		 for (int i = 0; i <= 100; i = i + 2) {
			 int celsius = i;
			 double fehrenheit = i * 1.8 + 32;
			  System.out.printf("%d                 %.2f  \n"    , celsius, fehrenheit);
		
			}
	}

}

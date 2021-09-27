
public class US2Metric {

	public static void main(String[] args) {
		
		System.out.println("US2Metric");
		//TODO: part 1 of lab
	
	System.out.println("inches        centimeters        pounds        kilograms");
	System.out.println("------        -----------        ------        ---------");
	
	for(int i = 1; i <= 50; i++) {
		double centi=i*2.54;
		double kilo=i*0.45;
	System.out.printf("%d             %.2f               %d             %.2f\n", i, centi, i, kilo);
	
	
	}
	}
	
	


}

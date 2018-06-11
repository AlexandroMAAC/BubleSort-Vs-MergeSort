import java.util.Random;

public class Llenar {
	
	public int[] llenarArreglo (int [] a) {
		a = new int[20];
		Random r = new Random();
		
		for(int i = 0; i < a.length ; i++) {
			a[i] = r.nextInt();
		}
		return a;
		
	} 

}

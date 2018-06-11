
public class boubleSort {
	
	
	public int[] bublesort (int [] a) {
		for(int i = 0 ; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
		
	} 

}

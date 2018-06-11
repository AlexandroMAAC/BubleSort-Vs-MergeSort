import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		int n = 300;
		int [] rArray = new int[n];
		/////////////////////////////////////////////
		while(n < 40000) {
			
			
			long starTime = System.nanoTime();
			bubleSort(rArray);
			long endTime = System.nanoTime();
			long deltaTime = endTime - starTime;
			
			System.out.println("El tiempo en nano segundos de buble sort para " + n + " numeros es de = " +deltaTime);
			n+=n;
		}
		/////////////////////////////////////////////
		Random lr = new Random();
		LectorTeclado lt = new LectorTeclado();
		System.out.println("");
		System.out.println("Elija el tamano que quiere que sea el arreglo de buble sort y se le llenara automaticamente con numeros al azar : ");
		int t = lt.leerEntero("", "tiene que ser un entero"); 
		
		int [] nArray = new int [t] ;
		for (int i = 0 ; i < nArray.length ; i++) {
			nArray[i] = lr.nextInt(300);
		} 
		
		bubleSort(nArray);
		System.out.println("");
		System.out.println("");
		System.out.print("Este es buble sort :"); 
		System.out.println("");
		for (int i = 0 ; i < nArray.length; i++) {
			
			System.out.println(""+nArray[i]);
			
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		int u = 300;
		int [] eArray = new int[u];
        while(u < 40000) {
			
			
			long starTime = System.nanoTime();
			sort(eArray);
			long endTime = System.nanoTime();
			long deltaTime = endTime - starTime;
			
			System.out.println("El tiempo en nano segundos de merge sort para " + u + " numeros es de = " +deltaTime);
			u+=u;
		}
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
		/////////////////////////////////// mer
		
        
            

		System.out.println("Elija el tamano que quiere que sea el arreglo de merge sort y se le llenara automaticamente con numeros al azar : ");
		int o = lt.leerEntero("", "tiene que ser un entero");
		
		int [] mArray = new int [o] ;
		for (int i = 0 ; i < mArray.length ; i++) {
			mArray[i] = lr.nextInt(300);
		} 
		
		
		System.out.println("");
		System.out.println("");
		sort(mArray);
		System.out.print("Este es merge sort");
		System.out.println("");
		System.out.print("");
		System.out.print("");
		
        for (int i = 0 ; i < mArray.length; i++) {
			
			System.out.println(""+mArray[i]);
			
		}
	
		
		
	}
	
	////////////////////////////////
	
	public static int[] llenarArreglo (int [] a) {
		a = new int[15];
		Random r = new Random();
		
		for(int i = 0; i < a.length ; i++) {
			a[i] = r.nextInt();
		}
		return a;
	} 
	///////////////////////
	
	
	//////////////// burbuja
	
	public static int[] bubleSort (int [] a) {
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
	//////////////merge
	 
	
	public static void merge(int [] n,int a,int b,int c,int d){ 
	    d = Math.min(d,n.length-1);    
	    int mer [] = new int[d-a + 1]; 
	    int idx = 0; 
	    int or = a; 
	    while( idx < mer.length) 
	      if((a>b ?false: (c>d? true : n[a] <= n[c]))) 
	        mer[idx++] = n[a++];         
	      else 
	        mer[idx++] = n[c++];                
	       
	    for(int i = 0; i < mer.length; i++) 
	      n[or + i] = mer[i];     
	  }   
	

	
	public static int[] sort(int []n){ 
	    int i = 1; 
	    for(i = 1; i < n.length;i*=2){ 
	      for(int j = 0;j < n.length; j += i){ 
	        int p = i >> 1; 
	        merge(n,j,j+p-1,j+p,j+p+p-1); 
	      } 
	    } 
	    merge(n,0,i/2 - 1,i/2,n.length); 
	    return n; 
	  } 
	}

	


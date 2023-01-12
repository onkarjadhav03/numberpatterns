package numberPattern;

public class Pattern_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int nst=n;
		int row=1;
		int val=n;
		
		while(row<=n) {
		int cst=1;
		int cval=val;
        while(cst<=nst){
  
			System.out.print(cval+" ");
			cst++;
			cval--;
		}
		row++;
		System.out.println();
        }
	}

}

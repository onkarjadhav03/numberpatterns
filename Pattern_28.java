package numberPattern;

public class Pattern_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1,nst=1,nsp=n-1;
		int val=1;
		
		while(row<=n) {
			int csp=1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst=1;
			int cval=val;
			while(cst<=nst) {
				
				System.out.print(cval+ " ");
				if(cst<=nst/2) {
					cval++;
				}	
				else {
					cval--;
				}
				cst+=1;
				
			}
			nsp-=1;
			nst+=2;
			val++;
			row++;
			System.out.println();
		}
	}

}

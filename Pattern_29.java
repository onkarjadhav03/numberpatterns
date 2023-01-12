package numberPattern;

public class Pattern_29 {

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
				if(cst==1 || cst==nst)
				System.out.print(cval+ " ");
				else
					System.out.print("0 ");
				cst+=1;
				//cval++;
			}
			nsp-=1;
			nst+=2;
			val++;
			row++;
			System.out.println();
		}

	}

}

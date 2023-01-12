package numberPattern;

public class Pattern_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nst = 1;
		int row=1;
		int val=1;
		while(row<=2*n-1) {
          
			int cst=1;
            int cval=val;

			while(cst<=nst) {
                if(cst%2==0)
				System.out.print("* ");
                else
                System.out.print(cval+" ");
				cst++;
			}
            if(row<n){
                nst+=2;
                val++;
            }
            else{
                nst-=2;
                val--;
            }
            row++;
			System.out.println();
        } 
		
	}

}

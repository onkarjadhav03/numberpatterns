package numberPattern;

public class Pnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int nst = 1;
        int nsp=7;
		int row=1;
		
		while(row<=n) {
			int cst=1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}

            int csp=1;
            
            while(csp<=nsp){
                System.out.print("  ");
                csp++;
            }

            cst=1;
           
//            if(row==){
//                cst=2;
//            }
            while(cst<=nst){
            	
                System.out.print("* ");
                if(nst==n) {
                	
                }
                else {
                	cst++;
                }
                
            }
            if(row<n){
                nst++;
                nsp-=2;
            }
//            else{
//                nst+=1;
//                nsp-=1;
//            }

           row++;
		
			System.out.println();
		}

	}

}

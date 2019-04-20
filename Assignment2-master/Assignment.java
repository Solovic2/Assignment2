import java.util.Scanner;
import java.lang.Math;


public class Assignment {
	
	
	public static void BubbleSort (int[][] A) {
		int swapFlag = 1;
		
		int i, j;
		for(i = 0; i <A.length; i++) {
			if(swapFlag==0)break;
		swapFlag=0;
		for(j = 0; j < A.length-1-i; j++)
		if(A[j][1] < A[j+1][1]) {
		swap(A, j, j+1);
		swapFlag=1;
		}
		}
	}
	public static void swap (int[][] A, int a, int b) {
		int temp1 = A[a][0];
		int temp2 =A[a][1];
		A[a][0] = A[b][0];
		A[a][1] = A[b][1];
		A[b][0] = temp1;
		A[b][1] =temp2;
		}

	public static void main(String[] args) {
		
		System.out.println("Please choose an action:");
		System.out.println("------------------------\n");
		System.out.println("1- Set a polynomial variable\r\n" +
		"2- Print the value of a polynomial variable\r\n" + 
		"3- Add two polynomials\r\n" +
		"4- Subtract two polynomials\n"+
		"5- Multiply two polynomials\r\n" + 
		"6- Evaluate a polynomial at some point\r\n" + 
		"7- Clear a polynomial variable\n"+"8- Exet\n");
		
		
		Scanner take = new Scanner (System.in);
		PolynomialSolver ans =new PolynomialSolver();

		char choice ;
		String m;
		int Onum=0;
		Onum = take.nextInt();
		while(Onum!=8) {
		while(Onum>7||Onum<1) {
			System.out.println("Please choose an action:");
			Onum = take.nextInt();
		}
		
		if(Onum==1) {
			System.out.println("Insert the variable name: A, B or C");
			choice=take.next().charAt(0);
			while(choice!='A'&&choice!='B'&&choice!='C') {
				System.out.println("Please insert the variable name: A, B or C");
				choice=take.next().charAt(0);
			}
			System.out.println("Insert the polynomial terms in the form:\r\n" + 
					"(coeff1, exponent1), (coeff2, exponent2), ..");
			m=take.nextLine();
			m+=take.nextLine();
			//take.close();
			int size=0;
			for(int i=0;i<m.length();i++) {
				if(Character.isDigit(m.charAt(i)))size++;
			}
			int [][] terms= new int[size/2][2]; 
			int j,x=0,y=0,c=0;
			for(int i=0;i<m.length();i++) {
				if(Character.isDigit(m.charAt(i))) {
				    j=i+1;
					for(j=j;j<m.length();j++) {
						if(!(Character.isDigit(m.charAt(j))))break;
					}
					String e = m.substring(i,j);
					if(c%2==0) {
						terms[x][0]=(Integer.valueOf(e));
						c++;x++;
					}else {
						terms[y][1]=(Integer.valueOf(e));c++;y++;
					}
					i=j;
				}
				
			}
			BubbleSort(terms);
			ans.setPolynomial(choice, terms);
			
			
		}
		else if(Onum==2) {
			System.out.println("Insert the variable name: A, B or C");
			choice=take.next().charAt(0);
			String F=ans.print(choice);
			System.out.println(F);
		}
		else if(Onum==3) {
			
		}
		else if(Onum==4) {
			
		}
		else if(Onum==5) {
			
		}
		else if(Onum==6) {
			System.out.println("Insert the variable name: A, B or C");
			choice=take.next().charAt(0);
			float U,u;
			System.out.println("Entre the number");
			u=take.nextFloat();
			int x=ans.terns(choice);
			if(!ans.po[x].coeff.isEmpty()) {
			U=ans.evaluatePolynomial(choice,u );
			System.out.println("="+U);}
			else {System.out.println("This polynomial is empty");}
		}
		else if(Onum==7) {
			System.out.println("Insert the variable name: A, B or C");
			choice=take.next().charAt(0);
			ans.clearPolynomial(choice);
		}
		System.out.println("Please choose an action:");
		Onum = take.nextInt();
		}
	/*	m=take.nextLine();
		m+=take.nextLine();
		take.close();
		
		// end of insertion
	//	coeff.print();
	//	System.out.println();
	//	exponent.print();
		for(int i=0;i<(m.length()+4)/8;i++){
			System.out.println();
			for(j=0;j<2;j++) {
				System.out.print(terms[i][j]+"  ");
			}
		}*/
	
	}
}


public class PolynomialSolver {
	
	polynomials [] po = {new polynomials(),new polynomials(),new polynomials(),new polynomials()};
	
	public int terns (char poly) {
		 int i = 0;
	        switch (poly) {
	        case 'A':
	            i = 0;
	            break;
	        case 'B':
	            i = 1;
	            break;
	        case 'C':
	            i = 2;
	            break;
	        case 'R':
	            i = 3;
	            break;
	        }
	        return i;
	}
	
	 void setPolynomial(char poly, int[][] terms) {
		int x=terns(poly);
		
		po[x].coeff.clear();
		po[x].exponent.clear();
		for(int i=0;i<terms.length;i++) {
			po[x].coeff.add(terms[i][0]);
			po[x].exponent.add(terms[i][1]);
		}
		
	}
	 
	void clearPolynomial(char poly) {
		int x=terns(poly);
		po[x].coeff.clear();
		po[x].exponent.clear();
	}
	
	String print(char poly) {
		int x=terns(poly);
		String ans="";
		int size=po[x].coeff.getlength();
		
		for(int i=0;i<size;i++) {
			int c=po[x].coeff.get(i);
			int v=po[x].exponent.get(i);
			if(c!=0) {
			ans+=Integer.toString(c);
			if(v!=0) {ans+="x^";
			ans+=Integer.toString(v);}
			if(i+1!=size)ans+=" + ";
			}

		}
		
		return ans;
	}
	
	float evaluatePolynomial(char poly, float m) {
		int x=terns(poly);
		float ans=0;
		int size=po[x].coeff.getlength();
		for(int i=0;i<size;i++) {
			ans+=(po[x].coeff.get(i))*Math.pow(m,po[x].exponent.get(i));
		}
		return ans;
	}
	
}

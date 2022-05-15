package OOP;

public class Fraction {

   private	int numenator;
	private int denomenator;
	
	public Fraction(int numenator, int denomenator) {
		
		if(denomenator ==0) {
			denomenator =1;
		}
		
		  this.numenator = numenator;
		  this.denomenator = denomenator;
		  simplify();
	}
	
	 public void print() {
		 
		 System.out.println(numenator + "/"+ denomenator);
	 }
	 
	 private void  simplify() {
		 
		 int gcd =1;
		 int small = Math.min(numenator, denomenator);
		 for(int i=2; i<=small; i++) {
			 
			 if(numenator % i == 0 && denomenator % i == 0) {
				 
				 gcd =i;
			 }
		 }
		 
		 numenator = numenator/gcd;
		 denomenator = denomenator/gcd;
	 }

	public void increment() {
		
		numenator = numenator + denomenator;
		simplify();
		
	}

	public void add(Fraction f2) {
		
		this.numenator = this.numenator * f2.denomenator + this.denomenator * f2.numenator;
		
		this.denomenator = this.denomenator * f2.denomenator;
		simplify();
	}

	public static Fraction add(Fraction f1, Fraction f2) {
		
		int newNum = f1.numenator * f2.denomenator + f1.denomenator * f2.numenator;
		int newDen = f1.denomenator * f2.denomenator;
		
		Fraction f3 = new Fraction(newNum, newDen);
	
		return f3;
	}
	 
    
}

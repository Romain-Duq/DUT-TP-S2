public class Fraction {
	double num;
	double den;

	Fraction(double n, double d) {
		this.num = n;
		this.den = d;
	}

	public String toString() {
		return this.num + "/" + this.den;
	}

	double toCompare(Fraction f) {
		return (this.num / this.den) - (f.num / f.den);
	}

	Fraction somme(Fraction f) {
		return new Fraction(this.num*f.den+f.num*this.den,this.num*f.den);
		
	}
	
	void additionner(Fraction f){
		this.den=this.den*f.den;
		this.num=this.num*f.den+f.num*this.den;
	}
	
	Fraction produit(Fraction f){
		return new Fraction(this.num*f.num,this.den*f.den);
	}
	
	Fraction produit(int i){
		return new Fraction(this.num=this.num*i,this.den);
	}
	
	void multiplier(Fraction f){
		this.num=this.num*f.num;
		this.den=this.den*f.den;
	}
	
	void multipier(int i){
		this.num=this.num*i;
	}
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(3,4);
		System.out.println(f1.toString());
		Fraction f2 = new Fraction(1,2);
		System.out.println(f2.toString());
		
		f1.multiplier(f2);
		System.out.println(f1.toString());
		
	}
}

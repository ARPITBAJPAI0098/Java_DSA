package oopscoadingninja.encapsulation;

public class FractionUse {

	public static void temp() throws zeroDenominatorException {
		Fraction f1 = new Fraction(20, 190);
		f1.print();
		// 2/3

		f1.setNumerator(12);
		// 4/1
		int i = 10;
		try {
			f1.setDenominator(0);
			// if we palce
			i++;
		} catch (zeroDenominatorException e) {
			System.out.println("invalid input");
		}
		System.out.println(i);// here i willnot get printed as if error get cathed it will exit the loop
		int d = f1.getDenominator();
		System.out.println(d);
		f1.print();
		//
		f1.setNumerator(10);
		f1.setDenominator(30);// copiler here knows that thyis function will throw an eror but
		// donot know that that d=30 throw an exception or not thAT WHY the red line is
		// coming
		// sp as to alert you
		// you have two choices either handle the error or pass so for thiswrite in the
		// main function also
		// 1/3
		f1.print();
		//
		Fraction f2 = new Fraction(3, 4);
		f1.add(f2);
		f1.print();
		// f1 => 13/12
		f2.print();
		// f2 => 3/4
		//
		Fraction f3 = new Fraction(4, 5);
		f3.multiply(f2);
		f3.print();
		// f3 => 3/5
		f2.print();
		// f2 => 3/4
		//
		Fraction f4 = Fraction.add(f1, f3);
		f1.print();
		f3.print();
		f4.print();
	}

	public static void main(String[] args) throws zeroDenominatorException {
		temp();
	}

}

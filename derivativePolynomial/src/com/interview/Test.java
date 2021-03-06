package com.interview;

import java.util.ArrayList;
import java.util.List;

/* 
 * Theory:
 * 
 *    f(x) = 6 X�3 + 2 X�2 -X + 2
 *    
 *    f'(x) = 6.3 X�2 + 2.2 X -1  (multiply exp * coef and sub 1 from exp)
 *    
 */

public class Test {
	public static List<Term>derivative(List<Term> terms){
		List<Term> resp = new ArrayList<Term>();
		for (Term term: terms){
			if (term.exp > 0){
				Term t = new Term();
				t.exp = term.exp -1;
				t.coef = term.coef * term.exp;
				resp.add(t);
			}
		}
		return resp;
	}
	
	public static void main(String[] args) {
		Term t0 = new Term(0, 2);
		Term t1 = new Term(1, -1);
		Term t2 = new Term(2, 2);
		Term t3 = new Term(3, 6);
		
		List<Term> poly = new ArrayList<Term>();
		poly.add(t0);
		poly.add(t1);
		poly.add(t2);
		poly.add(t3);
		
		List<Term> resp = derivative(poly);
		
		for(Term t: resp){
			System.out.println(" " + t.coef + " X^" + t.exp);
		}
		
		System.out.println();
	}
}

class Term{
	int exp;
	double coef;
	
	public Term(){
		
	}
	
	public Term(int exp, double coef){
		this.exp = exp;
		this.coef = coef;
	}
}
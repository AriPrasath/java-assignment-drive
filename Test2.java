package ari;

import java.util.*;
class SortByBrand implements Comparator<Laptop>{

	@Override
	public int compare(Laptop p, Laptop q) {
		
		return p.brand.compareTo(q.brand);
		
	}
}

class SortByRam implements Comparator<Laptop>{

	@Override
	public int compare(Laptop p, Laptop q) {
		
		return q.ramGb - p.ramGb;
		
	}
}

class Laptop {
	
	String brand;
	double price;
	int ramGb;
	
	
	public Laptop(String brand, double price, int ramGb) {
		
		this.brand = brand;
		this.price = price;
		this.ramGb = ramGb;
		
	}
	
}


public class Test2 {

	public static ArrayList<Laptop> ar1 = new ArrayList<Laptop>();
	public static ArrayList<String> ar2 = new ArrayList<String>();
	public static SortByBrand sbb= new SortByBrand();
	
	public static void main(String[] args) {
		
		Laptop l1 = new Laptop("Apple", 238987.0, 16);
		Laptop l2 = new Laptop("Toshibha", 38000.0, 6);
		Laptop l3 = new Laptop("Dell", 48887.0, 8);
		Laptop l4 = new Laptop("HP", 14987.0, 2);
		Laptop l5 = new Laptop("Lenovo", 34000.0, 4);
		
		ar1.add(l1);
		ar1.add(l2);
		ar1.add(l3);
		ar1.add(l4);
		ar1.add(l5);
		
		
		ar2.add("Naveen");
		ar2.add("Ari");
		ar2.add("Dayan");
		ar2.add("Vidhul");
		
		Comparator c= Collections.reverseOrder();
		Collections.sort(ar2);
		
		System.out.println(ar2);
		
		Collections.sort(ar1, new SortByRam());
		
		ListIterator<Laptop> itr = ar1.listIterator(ar1.size());
		
		while(itr.hasPrevious()) {
			
			 Laptop temp = (Laptop) itr.previous();
			 System.out.println(temp.brand);
			 System.out.println(temp.price);
			 System.out.println(temp.ramGb);
			 System.out.println();
			 
		}
		
		
		
		
			
	}

}

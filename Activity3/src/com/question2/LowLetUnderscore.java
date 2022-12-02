package com.question2;

public class LowLetUnderscore {

	public static void main(String[] args) {
		 System.out.println(validate("shivani_kodre"));
			System.out.println(validate("Shivani_kodre"));
			System.out.println(validate("vaishnavi_Kodre"));		
			System.out.println(validate("Sadhana_Pawar"));	
	}
	 public static String validate(String text) {
		   if (text.matches("^[a-z]+_[a-z]+$"))
	                return "Found a match!";
	       else
	                return "Not matched!";
}
}
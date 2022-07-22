package simplelearn;

import java.util.regex.Pattern;

public class Expressionsexample {
  
		public static void main(String args[]){  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "raj2")); 
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "Kv5222")); 
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2")); 
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));
		}

	}



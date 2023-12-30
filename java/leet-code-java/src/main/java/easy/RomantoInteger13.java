package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomantoInteger13 {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("I",1);
		map.put("V",5);
		map.put("X",10);
		map.put("L",50);
		map.put("C",100);
		map.put("D",500);
		map.put("M",1000);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a roman number: ");
		String s = scanner.nextLine();
		s=s.replace("IV","IIII");
		s=s.replace("IX","VIIII");
		s=s.replace("XL","XXXX");
		s=s.replace("XC","LXXXX");
		s=s.replace("CD","CCCC");
		s=s.replace("CM","DCCCC");
		int sum = 0;
//		int l = rom.length() - 1;
//		while(l > -1) {
//			String cc = String.valueOf(rom.charAt(l));
//			String pc = l == 0? "0": String.valueOf(rom.charAt(l-1));
//			if(map.get(cc) != null) {
//				if(map.get(cc) > map.get(pc))
//					sum-= map.get(pc);
//				else
//					sum+= map.get(cc);
//			}
//			l--;
//		}
		for(int i = 0; i<s.length(); i++) {
			sum+= map.get(String.valueOf(s.charAt(i)));
		}
		
		System.out.println(""+s+" :"+sum);
	}

}

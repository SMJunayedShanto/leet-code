package easy;

import java.util.Arrays;

public class LongestCommonPrefix14 {
	
	public String longestCommonPrefix(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }

	public static void main(String[] args) {
//		String[] strs = {"flower","flow","flight"};
//		String[] strs = {"dog","racecar","car"};
		String[] strs = {""};
		String c = "";
		String c1 = "";
		String c2 = "";
		String w = "";
		
		for(int i = 0; i<strs.length; i++) {
			c = String.valueOf(strs[0].charAt(i));
			c1 = String.valueOf(strs[1].charAt(i));
			c2 = String.valueOf(strs[2].charAt(i));
			
			if(c.equalsIgnoreCase(c1) && c1.equalsIgnoreCase(c2)) {
				w+=c;
			}
		}
		System.out.println(w);
	}

}

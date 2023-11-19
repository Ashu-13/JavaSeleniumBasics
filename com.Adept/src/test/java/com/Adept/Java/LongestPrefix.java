package com.Adept.Java;

public class LongestPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s1 = {"flow","flower","flight"};
		
		System.out.println(longestCommonPrefix(s1));

	}
	
	public static String longestCommonPrefix(String[] strings) {
		if(strings == null || strings.length == 0) {
			return "";
		}
		String prefix = strings[0];
		for(int i=0; i< strings.length; i++) {
			int j = 0;
			while(j<prefix.length() && j<strings[i].length() && prefix.charAt(j) == strings[i].charAt(j)) {
				j++;
			}
			prefix = prefix.substring(0,j);
			if(prefix.isEmpty()) {
				return "";
			}
		}
		return prefix;
	}

}

class Solution {  	public static int romanToInt(String s) {

		HashMap<Character, Integer> romanMap = new HashMap<Character, Integer>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);

		int number = 0;

        int length = s.length();

		for(int i=0; i< length; i++){
			if(i < length-1 &&
				romanMap.get(s.charAt(i+1)) > romanMap.get(s.charAt(i))){
				number += romanMap.get(s.charAt(i+1)) - romanMap.get(s.charAt(i));
				i++;
				continue;
			}
			number += romanMap.get(s.charAt(i));
		}
		return number;
	}
}
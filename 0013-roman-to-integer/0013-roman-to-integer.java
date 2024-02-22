class Solution {  
	public static int romanToInt(String s) {

		HashMap<Character, Integer> romanMap = new HashMap<Character, Integer>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);

		int number = 0;

//         int num = romanMap.get(s.charAt(n - 1));
//         // Loop for each character from right to left
//         for (int i = n - 2; i >= 0; i--) {
//             // Check if the character at right of current character is
//             // bigger or smaller
//             if (romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(i + 1))) {
//                 num += romanMap.get(s.charAt(i));
//             } else {
//                 num -= romanMap.get(s.charAt(i));
//             }
//         }
//         return num;        
            
        
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
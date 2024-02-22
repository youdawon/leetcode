class Solution {  
	public static int romanToInt(String s) {

		HashMap<String, Integer> romanMap = new HashMap<String, Integer>();
		romanMap.put("I", 1);
		romanMap.put("V", 5);
		romanMap.put("X", 10);
		romanMap.put("L", 50);
		romanMap.put("C", 100);
		romanMap.put("D", 500);
		romanMap.put("M", 1000);

		int number = 0;

		String[] sArr = s.split("");

		for(int i=0; i<sArr.length; i++){            
			if(i < sArr.length-1 &&
                romanMap.get(sArr[i+1]) > romanMap.get(sArr[i])){
				number += romanMap.get(sArr[i+1]) - romanMap.get(sArr[i]);
				i++;
				continue;
			}
			number += romanMap.get(sArr[i]);
		}
		return number;
	}
}
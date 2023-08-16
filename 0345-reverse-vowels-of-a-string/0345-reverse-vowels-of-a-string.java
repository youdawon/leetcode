class Solution {
    public String reverseVowels(String s) {
        
        HashSet<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');        
        vowels.add('i');        
        vowels.add('o');        
        vowels.add('u');                
        vowels.add('A');
        vowels.add('E');        
        vowels.add('I');        
        vowels.add('O');        
        vowels.add('U');                        
        
        char[] arr = s.toCharArray();        

        int lastIndex = arr.length-1;
        
        for(int i=0; i< arr.length; i++){                   
            if(lastIndex > i && vowels.contains(arr[i])){                          
                for(int j=lastIndex; j>=i+1; j--){   
                    lastIndex = j-1;                     
                    if(vowels.contains(arr[j])){
                        char temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;                        
                        break;                        
                    }
                }
           }                           
        }

        StringBuilder sb = new StringBuilder();
        sb.append(arr);

        return sb.toString();
    }
}
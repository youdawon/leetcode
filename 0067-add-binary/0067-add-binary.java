class Solution {
    public String addBinary(String a, String b) {
                
        int i = a.length()-1;
        int j = b.length()-1;
        
        char remain = '0';                
        String result = "";

        
        while(i >= 0 || j >= 0){

            if(i >= 0 && j < 0){
                if(remain == '1'){
                    if(remain == a.charAt(i)){
                        result += '0';
                        remain = '1';
                    } else {
                        result += '1';
                        remain = '0';
                    }
                } else {
                    result += a.charAt(i);
                }
            } else if (j >= 0 && i < 0){
                if(remain == '1'){
                    if(remain == b.charAt(j)){
                        result += '0';
                        remain = '1';
                    } else {
                        result += '1';
                        remain = '0';
                    }
                } else {
                    result += b.charAt(j);
                }            
            }else{
                if(a.charAt(i) + b.charAt(j) == 98){

                    if(remain == '1'){
                        result += '1';                    
                    } else {
                        result += '0';
                    }
                    remain = '1';                                
                } else if(a.charAt(i) + b.charAt(j) == 97){
                    if(remain == '1'){
                        result += '0';
                        remain = '1';
                    } else {
                        result += '1';                    
                        remain = '0';
                    }
                } else {                
                    if(remain == '1'){
                        result += '1';
                    } else {
                        result += '0';
                    }
                    remain = '0';
                }                
            }
            i--;
            j--;
        }

        
        if(remain != '0')
            result += '1';
        
        return new StringBuffer(result).reverse().toString();
    }
}
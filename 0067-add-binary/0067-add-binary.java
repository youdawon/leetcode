class Solution {
    public String addBinary(String a, String b) {

        int i=a.length()-1;
        int j=b.length()-1;
        int remain = 0;                            
        
        StringBuilder sb = new StringBuilder();
        
        while(i >= 0 || j >= 0){

            int sum = remain;
            
            if(i >= 0){
                sum += a.charAt(i) - '0';                
            }
            
            if(j >= 0){
                sum += b.charAt(j) - '0';                                
            }
            
            if(sum <= 1){
                sb.append(sum);
                remain = 0;
            } else if (sum == 2){
                sb.append("0");
                remain = 1;
            } else {
                sb.append("1");
                remain = 1;                            
            }
            i--;
            j--;
        }
        
        if(remain == 1){
            sb.append("1");
        }
        
        return sb.reverse().toString();
    }
}
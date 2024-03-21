/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
       
        if(n == 1)
            return 1;
                    
        int high = n;
        int min = 1;
        
        return getBadVersion(high, min);
    }
    
    public int getBadVersion(int high, int low){

        int centre = low + (high - low)/2;
                
        if(high <= low){
            return low;
        }
        
        if(isBadVersion(centre)){
            high = centre;
            return getBadVersion(high, low);
        } else {
            low = centre + 1;
            return getBadVersion(high, low);                        
        }
    }
}
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        return getBadVersion(1, n);
    }
    
    public int getBadVersion(int low, int high){

        int centre = low + (high-low) / 2;
        
        System.out.println(low);
        System.out.println(high);        
        System.out.println(centre);                
        
        if(high == centre)
            return high;
            
        if(isBadVersion(centre) == true){
            high = centre;
        } else {
            low =  centre+1;  
        }
        
        return getBadVersion(low, high);
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        if(k == points.length)
            return points;
        
        quickSort(points, 0, points.length-1);
        
        return Arrays.copyOfRange(points, 0, k);
    }
    
    public void quickSort(int[][] points, int low, int high){
        
        if(low >= high)
            return;
        
        int pi = partition(points, low, high);
        
        quickSort(points, low, pi-1);
        quickSort(points, pi+1, high);        
    }
    
    public int partition(int[][] points, int low, int high){

        int[] pivot = points[low];
        int i=low;
        int j=high;
        
        while(i<j){
            while(getDistance(pivot) < getDistance(points[j])){
                j--;
            }

            while(i<j && getDistance(pivot) >= getDistance(points[i])){
                i++;
            }
            
            swap(points, i, j);
            
        }  
        points[low] = points[i];
        points[i] = pivot;  

        return i;
    }    
    
    public int getDistance(int[] value){
        return value[0]*value[0] + value[1]*value[1];
    }
    
    public void swap(int[][] points, int i, int j){
        int[] temp = points[i];
        points[i] = points[j];
        points[j] = temp; 
    }
}
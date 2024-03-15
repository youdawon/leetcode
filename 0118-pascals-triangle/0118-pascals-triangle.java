class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();                
        for(int i=0; i<numRows; i++){
            List<Integer> cols = new ArrayList<Integer>();
            for(int j=0; j<=i; j++){            
                if(i < 2 || j==0 || j==i){
                    cols.add(1);
                } else {
                    cols.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
                }                    
            }
            list.add(cols);
        }        
        
        return list;
    }
}
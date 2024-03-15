class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();        
        result.add(Arrays.asList(1));
        
        if(numRows == 1)
            return result;

        result = generate(numRows - 1);        
        List<Integer> prevRows = result.get(numRows-2);

        
        List<Integer> row = new ArrayList<>();
        
        for(int i=0; i<numRows; i++){
            if(i == 0 || i == numRows - 1){
                row.add(1);                                
            }else{
                row.add(prevRows.get(i-1) + prevRows.get(i));
            }            
        }
        
        result.add(row);
        
        
        return result;
    }
}
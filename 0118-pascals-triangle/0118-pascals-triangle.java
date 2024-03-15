class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> prevRows = new ArrayList<List<Integer>>();        
        prevRows.add(Arrays.asList(1));
        
        if(numRows == 1)
            return prevRows;

        prevRows = generate(numRows - 1);

        
        List<Integer> row = new ArrayList<>();
        
        for(int i=0; i<numRows; i++){
            if(i == 0 || i == numRows - 1){
                row.add(1);                                
            }else{
                row.add(prevRows.get(numRows-2).get(i-1) + prevRows.get(numRows-2).get(i));
            }            
        }
        
        prevRows.add(row);
        
        
        return prevRows;
    }
}
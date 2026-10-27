class Solution {
    public int firstUniqChar(String s) {
        for(int i=0; i<s.length(); i++){
            boolean isfound=false;
            for(int j=0; j<s.length(); j++){
                if(i!=j && s.charAt(i)==s.charAt(j)){
                    isfound=true;
                 break;
                    
                }

            }
            if(!isfound){
                return i;
            }
        }
        return -1;
        
    }
}
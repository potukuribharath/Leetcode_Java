class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] str=sentence.split(" ");
        int count=0;
        int data=0;
        for(String s:str){
            data+=1;
            count=0;
            for(int i=0;i<s.length();i++){
                if(searchWord.charAt(i)!=s.charAt(i)){
                    break;
                }else{
                    count+=1;
                    
                }
                if(count==searchWord.length()){
                    return data;
                
                }
            }
        }return -1;
        
    }
}
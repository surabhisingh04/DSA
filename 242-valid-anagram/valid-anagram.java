class Solution {
    public boolean isAnagram(String a, String b) {
        if(a.length()!= b.length()){
            return false ;
        }
       int len = a.length();
        int freq []= new int[26];
        int IndexA = 0;
        int IndexB = 0;

        while(IndexA<len && IndexB<len){
            char chA = a.charAt(IndexA);
            int freqa = chA- 97;
            freq[freqa]+=1;
            char chB = b.charAt(IndexB);
            int freqb = chB- 97;
            freq[freqb]-=1;
            IndexA++;
            IndexB++;
        }

        for ( int i = 0 ; i<freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
        }
          return true;
       
        
    }
}
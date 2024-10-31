package pds.programmers.day241031.음양_더하기;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {

        int result = 0;


        for(int i = 0; i < absolutes.length; i++){
            if(signs[i] == true){
                result += absolutes[i];
            }else{
                result -= absolutes[i];
            }
        }
        return result;
    }
}
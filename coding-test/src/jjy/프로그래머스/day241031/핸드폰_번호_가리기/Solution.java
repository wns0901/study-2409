package jjy.프로그래머스.day241031.핸드폰_번호_가리기;

public class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length();
        return "*".repeat(len - 4) + phone_number.substring(len - 4, len);
    }
}

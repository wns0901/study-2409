function solution(phone_number) {
    // 뒷 4자리를 제외한 나머지를 *로 채움
    return '*'.repeat(phone_number.length - 4) + phone_number.slice(-4);
}
class Solution {

    public String solution(String s, String skip, int index) {
      
        String answer = "";   // 최종 결과를 저장할 문자열 변수 answer 선언
 
        for (int i = 0; i < s.length(); i++) { // 문자열 s의 각 문자를 순회하기 위한 for문
           
            char c = s.charAt(i);  // 현재 문자 c에 s의 i번째 문자를 저장
            
            
            for (int j = 0; j < index; j++) {  // index만큼 문자를 이동시키기 위한 내부 for문
               
                c += 1;  // 현재 문자를 다음 알파벳으로 이동 (1 증가)                
          
                if (c > 'z') {  // 만약 문자가 'z'를 넘어서면 'a'로 되돌아가도록 26을 빼줌
                    c -= 26;
                }
                
                // 만약 현재 문자가 skip 문자열에 포함되면 j를 하나 줄여 이동을 반복
                // 이는 skip에 포함된 문자는 건너뛰고 유효한 문자만 세도록 하기 위함
                if (skip.contains(String.valueOf(c))) {
                    j--; // 스킵된 문자는 유효한 이동으로 인정되지 않으므로 j를 감소시킴
                }
            }
            // 변환된 문자를 결과 문자열에 추가
            answer += c;
        }

        // 최종적으로 변환된 문자열을 반환
        return answer;
    }
}

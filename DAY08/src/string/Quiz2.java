package string;

class Solution {
    public String solution(String new_id) {
        String answer = "";
        // 1단계
        new_id = new_id.toLowerCase();
        // 2단계
        for(int i = 0; i < new_id.length(); i++){
            char ch = new_id.charAt(i);
            if('a' <= ch && ch <= 'z'){
                answer += ch;
            }
            if('0' <= ch && ch <= '9'){
                answer += ch;
            }
            if(ch == '-' || ch == '_' || ch == '.'){
                answer += ch;
            }
        }
        // 3단계
        while(answer.contains("..")){
            answer = answer.replace("..", ".");
        }
        
        // 4단계
        if(answer.startsWith(".")){
            answer = answer.substring(1);
        }
        if(answer.endsWith(".")){
            answer = answer.substring(0, answer.length()-1);
        }
        
        // 5단계
        if(answer.length() == 0){
            answer += "a";
        }
        
        // 6단계
        if(answer.length() >= 16){
            answer = answer.substring(0, 15);
        }
        if(answer.endsWith(".")){
            answer = answer.substring(0, answer.length()-1);
        }
        // 7단계
        for(int i = 0; i<answer.length(); i++){
            if(answer.length() <= 2){
            answer += answer.substring(answer.length()-1);
            // answer += answer.charAt(answer.length()-1);
        }
        }
        
        return answer;
    }
}


public class Quiz2 {
	public static void main(String[] args) {
		String[] inputs = {
			"...!@BaT#*..y.abcdefghijklm",
			"z-+.^.",
			"=.=",
			"123_.def",
			"abcdefghijklmn.p"
		};
		String[] outputs = {
			"bat.y.abcdefghi",
			"z--",
			"aaa",
			"123_.def",
			"abcdefghijklmn",
		};
		
		Solution solution = new Solution();
		for(int i = 0;i < inputs.length; i++) {
			String new_id = inputs[i];
			String output = outputs[i];
			String answer = solution.solution(new_id);
			
			System.out.printf("%d) %s\n", i + 1, answer.equals(outputs));
		}
		System.out.println("테스트 끝");
	}
}

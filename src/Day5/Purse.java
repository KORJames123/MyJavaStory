package Day5;

public class Purse {
    public String solution(String code) {
        String ret = "";
        boolean mode = false;

        for(int i = 0; i < code.length(); i++){
            char ch = code.charAt(i);
            if(ch == '1'){
                mode = !mode;
                continue;
            }
            if(mode == false && i % 2 == 0){
                ret += ch;
            }else if(mode == true && i % 2 == 1){
                ret += ch;
            }
        }
        if(ret == "")
            return "EMPTY";
        else
            return ret;
    }
}

// Review
// == 사용할 때 ch가 String인지 Char인지 잘 생각해보기
package String;

public class LongestCommonPrefix14 {
    public String longestCommonPrefix(String[] strs) {
        int ls = strs.length;
        if(ls < 1) return "";
        else if(ls == 1) return strs[0];

        //Find the longest common prefix.
        String sub = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(sub) != 0){
                sub = sub.substring(0, sub.length() - 1);
            }
        }
        return sub;
    }
    public static void main(String[] args){
        String a = "abc";
        System.out.print(a.indexOf("abcd"));
    }
}

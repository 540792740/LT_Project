package String;

public class ReverseString344 {
    public void reverseString(char[] s) {
        int ls = s.length;
        for(int i = 0; i < ls / 2; i++){
            char temp = s[i];
            s[i] = s[ls - i - 1];
            s[ls - i - 1] = temp;
        }
    }
}


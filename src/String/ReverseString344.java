package String;

public class ReverseString344 {
    public static char[] reverseString(char[] s) {
        int ls = s.length;
        for(int i = 0; i < ls / 2; i++){
            char temp = s[i];
            s[i] = s[ls - i - 1];
            s[ls - i - 1] = temp;
        }
        return s;
    }
    public static void main(String[] args){
        char[] a = {'a', 'b'};
        System.out.println(reverseString(a));
    }
}


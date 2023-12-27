package Jungol.String1;

public class String9116_ex {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = sb.append("I Love Korea").toString();
        String[] outResult = str.split(" ");
        for (String s : outResult) System.out.println(s);
    }
}

package Jungol.String1;

public class String9115_ex {
    public static void main(String[] args) {
        String str = "ILoveYou.";
        char[] charArray = new char[9];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
            if (charArray[i]>=65 && charArray[i]<=90)
                charArray[i] = Character.toLowerCase(charArray[i]);
            else if (charArray[i]>=97 && charArray[i]<=122) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        for (char c : charArray) {
            System.out.print(c);
        }

    }
}

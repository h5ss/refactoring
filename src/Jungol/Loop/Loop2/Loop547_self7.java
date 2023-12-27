package Loop2;

public class Loop547_self7 {
    public static void main(String[] args) {
        int k = 2;
        for (int i = 0; i < 5; i++) {
            for (int j = k; j < k + 5; j++) {
                System.out.print(j + " ");
            }
            k++;
            System.out.println();
        }
    }
}

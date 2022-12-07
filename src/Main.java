public class Main {
    public static void main(String[] args) {
        String s = "12 12345 123 12";
        String[] word = s.split(" ");
        int maxlen = word[0].length();
        int imax = 0;
        for (int i = 0; i < word.length; i++)
        {
            if (word[i].length() > maxlen) {
                maxlen = word[i].length();
                imax = i;
            }

        }
        System.out.println(word[imax]);
    }
}






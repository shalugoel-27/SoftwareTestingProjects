package tasks;

public class Vowels_Consonants {
    public static void main(String[] args) {
        String s1 = args[0];
        System.out.println(s1);
        int length = s1.length();
        System.out.println(length);
        int vowels= 0;
        int consonants =0;
        s1=s1.toLowerCase();

        for(int i=0;i<length; i++) {
            char ch = s1.charAt(i); //char at i =o is 'n' ..at i=1 is ''i ..at i=2 is 'h'
            if(ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;

                } else {
                    consonants++;
                }

                System.out.println("Vowels->" + vowels);
                System.out.println("Consonants->" + consonants);

            }
        }
    }



}

package tasks;

public class CountWordsOfString {
    public static void main(String[] args) {
        String str = "Hello friend, how are you?";
        String[] words= str.split("\\s+");
        System.out.println("Number of words->" +words.length);

    }



}

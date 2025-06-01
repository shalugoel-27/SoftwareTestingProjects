package ex015_Strings;

public class Lab128_Strings {
    public static void main(String[] args) {
        String name ="Shalu"; // SCP
        name.toUpperCase(); //this will create PRAMOD IN SCP but we are not storing it anywhere
        System.out.println(name); //o/p is not converted to uppercase bcoz we are printing the previous one
    } // in this program there r 2 strings present in SCP bcoz of immutability a new uppercase shalu is created instead of replacing the old one



}

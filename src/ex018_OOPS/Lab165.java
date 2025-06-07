package ex018_OOPS;

public class Lab165 {
    public static void main(String[] args) {
        ATB12x amit =new ATB12x(); //now jvm has load the class
//        ATB12x -> class
//                amit -> obj reference
//                new ATB12x -> object

        amit.name = "Amit Sharma";
        amit.doAssignment(); // obj ref OR can access both attributes and behaviour

        ATB12x pramod = new ATB12x();
        pramod.name = "Pramod Dutta";
        pramod.doAssignment();

    }}

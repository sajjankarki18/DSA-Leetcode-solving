package static_final_keywords;

public class final_keyword {
    public static void main(String[] args) {
        //final keyword helps you to prevent your content to be modified
        final int a = 100;
        //a = 200; now you cant modify the variable because it is declared a final
        //only works for primitive datatypes
        //like arrays, objects

        String s = "sajan karki";
        s = "milan kc";

        System.out.println(s);
        System.out.println(a);
    }
}

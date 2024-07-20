package ex_14072024;

public class Lab076 {
    public static void main(String[] args) {
        String s1 = "Pratibha";
        //String s1 = "P r a t i b h a";
        //          |0|1|2|3|4|5|6|7|8
        char c = s1.charAt(5);
        System.out.println(c);
        s1 = s1.concat("Chippa");
        System.out.println(s1);

    }
}

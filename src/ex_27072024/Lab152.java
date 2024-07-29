package ex_27072024;

public class Lab152 {
    public static void main(String[] args) {
        // Strings - imutable in nature
        // StringBuilder , StringBuffer
        String s1 = "PRATIBHA   ";
        s1 = "Chippa";

        StringBuffer stringBuffer = new StringBuffer("Pratibha");
        // change the value of string - Buffer
        stringBuffer.append("Chippa");
        stringBuffer.append("JI");

        StringBuilder stringBuilder = new StringBuilder("Amit");
        stringBuilder.append("Sharma");

        // Thead Safty?

        // stringBuilder - not thread safe - people LOVE it :)


    }
}

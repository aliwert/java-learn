import java.sql.SQLOutput;

public class alphacharacters {
    public static void main(String[] args) {
        //first solution
        String str = "heKL75jki8#";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                count++;
            }
        }
        System.out.println(str + " in  " + count + " has alpha characters");

        //second solution
        System.out.println(str.replaceAll("[^a-zA-Z]", "").length());
    }
}

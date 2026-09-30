public class reversedString {

    public static void main(String[] args) {

        String original = "hello world";

        StringBuilder reversed = new StringBuilder();

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed.append(original.charAt(i));
        }

        System.out.println(reversed.toString());
    }
}
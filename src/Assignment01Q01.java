public class Assignment01Q01 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String str = args[i];
            // check if the string is not empty to avoid StringIndexOutOfBoundsException
            if (!str.isEmpty()) {
                char firstChar = str.charAt(0);
                if (firstChar % 5 == 0) {
                    System.out.println(firstChar); // print the character if its ASCII value is divisible by 5
                }
            }
        }
    }
}


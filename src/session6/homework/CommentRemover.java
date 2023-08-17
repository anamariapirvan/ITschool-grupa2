package session6.homework;

public class CommentRemover {
    public static void main(String[] args) {
        String codeWithComments = "public class Example {\n" +
                "    // This is a single-line comment\n" +
                "    /*\n" +
                "     * This is a multi-line comment\n" +
                "     */\n" +
                "    public static void main(String[] args) {\n" +
                "        System.out.println(\"Hello, world!\");\n" +
                "    }\n" +
                "}";

        String codeWithoutComments = removeComments(codeWithComments);
        System.out.println("Code with Comments:");
        System.out.println(codeWithComments);
        System.out.println("Code without Comments:");
        System.out.println(codeWithoutComments);
    }

    private static String removeComments(String code) {
        StringBuilder result = new StringBuilder();
        boolean inSingleLineComment = false;
        boolean inMultiLineComment = false;

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);

            if (inSingleLineComment) {
                if (c == '\n') {
                    inSingleLineComment = false;
                    result.append(c);
                }
            } else if (inMultiLineComment) {
                if (c == '*' && i < code.length() - 1 && code.charAt(i + 1) == '/') {
                    inMultiLineComment = false;
                    i++;
                }
            } else {
                if (c == '/' && i < code.length() - 1) {
                    if (code.charAt(i + 1) == '/') {
                        inSingleLineComment = true;
                        i++;
                    } else if (code.charAt(i + 1) == '*') {
                        inMultiLineComment = true;
                        i++;
                    } else {
                        result.append(c);
                    }
                } else {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}

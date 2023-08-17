package session6.homework;
public class CompressedStringExpander {

    public static void main(String[] args) {
        String compressedString = "a3b2c5";
        String expandedString = expandCompressedString(compressedString);
        System.out.println("Compressed: " + compressedString);
        System.out.println("Expanded: " + expandedString);
    }

    private static String expandCompressedString(String compressedString) {
        StringBuilder expandedStringBuilder = new StringBuilder();
        int i = 0;
        while (i < compressedString.length()) {
            char ch = compressedString.charAt(i++);
            int count = 0;
            while (i < compressedString.length() && Character.isDigit(compressedString.charAt(i))) {
                count = count * 10 + (compressedString.charAt(i) - '0');
                i++;
            }
            for (int j = 0; j < count; j++) { // Fixed loop condition here
                expandedStringBuilder.append(ch);
            }
        }
        return expandedStringBuilder.toString();
    }
}

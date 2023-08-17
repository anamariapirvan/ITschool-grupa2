package session6.homework;

public class MorseCodeConverter {
    public static void main(String[] args) {
        String inputString = "Hello 123 world";
        String morseCode = convertToMorseCode(inputString);
        System.out.println("Input: " + inputString);
        System.out.println("Morse Code: " + morseCode);
    }

    private static String convertToMorseCode(String input) {
        String[] morseCodes = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
                "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."
        };

        StringBuilder morseCodeBuilder = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                morseCodeBuilder.append(morseCodes[Character.toUpperCase(c) - 'A']);
            } else if (Character.isDigit(c)) {
                morseCodeBuilder.append(morseCodes[c - '0' + 26]);
            }
            morseCodeBuilder.append(" ");
        }

        return morseCodeBuilder.toString();
    }
}

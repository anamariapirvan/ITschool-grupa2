package session6.homework;

public class CamelToSnakeConverter {
    public static void main(String[] args) {
        String camelCaseString = "helloWorldThisIsMe";
        String snakeCaseString = convertCamelToSnake(camelCaseString);
        System.out.println("CamelCase: " + camelCaseString);
        System.out.println("Snake_case: " + snakeCaseString);

    }

    private static String convertCamelToSnake(String camelCase) {
        StringBuilder snakeCaseBuilder = new StringBuilder();
        for (int i = 0; i < camelCase.length(); i++) {
            char currentChar = camelCase.charAt(i);

            if (i > 0 && Character.isUpperCase(currentChar)) {
                snakeCaseBuilder.append('_');
            }
            snakeCaseBuilder.append(Character.toLowerCase(currentChar));
        }
        return snakeCaseBuilder.toString();
    }
}

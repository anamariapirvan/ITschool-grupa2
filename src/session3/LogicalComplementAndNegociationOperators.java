package session3;

public class LogicalComplementAndNegociationOperators {
    public static void main(String[] args) {
        boolean isTrue = true;
        boolean isFalse = false;

        isTrue =! isTrue;
        isFalse =!isFalse;

        System.out.println("isTrue: " +isTrue);
        System.out.println("isFalse: " + isFalse);
    }
}

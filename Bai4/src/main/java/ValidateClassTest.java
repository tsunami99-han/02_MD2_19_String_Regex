public class ValidateClassTest {
    private static ValidateClass validateClass;
    private static final String[] validClass = {"C0318G", "C0321G"};
    private static final String[] invalidClass = {"M0318G", "P0323A"};

    public static void main(String[] args) {
        validateClass = new ValidateClass();
        for (String valid : validClass) {
            boolean isvalid = validateClass.validate(valid);
            System.out.println("Account is " + valid + " is valid: " + isvalid);
        }
        for (String invalid : invalidClass) {
            boolean isvalid = validateClass.validate(invalid);
            System.out.println("Account is " + invalid + " is valid: " + isvalid);
        }
    }
}
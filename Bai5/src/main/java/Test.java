public class Test {
    public static void main(String[] args) {
        PhoneExample phoneExample = new PhoneExample();
        String[] phone = {"(84)-(0978489648)","(a8)-(22222222)","(18)-(0222224222)"};
        for(String str: phone){
            boolean isvalid = phoneExample.validate(str);
            System.out.println("Account is " + str + " is valid: " + isvalid);
        }
    }
}
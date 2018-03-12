package lab2zad4;


public class Lab2Zad4 {


    public static void main(String[] args) {
        // Inherit
        ExtendChild child = new ExtendChild();
        child.setCode(404);
        child.setMessage("Not Found");
        System.out.println("Extend");
        System.out.println("Code: " + child.getCode() + " Message: " + child.getMessage());
        
        // Compose
        ComposeMessage message = new ComposeMessage();
        ComposeCode code = new ComposeCode();
        code.setCode(401);
        message.setMessageCode("UNAUTHORIZED", code);
        System.out.println("Compose");
        System.out.println("Code: " + message.getCode() + " Message: " + message.getMessage());
    }   
}
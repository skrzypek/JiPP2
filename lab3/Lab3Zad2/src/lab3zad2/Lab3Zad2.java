package lab3zad2;


public class Lab3Zad2 {


    public static void main(String[] args) {
        // Inherit
        ExtendChild child = new ExtendChild();
        child.setCode(404);
        child.setMessage("Not Found");
        System.out.println("Extend");
        System.out.println("Code: " + child.getCode() + " Message: " + child.getMessage());
        
        // Interface
        InterfaceMessage message = new InterfaceMessage();
        message.setMessage("UNAUTHORIZED");
        message.setCode(401);
        System.out.println("Interface");
        System.out.println("Code: " + message.getCode() + " Message: " + message.getMessage());
    }
    
}

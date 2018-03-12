package lab2zad4;


public class ComposeMessage {
    private ComposeCode code;
    String message;
    
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public void setMessageCode(String message, ComposeCode code) {
        this.message = message;
        this.code = code;
    }
    
    public int getCode() {
        return this.code.getCode();
    }
}

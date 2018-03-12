package lab3zad2;


public class InterfaceMessage implements InterfaceCode {
    int code;
    String message;
    
    @Override
    public void setCode(int code){
        this.code = code;
    }
    
    @Override
    public int getCode() {
        return this.code;
    }

    public void setMessage(String message){
        this.message = message;
    }
    
    public String getMessage() {
        return this.message;
    }
}

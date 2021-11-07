public class IllegalRightTriangleException extends Exception{
    private String message = "";
    public IllegalRightTriangleException() {
    }

    public IllegalRightTriangleException(String message) {
        this.message = message;
        System.out.println(message);
    }

    public String getMessage(){
        return message;
    }
}

package exceiption.ex4;

public class SendExceptionV4 extends NetworkClientExceptionV4 {
    private final String sendData;

    public SendExceptionV4(String message, String sendData) {
        super(message);
        this.sendData = sendData;
    }
}

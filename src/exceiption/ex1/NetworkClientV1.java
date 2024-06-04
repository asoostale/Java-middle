package exceiption.ex1;

public class NetworkClientV1 {

    private final String address;
    public boolean connectError; //기본값 false임
    public boolean sendError;

    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect() {
        if (connectError) {
            System.out.println(address + " 서버 연결 실패");
            return "connectError";
        }
        return "connectSuccess";
    }

    public String send(String data) {
        if (sendError) {
            System.out.println(address + " 서버에 데이터 전송 실패 : " + data);
            return "sendError";
        }
        return "sendSuccess";
    }

    public void disconnect() {
        System.out.println(address + "서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error"))
            sendError = true;
    }

}
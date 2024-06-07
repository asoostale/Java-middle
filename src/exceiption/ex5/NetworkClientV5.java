package exceiption.ex5;

import exceiption.ex4.ConnectExceptionV4;
import exceiption.ex4.SendExceptionV4;

public class NetworkClientV5 implements AutoCloseable {

    private final String address;

    public boolean connectError;
    public boolean sendError;

    public NetworkClientV5(String address) {
        this.address = address;
    }

    public void connect() {
        if (connectError) {
            throw new ConnectExceptionV4(address, address + " 서버 연결 실패");
        }
        System.out.println(address + "서버 연결 성공");
    }

    public void send(String data) {
        if (sendError) {
            throw new SendExceptionV4(data, address + "서버에 데이터 전송 실패 : " + data);
        }

        System.out.println(address + " 서버에 데이터 전송 : " + data);
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.equals("error1")) {
            connectError = true;
        }
        if (data.equals("error2")) {
            sendError = true;
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("NetworkClientV5.close");
        disconnect();
    }
}

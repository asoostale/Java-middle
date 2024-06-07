package exceiption.ex3;

import exceiption.ex3.exception.ConnectExceptionV3;
import exceiption.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {
    public void sendMessage(String data) {
        String address = "https://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3  | SendExceptionV3 e) {
            System.out.println("[연결 또는 전송 오류] 주소, 메세지 : " + e.getMessage());

        } finally {

            client.disconnect();
        }
    }
}

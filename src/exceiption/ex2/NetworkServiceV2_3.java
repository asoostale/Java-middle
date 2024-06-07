package exceiption.ex2;

public class NetworkServiceV2_3 {

    public void sendMessage(String data) {
        String address = "https://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
            client.disconnect(); // 예외 발생시 무시
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메세지 : "
                    + e.getMessage());
        }


        try {
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지 : " + e.getMessage());
            return;
        }
        client.disconnect();
    }
}

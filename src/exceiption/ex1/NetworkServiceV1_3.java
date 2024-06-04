package exceiption.ex1;


public class NetworkServiceV1_3 {

    public void sendMessage(String data) {
        String address = "https://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);

        client.initError(data); //추가


        String connectResult = client.connect();
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);
        } else {
            String sendResult = client.send(data);
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드 : " + sendResult);
            }
        }
        client.disconnect(); //disconnect 무조건 호출되는 상황
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}

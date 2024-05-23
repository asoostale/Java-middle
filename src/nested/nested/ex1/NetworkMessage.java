package nested.nested.ex1;


//NetWork 객체 안에서만 사용
public class NetworkMessage {
    private String contents;

    public NetworkMessage(String contents) {
        this.contents = contents;
    }

    public void print() {
        System.out.println(contents);
    }
}

package exceiption.basic.unchecked;

public class Client {
    public void call() {
        throw new MyUnCheckedException("ex");

        //런타임 예외는 throw(발생) 후 throws 안 해줘도 된다.
    }
}

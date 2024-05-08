package lang.immutable.address;

public class ImmutableAddress {

    // final을 추가함으로써 불변객체로 바꿈.
    private final String value;

    public String getValue() {
        return value;
    }


    public ImmutableAddress(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}

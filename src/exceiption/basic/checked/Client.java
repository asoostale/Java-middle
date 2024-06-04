package exceiption.basic.checked;

public class Client {

    /**
     *  throw = 예외를 발생 시킴
     *      ex) A라는 함수 호출 중 어떤 상황에서 a라는 예외를 만들어 버림
     *          여기서 그 예외를 처리하거나 던지거나 선택지
     *              if (x < 0) {
     *                 throw new IllegalArgumentException("x cannot be negative");
     *                  }
     *
     *  throws = 예외를 던지는 것
     */


    public void call() throws MyCheckedException{


        //문제 상황 발생
        throw new MyCheckedException("ex");
    }

}

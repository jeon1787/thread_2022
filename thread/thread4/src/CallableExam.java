import java.util.concurrent.Callable;
/*
  Callable interface의 구현클래스
 */

public class CallableExam implements Callable {
  String str = "Callable";

  @Override
  public Object call() throws Exception {
    Thread.sleep(1000);
    System.out.println("1s");
    Thread.sleep(1000);
    System.out.println("2s");
    Thread.sleep(1000);
    System.out.println("3s");

    return str;
  }
}

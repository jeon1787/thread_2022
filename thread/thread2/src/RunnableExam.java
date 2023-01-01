/*
  Runnable interface의 구현클래스
  - Runnable은 인터페이스이다.
  - Runnable은 run() 메소드 하나만 정의되어 있기 때문에 함수적 인터페이스이다.
    따라서 람다식을 Runnable 대신 매개값으로 사용할 수도 있다.
 */

public class RunnableExam implements Runnable{
  String str;

  public RunnableExam(String str){
    this.str = str;
  }

  @Override
  public void run() {
    for(int i=0; i<10; i++){
      System.out.println(str);

      try {
        Thread.sleep((int)(Math.random()*1000));
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

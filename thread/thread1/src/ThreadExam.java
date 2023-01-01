/*
  Thread class의 상속클래스
  - Thread는 클래스이다.
 */

public class ThreadExam extends Thread{
  String str;

  public ThreadExam(String str) {
    this.str = str;
  }

  @Override
  public void run(){
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

/*
  Runnable interface의 구현클래스
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

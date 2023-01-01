public class App {
  public static void main(String[] args) {
    for(int i=1;i<=10;i++){
      Thread thread = new CalcThread("thread" + i);
      if(i != 10) {
        thread.setPriority(Thread.MIN_PRIORITY);//우선순위 최하
      }else{
        thread.setPriority(Thread.MAX_PRIORITY);//우선순위 최상 : 10번 스레드가 가장 먼저 print되는 결과를 확인할 수 있다.
      }
      thread.start();
    }
  }
}

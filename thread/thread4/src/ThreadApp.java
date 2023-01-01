import java.util.concurrent.FutureTask;

public class ThreadApp {
  public static void printMain(){
    for(int i=0; i<10; i++){
      System.out.println("Main");

      try {
        Thread.sleep((int)(Math.random()*1000));
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public static void main(String[] args){
//    1. Thread
//    ThreadExam t1 = new ThreadExam("One");
//    ThreadExam t2 = new ThreadExam("Two");
//    t1.start();
//    t2.start();
//    printMain();

//    2-1. Runnable - Runnable 구현 객체 생성하여 매개값으로 사용
//    Thread t1 = new Thread(new RunnableExam("One"));
//    Thread t2 = new Thread(new RunnableExam("Two"));
//    t1.start();
//    t2.start();
//    printMain();

//    2-2. Runnable - Runnable 익명 객체 사용
//    Thread t1 = new Thread(new Runnable() {
//      @Override
//      public void run() {
//        for(int i=0; i<10; i++){
//          System.out.println("Runnable");
//
//          try {
//            Thread.sleep((int)(Math.random()*1000));
//          } catch (InterruptedException e) {
//            e.printStackTrace();
//          }
//        }
//      }
//    });
//    t1.start();
//    printMain();

//    2-3. Runnable - 람다식 사용
//    Thread t1 = new Thread(() -> {
//      for(int i=0; i<10; i++){
//        System.out.println("Runnable");
//
//        try {
//          Thread.sleep((int)(Math.random()*1000));
//        } catch (InterruptedException e) {
//          e.printStackTrace();
//        }
//      }
//    });
//    t1.start();
//    printMain();

//    3. Callable
//    CallableExam  c = new CallableExam();
//    FutureTask f = new FutureTask();

  }
}

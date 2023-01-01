public class App {
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

  public static void main(String[] args) {
    // 1. Thread를 상속한 객체를 사용
//    ThreadExam t1 = new ThreadExam("One");
//    ThreadExam t2 = new ThreadExam("Two");
//    t1.start();
//    t2.start();
//    printMain();
    
    // 2. 익명 자식 객체 사용
    Thread t1 = new Thread(){
      public void run(){
        for(int i=0; i<10; i++){
          System.out.println("One");

          try {
            Thread.sleep((int)(Math.random()*1000));
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    };
    Thread t2 = new Thread(){
      public void run(){
        for(int i=0; i<10; i++){
          System.out.println("Two");

          try {
            Thread.sleep((int)(Math.random()*1000));
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    };
    t1.start();
    t2.start();
    printMain();
  }
}

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
    // 1. Thread 객체의 매개변수로 사용
//    Thread t1 = new Thread(new RunnableExam("One"));
//    Thread t2 = new Thread(new RunnableExam("Two"));
//    t1.start();
//    t2.start();
//    printMain();
    
    // 2. 익명 구현 객체로 사용
//    Thread t1 = new Thread(new Runnable() {
//      @Override
//      public void run() {
//        for(int i=0; i<10; i++){
//          System.out.println("One");
//
//          try {
//            Thread.sleep((int)(Math.random()*1000));
//          } catch (InterruptedException e) {
//            e.printStackTrace();
//          }
//        }
//      }
//    });
//    Thread t2 = new Thread(new Runnable() {
//      @Override
//      public void run() {
//        for(int i=0; i<10; i++){
//          System.out.println("Two");
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
//    t2.start();
//    printMain();

    // 3. 람다식 사용
    Thread t1 = new Thread(() -> {
      for(int i=0; i<10; i++){
        System.out.println("Two");

        try {
          Thread.sleep((int)(Math.random()*1000));
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });
    Thread t2 = new Thread(() -> {
      for(int i=0; i<10; i++){
        System.out.println("Two");

        try {
          Thread.sleep((int)(Math.random()*1000));
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });
    t1.start();
    t2.start();
    printMain();
  }
}

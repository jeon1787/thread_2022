public class ThreadApp {
  public static void main(String[] args){
    ThreadExam t1 = new ThreadExam("One");
    ThreadExam t2 = new ThreadExam("Two");

    t1.start();
    t2.start();

    for(int i=0; i<10; i++){
      System.out.println("Main");

      try {
        Thread.sleep((int)(Math.random()*1000));
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

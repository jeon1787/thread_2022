public class CalcThread extends Thread{
  public CalcThread(String name){
    setName(name);//Thread 이름 set
  }

  @Override
  public void run(){
    for(int i=0; i<10000; i++){
    }
    System.out.println(getName());//Thread 이름 get
  }
}

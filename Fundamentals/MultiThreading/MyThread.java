class Hi extends Thread {
  public void run() {
    for(int i = 1; i<=5;i++) {
      System.out.println("HI");
      // Run the method every 500ms
      try {Thread.sleep(500);} catch(Exception e) {System.out.println(e);} 
    }
  }
}

class Hello extends Thread {
  public void run() {
    for (int i = 1; i <= 5; i++) {
      // This will not execute until we are done executing the Hi.show()
      System.out.println("Hello");
      /* 
        To make it run parallely, we create threads.
      */
    }
  }
}

public class MyThread {
  public static void main(String[] args) {
    System.out.println("Good");  // printed by main thread.

    Hi obj1 = new Hi();
    Hello obj2 = new Hello();
  
    // Start the thread
    obj1.start();
    obj2.start();
    /* 
      Internally, start() method always calls a "run" method, so it is important
      to have a method named run() in the class
    */

    // obj1.show();
    // obj2.show();
  }
}
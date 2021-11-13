
class Main {
  public static void main(String[] args) {
    // Thread name
    System.out.println(Thread.currentThread().getName());
    System.out.println(Thread.activeCount());
    System.out.println(Runtime.getRuntime().availableProcessors());

    Thread thread = new Thread();
  }
}
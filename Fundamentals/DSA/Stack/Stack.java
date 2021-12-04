public class Stack {
  int stack[] = new int[5];
  int top = 0;

  public void push(int data) {
    stack[top] = data;
    top++;
  }

  public void show() {
    for (int n: stack) {
      System.out.print(n + " ");
    }
  }

  public int pop() {
    int data;
    data = stack[top];
    stack[top] = 0;
    return data;
  }
}

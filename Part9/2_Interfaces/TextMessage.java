/*
  - The classes that implement the interface decide how the methods defined in the 
    interface are implemented.
  
  - Since the "TextMessage" class implements the "Readable" interface, the TextMessage
    class must contain an Implementation of the "public String read()" method.

  - The implementations of methods defined in the interface must always have public as their
    visiblity attribute.

*/

public class TextMessage implements Readable {
  private String sender;
  private String content;

  public TextMessage(String sender, String content) {
    this.sender = sender;
    this.content = content;
  }

  public String getSender() {
    return this.sender;
  }

  public String read() {
    return this.content;
  }
}
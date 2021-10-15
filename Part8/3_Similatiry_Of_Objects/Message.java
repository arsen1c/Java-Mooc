import java.util.ArrayList;

//  ASSIGNMENT

public class Message {
  private String message;

  public Message(String message) {
    this.message = message;
  }

  public String toString() {
    return this.message;
  }

  public static void main(String[] args) {
    Message sms = new Message("SMS");
    Message mms = new Message("MMS");
    Message moreSms = sms;

    System.out.println(sms == sms);      // prints true
    System.out.println(sms == mms );      // prints false
  
    ArrayList<Message> messages = new ArrayList<>();
    if (!messages.contains(sms)) {
      messages.add(sms);
    }

    if (!messages.contains(new Message("SMS"))) {
      messages.add(sms);
    }


    // System.out.println(messages.size());

    for (Message message: messages) {
      System.out.println(message);            // prints Message@6996db8 always
      System.out.println(message.equals(sms));// prints true
    }

    System.out.println(moreSms == sms);       // prints true. The reference is same.
    System.out.println(sms);                  // prints Message@6996db8 (Reference)
    System.out.println(moreSms);              // prints Message@6996db8 (Reference)
    moreSms = new Message("SMS");             // new reference gets created in the Heap and gets assigned to "moreSms" variable. Message@7fbe847c
    System.out.println(moreSms);              // prints Message@7fbe847c (Reference)
    System.out.println(moreSms == sms);       // prints false. Different references. Message@7fbe847c == Message@6996db8 
    System.out.println(moreSms.equals(sms));  // prints false

    // System.out.println(sms.equals(new Message("SMS"))); // false
    System.out.println(sms.toString().equals(moreSms.toString())); // false

    // System.out.println(new Message("LMAO"));
    // System.out.println(sms);

    String s1 = new String("YOO");
    String s2 = new String("YOO");
    String s3 = "YOO"; // gets stored in the String Pool.
    System.out.println(s1 == s2); // prints false. 2 new references are created in the Heap
  }
}
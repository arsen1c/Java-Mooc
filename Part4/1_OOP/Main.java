class OOP {
  public static void main(String[] args) {
    Person ada = new Person("arsenic");
    
    ada.printPerson(); 
    ada.growOlder();
    ada.printPerson();
    System.out.print(ada.isOfLegalAge());
  }
}
class Employee {
  private String lastName;
  private String firstName;
  private String empid;
  private int age;
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public String getEmpId() {
    return empid;
  }
  public void setEmpId(String empid) {
    this.empid = empid;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    if (age >= 18) {
      this.age = age;
      return;
    }
    // Throw exception
    System.out.println("Invalid age");
  }

  @Override
  public String toString() {
    return getFirstName() + " " + getLastName() + " " + getAge() + " " + getEmpId();
  }
}


public class EncapsulationDemo {
  public static void main(String[] args) {
    Employee employeeBean = new Employee();
    employeeBean.setEmpId("E001");
    employeeBean.setLastName("Mishra");
    employeeBean.setFirstName("Pyaremohan");

    // not possible to do this as field is private
    // employeeBean.age(7);
    employeeBean.setAge(35);

    System.out.println("Added Employee- " + employeeBean);
  }
}
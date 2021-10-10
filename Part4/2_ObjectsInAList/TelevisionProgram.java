/*

  Sample output:
    Name:     Rick and Morty
    Duration: 25
    Name:     Two and a Half Men
    Duration: 30
    Name:     Love it or list it
    Duration: 60
    Name:     House
    Duration: 60

    Program's maximum duration?  
    -> 30
    Output: 
      Rick and Morty, 25 minutes
      Two and a Half Men, 30 minutes
    
*/

public class TelevisionProgram {
  private String name;
  private int duration;

  public TelevisionProgram(String name, int duration) {
    this.name = name;
    this.duration = duration;
  }

  public String toString() {
    return this.name + ", " + this.duration + " minutes";
  }

  public int getDuration() {
    return this.duration;
  }
}
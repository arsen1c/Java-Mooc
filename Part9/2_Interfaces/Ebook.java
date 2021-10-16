import java.util.ArrayList;

public class Ebook implements Readable {
  private String name;
  private ArrayList<String> pages;
  private int pageNumber;

  public Ebook(String name, ArrayList<String> pages) {
    this.name = name;
    this.pages = pages;
    this.pageNumber = 0;
  }

  public String getName() {
    return this.name;
  }

  public int pages() {
    return this.pages.size();
  }

  public String read() {
    String page = this.pages.get(this.pageNumber);
    nextPage();
    return page;
  }

  /*
    nextPage: increases the page number by 1.
  
  */
  private void nextPage() {
    this.pageNumber = this.pageNumber + 1;
    // 11 % 11 = 0; 1 % 1 = 0; SomeNumber % SomeNumber = 0
    if (this.pageNumber % this.pages.size() == 0) {
      this.pageNumber = 0;
    }
  }
}
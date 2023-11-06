class children
  {
    void read()
    {
      System.out.println("reading");
    }
    void write()
    {
      this.read();
      System.out.println("writing");
    }
  }
public class Thiskeyword
  {
    public static void main(String[] args){
      children s=new children();
      s.write();
    }
  }
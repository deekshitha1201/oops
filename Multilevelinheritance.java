class grandfather
  {
    void properties()
    {
      System.out.println("properties are given to his children");
    }
  }
class father extends grandfather{
  void property()
  {
    System.out.println("father give his property to son");
  }
}
class child extends father{
  void happy()
  {
    System.out.println("father give properties to the child");
  }
}
public class Multilevelinheritance
  {
    public static void main(String[] args)
    {
      child m= new child();
      m.properties();
      m.property();
      m.happy();
    }
  }
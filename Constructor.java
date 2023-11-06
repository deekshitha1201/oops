class student
  {
    int id;
    String name;
    student(int i,String n)
    {
      id=i;
      name=n;
    }
    void display()
    {
      System.out.println(id);
      System.out.println(name);
    }
  }
public class Constructor
  {
    public static void main(String[] args){
      student s=new student(1,"man");
      s.display();
    }
  }
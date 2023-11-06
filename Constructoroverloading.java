class human
  {
    String name;
    int id;
    int age;
    double salary;
    human(String n,int i,int a)
    {
      name=n;
      id=i;
      age=a;
    }
    human(double s,int i)
    {
      salary=s;
      id=i;
    }
    void display()
    {
      System.out.println(name);
      System.out.println(id);
      System.out.println(age);
      System.out.println(salary);
    }
  }
public class Constructoroverloading
  {
    public static void main(String[] args){
      human h=new human("deekshu",1,22);
      human h1=new human(20000,134);
      h.display();
      h1.display();
    }
  }
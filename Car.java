class Vehicle
  {
    String name="abc";
    int carno=1234;
    String brand="def";
    void display(){
      System.out.println("display the car details");
      System.out.println(name);
      System.out.println(carno);
      System.out.println(brand);
    }
  }
    public class Car
      {
        public static void main(String[] args){
          Vehicle v=new Vehicle();
          v.display();
        }
      }

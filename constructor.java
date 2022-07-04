// in this we are going to talk about the constructor that constructor are similar to the methods but they are used to initialize the object
//constructor don't have any return type.
//if we don't create the constructor by ourself then default constructor is called
//every time we create an object by using the new() keyword,a constructor is called.
//there are two types of constructores: Default And parametrized constructor
// A constructor with some specified number of the parameters is called the parametrized constructor
//note: the class name and the constructor name should be the same

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 0;
        name = "Your-Name-Here";
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){
        id = 1;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class constructor {
    public static void main(String[] args) {
        //MyMainEmployee harry = new MyMainEmployee("ProgrammingWithHarry", 12);
        MyMainEmployee ananya = new MyMainEmployee();
        //ananya.setName("Ananya Agrawal");
        //ananya.setId(34);
        System.out.println(ananya.getId());
        System.out.println(ananya.getName());
    }
}


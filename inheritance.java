// in this we are going to talk about ther  inheritance. Inheritance is used to borrow properties and methods from an existing class.
//inheritance help us to create the classes based on the existing classes which increase the code reusuability.
// the extend keyword is used to inherit a subclass from a superclass.
// the class from which a class inherit methods and attributes is known as the parent class and the super class.
// note: Java doesn't support the multiple inheritance i.e two classes cann't be a superclass for a subclass.

class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class inheritance {
    public static void main(String[] args) {
        // Creating an Object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        // Creating an object of derived class
        Derived d = new Derived();
        d.setY(43);
        System.out.println(d.getY());
    }
}

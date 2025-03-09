public class inheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "ram";

        System.out.println("Child's name: " + child.name);
        
    }
    
}

class Child extends Parent {

}

class Parent extends GrandParent {

}

class GrandParent {

    String name;
}
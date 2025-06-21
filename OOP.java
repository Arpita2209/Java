class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("write something");
    }

    public void printcolor(){
        System.out.println(this.color);

    }

}

public class OOP {
    public static void main(String[] args){
        Pen p1=new Pen();
        p1.color="black";
        p1.type="ballpen";
        p1.write();
        p1.printcolor();
        
    }
}

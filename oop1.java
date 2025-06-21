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
public class oop1{
    public static void main(String[] args){
        Pen pen1=new Pen();
        pen1.color="blue";
        pen1.type="ball";
        
        Pen pen2=new Pen();
        pen2.color="black";
        pen2.type="gel";
        System.out.println("pen 1 color: " + pen1.color );
        System.out.println("pen 1 type" + pen1.type);

        
    }

}
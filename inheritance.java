class Shape{
    public void area(){
        System.out.println("display");
    }
}
class triangle extends Shape{
    public void area(int l, int b){
        System.out.println(1/2*l*b);
    }
}
class equilateraltriangle extends Shape{
    public void area(int l,int b){
        System.out.println(1/2*l*b);

    }
}
public class inheritance {
    public static void main(String[] args) {
        Shape s1=new Shape();
        s1.area();
        
        triangle t1=new triangle();
        t1.area(5,6);
    }
    
}

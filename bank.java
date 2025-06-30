class account{
    public String name;
    public String email;
    private String password; 

    public String getPassword(){
       return this.password;
    }
     public void setPassword(String pass){
        this.password=pass;
     }
}

public class bank {
public static void main(String[] args) {
    account acc=new account();
    acc.name="Arpita";
    acc.email="arpitasarode1@gmail.com";
    acc.setPassword("abcd");
    System.out.println(acc.getPassword());

}
    
}

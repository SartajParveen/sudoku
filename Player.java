package player;

public class Player {
    String name;
    int age;
    String contactNo;
    String email;
    public Player(String name,int age,String contactNo,String email){
        this.name=name;
        this.age=age;
        this.contactNo=contactNo;
        this.email=email;
    }
    public String getName(){
        return name;
    }

}

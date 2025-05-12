

public class Admin extends Account{
    private String AuthPassword;
    public Admin(int id,String name, String AuthPassword){
        super(id,name);
        this.AuthPassword=AuthPassword;
    }
}

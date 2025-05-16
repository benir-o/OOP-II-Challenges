
abstract public class Account {
    protected int id;
    protected String name;
    private DataSource myData;
    public Account(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void performOperation(DataSource _myData){
        myData= _myData;
        myData.execute();
    }

}

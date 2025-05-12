package object_oriented_analysis_and_design;

import javax.sql.DataSource;
import java.sql.SQLException;

abstract public class Account {
    protected int id;
    protected String name;
    private object_oriented_analysis_and_design.DataSource myData;
    public Account(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void performOperation(DataSource _myData){
        myData= (object_oriented_analysis_and_design.DataSource) _myData;
        myData.execute();
    }

}

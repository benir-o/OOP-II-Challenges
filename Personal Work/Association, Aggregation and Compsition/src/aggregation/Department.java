package aggregation;

import java.util.ArrayList;
import java.util.List;

/*
In composition, one class contains another, but they can still exist
independently?
 */
public class Department {
    String name;
    List<Professors> p1=new ArrayList<>();
}
class Professors{
    /*
    Deleting the department objects does not delete
    the professor objects
     */
}


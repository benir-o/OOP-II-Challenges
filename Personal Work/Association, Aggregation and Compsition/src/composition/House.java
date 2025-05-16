package composition;

import java.util.ArrayList;

public class House {
    /*
    Two classes are strongly associated and dependent.
    If I delete the House, then all the rooms are destroyed.
     */
    House(){
        var house1=new ArrayList<>();
        house1.add(new Room());
    }
}
class Room {
    String name;
    /*
    When I instantiate an object of type House, a new room gets created,
    This highlights the power of composition.
     */
}

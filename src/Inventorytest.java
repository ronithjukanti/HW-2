import com.company.Inventory;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Inventorytest {
    @Test

    public void testadd()
    {
        //given
        Inventory inventory=new Inventory();
        List<String> al=inventory.add();
        al.add("Audi");
        al.add("BMW");
        al.add("Ford");
        al.add("Honda city");

        //when
        System.out.println("Running testInsert()");


        //then
        Assert.assertEquals("wrong size", 4, al.size());
        Assert.assertEquals("Wrong 1st element", "Audi", al.get(0));
        Assert.assertEquals("Wrong 2nd element", "BMW", al.get(1));
        Assert.assertEquals("Wrong 3rd element", "Ford", al.get(2));
        Assert.assertEquals("Wrong 3rd element", "Honda city", al.get(3));

    }
   /* @Test
    public void testaverage()
    {
        //given
        double average=
    }*/

}

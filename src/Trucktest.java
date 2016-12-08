import com.company.Truck;
import org.junit.Assert;
import org.junit.Test;

public class Trucktest {
    @Test
    public void testgetters()
    {
        //given
        char hasSideStep='Y';
        String TowCapacity="3 tons";
        Truck truck=new Truck("A&N", "Sweedish truck", "2016", 'Y', 50000, 10, 'Y',"3 tons");

        //when
        truck.printVehicle();

        //then
        Assert.assertEquals("mismatch",hasSideStep,truck.getHasSideStep());
        Assert.assertEquals("mismatch",TowCapacity,truck.getTowCapacity());
    }
    @Test
    public void testgetters1()
    {
        //given
        char hasSideStep='N';
        String TowCapacity="3 tons";
        Truck truck=new Truck("A&N", "Dutch Truck", "2012", 'Y', 35000, 10, 'N',"3 tons");
        //when
        truck.printVehicle();

        //then
        Assert.assertEquals("mismatch",hasSideStep,truck.getHasSideStep());
        Assert.assertEquals("mismatch",TowCapacity,truck.getTowCapacity());
    }
}

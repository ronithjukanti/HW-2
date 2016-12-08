import com.company.Vehicle;
import org.junit.Assert;
import org.junit.Test;

public class Vehicletest {

    @Test
    public void testgetters_truck()
    {
        //given
        String Make="A&N";
        String Model="Sweedish truck";
        String Model_year="2016";
        char four_Wheel_drive='Y';
        int price=50000;
        int Milage=10;
        Vehicle vehicle=new Vehicle("A&N", "Sweedish truck", "2016", 'Y', 50000, 10);

        //when
        vehicle.printVehicle();

        //then
        Assert.assertEquals("mismatch",Make,vehicle.getMake());
        Assert.assertEquals("mismatch",Model,vehicle.getModel());
        Assert.assertEquals("mismatch",Model_year,vehicle.getModel_year());
        Assert.assertEquals("mismatch",four_Wheel_drive,vehicle.getFour_Wheel_drive());
        Assert.assertEquals("mismatch",price,vehicle.getPrice());
        Assert.assertEquals("mismatch",Milage,vehicle.getMilage());
    }
    @Test
    public void testgetters_truck1()
    {
        //given
        String Make="A&N";
        String Model="Dutch Truck";
        String Model_year="2012";
        char four_Wheel_drive='Y';
        int price=35000;
        int Milage=10;
        Vehicle vehicle=new Vehicle("A&N", "Dutch Truck", "2012", 'Y', 35000, 10);
        //when
        vehicle.printVehicle();

        //then
        Assert.assertEquals("mismatch",Make,vehicle.getMake());
        Assert.assertEquals("mismatch",Model,vehicle.getModel());
        Assert.assertEquals("mismatch",Model_year,vehicle.getModel_year());
        Assert.assertEquals("mismatch",four_Wheel_drive,vehicle.getFour_Wheel_drive());
        Assert.assertEquals("mismatch",price,vehicle.getPrice());
        Assert.assertEquals("mismatch",Milage,vehicle.getMilage());
    }
    @Test
    public void testgetters_car()
    {
        //given
        String Make="Maruthi";
        String Model="Baleno";
        String Model_year="2016";
        char four_Wheel_drive='N';
        int price=150000;
        int Milage=25;
        Vehicle vehicle=new Vehicle("Maruthi", "Baleno", "2016", 'N', 150000, 25);
        //when
        vehicle.printVehicle();

        //then
        Assert.assertEquals("mismatch",Make,vehicle.getMake());
        Assert.assertEquals("mismatch",Model,vehicle.getModel());
        Assert.assertEquals("mismatch",Model_year,vehicle.getModel_year());
        Assert.assertEquals("mismatch",four_Wheel_drive,vehicle.getFour_Wheel_drive());
        Assert.assertEquals("mismatch",price,vehicle.getPrice());
        Assert.assertEquals("mismatch",Milage,vehicle.getMilage());
    }
    @Test
    public void testgetters_car1()
    {
        //given
        String Make="BMW";
        String Model="C-34";
        String Model_year="2014";
        char four_Wheel_drive='Y';
        int price=1100000;
        int Milage=15;
        Vehicle vehicle=new Vehicle("BMW", "C-34", "2014", 'Y', 1100000, 15);
        //when
        vehicle.printVehicle();

        //then
        Assert.assertEquals("mismatch",Make,vehicle.getMake());
        Assert.assertEquals("mismatch",Model,vehicle.getModel());
        Assert.assertEquals("mismatch",Model_year,vehicle.getModel_year());
        Assert.assertEquals("mismatch",four_Wheel_drive,vehicle.getFour_Wheel_drive());
        Assert.assertEquals("mismatch",price,vehicle.getPrice());
        Assert.assertEquals("mismatch",Milage,vehicle.getMilage());
    }
}

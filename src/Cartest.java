import com.company.Car;
import org.junit.Assert;
import org.junit.Test;

public class Cartest{
    @Test
    public void testgetters()
    {
        //given
        char IsitConvertible='N';
        Car car=new Car("Maruthi", "Baleno", "2016", 'N', 150000, 25, 'N');

        //when
        car.printVehicle();

        //then
        Assert.assertEquals("mismatch",IsitConvertible,car.getIsitConvertible());
    }
    @Test
    public void testgetters1()
    {
        //given
        char IsitConvertible='Y';
        Car car=new Car("BMW", "C-34", "2014", 'Y', 1100000, 15, 'Y');
        //when
        car.printVehicle();

        //then
        Assert.assertEquals("mismatch",IsitConvertible,car.getIsitConvertible());
    }

}

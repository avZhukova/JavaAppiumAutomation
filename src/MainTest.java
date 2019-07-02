import org.junit.Test;

public class MainTest extends MainClass

{

    @Test
  public void testGetLocalNumber() {


        if (getLocalNumber() == 14) {

            System.out.println("Успех");

        } else {
            System.out.println("Число не равно 14");

        }


    }


}
import org.junit.Test;

import static org.junit.Assert.fail;

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

@Test
    public void  testGetClassNumber()
{

    if (getClassNumber() > 45) {

        System.out.println("Успех");

    } else {
        System.out.println("Число не равно 45");

    }


}

@Test
    public void testGetClassString()
{

if (getClassString().toLowerCase().contains(getClassSubstrin().toLowerCase()))
{


    System.out.println("В строке найдена подстрока: " + getClassSubstrin());



} else {


    typeError("Нет совпадений по запросу " + getClassSubstrin());
    fail();
}


    {

    }

}



}
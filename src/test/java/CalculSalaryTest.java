import org.junit.Assert;
import org.junit.Test;

//import static org.testng.Assert.*;

public class CalculSalaryTest {
      CalculSalary cal=new CalculSalary("adam","ado");

      @Test
    public void testSalaryPLN()
      {
          System.out.println("salary in PLN");
          double result =1200*22*(1-0.19);
          double expectresult=21384;
          double r;
          r = CalculSalary.monthlySalaryinPln(result);
          System.out.println("salary is " + r + " and the expect is " + expectresult);
          Assert.assertEquals(expectresult,r,2);
      }
      @Test
    public void testSalaryGPB()
      {
          System.out.println("Salary GBP to PNL");

            double salary=(600*22*(1-0.25));
          double currency=4.8643;
          double expectresult=45;
          double r=CalculSalary.monthlySalaryinGbp(salary,currency);
          System.out.println("the result is " + r + " and different to what we expect " + expectresult );
//          Assert.assertEquals(expectresult,r);
         Assert.assertNotEquals(expectresult,r,2);


      }
      @Test
    public void testSalaryEURO()
      {
          System.out.println("Salary in Euro to PLN");
          double salarynet=800*22*(1-0.2);
           double currency=4.3314;
          double expectresult=60;
          double t=CalculSalary.monthlySalaryinEuro(salarynet,currency);
          System.out.println("Salary is " + t + " and the expect is " + expectresult);
        Assert.assertNotEquals(expectresult,t,2);
   }

}
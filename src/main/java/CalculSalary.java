public class CalculSalary {
    private static double taxegpb=0.25;
    private String name;
    private  String surname;
    private static double daypaygerman=800;
    private static double daypaybritain=600;
    private static double daypaypoland=1200;
    private static double taxpl=0.19;
    private static double taxeeuro=0.2;
    private static double day=22;
    private static double salary;
    public CalculSalary(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public static  double monthlySalaryinPln(double salarynet)
    {
//        double salary;

        salarynet=(daypaypoland*22)*(1-taxpl);

        return  salarynet;
    }
    public static double monthlySalaryinGbp(double salaryneto,double currency)
    {;
         salaryneto=daypaybritain*22*(1-taxegpb);
         currency=4.8643;
        return salaryneto * currency;
    }
    public static double monthlySalaryinEuro(double salarynetoo,double currency)
    {

         salarynetoo=daypaygerman*22*(1-taxeeuro);
        currency = 4.3314;
        return salarynetoo * currency;
    }

    public void printSalary()
    {
        System.out.println("informations about the employee:" + getName() + " " + getSurname());
        System.out.println("Welcome to salary of employee");
        System.out.println("************************************");
        System.out.println("salary to employee from Poland display in PLN");
//        System.out.println(monthlySalaryinPln(salary));
        System.out.println("************************************");
        System.out.println("salary to employee from german display in PLN");
//        System.out.println(monthlySalaryinEuro(salary));
        System.out.println("************************************");
        System.out.println("salary to employee from London display in PLN");
//        System.out.println(monthlySalaryinGbp(salary));

    }
}

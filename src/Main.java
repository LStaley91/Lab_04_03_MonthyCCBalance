public class Main
{
    public static void main(String[] args)
    {
        double balance = 5000;
        double intrestRate = 1.17;
        double month1 = balance * intrestRate;
        double month2 = month1 * intrestRate;
        System.out.println("First months Balance with the intrest rate of " + intrestRate + " is " + month1 );
        System.out.println("Secound months Balance with the intrest rate of " + intrestRate + " is " + month2 );

    }
}
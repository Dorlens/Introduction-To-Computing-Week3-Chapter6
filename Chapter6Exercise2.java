public class Chapter6Exercise2 
{
    public static void main(String[] args) 
    {
        int x = 48;
        int y = 18;
        System.out.println("The GCD of " + x + " and " + y + " is " + gcd(x, y));
    }


    public static int gcd(int a, int b) 
    {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}

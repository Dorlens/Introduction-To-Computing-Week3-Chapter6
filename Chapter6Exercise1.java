public class Chapter6Exercise1 
{
    public static void main(String[] args) 
    {
        int x = 48;
        int y = 18;
        System.out.println("The GCD of " + x + " and " + y + " is " + gcd(x, y));

    }



        public static int gcd(int a, int b) 
        {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }



    
}
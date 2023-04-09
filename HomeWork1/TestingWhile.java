package HomeWork1;

public class TestingWhile 
{
    public static void main(String[] args) 
    {
        int nr=10, sum=0;

        while(nr > 0){
            sum += nr;
            nr--;
        }

        System.out.println(sum);
    }
}

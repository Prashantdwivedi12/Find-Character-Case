import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution 
{
    public static void main(String args[]) throws IOException
    {
        char m;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        m = (char) bf.read();
        if(m >= 97 && m <= 123)
        {
            System.out.println("0");
        }
        else if(m >= 65 && m <= 96)
        {
            System.out.println("1");
        }
        else if(m >= 32 && m <= 64)
        {
            System.out.println("-1");
        }
    }
}

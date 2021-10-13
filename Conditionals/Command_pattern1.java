/* Dispaly n stars using command line argument..
*
*
*
*
*/
public class Command_pattern1 
{
    public static void main(String[] args) 
    {
    
        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++) 
        {

            System.out.println("*");
        }
    }
    
}


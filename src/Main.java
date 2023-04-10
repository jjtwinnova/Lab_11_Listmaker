import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //declare variables
        ArrayList<String> myList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input;
        boolean again = true;

        //run it
        while(again == true)
        {
            //get input and call methods
            input = SafeInput.getRegExString(sc, "Enter A to Add an item, D to Delete an item, P to Print the list, or Q to Quit","[AaDdPpQq]");
            if(input.equalsIgnoreCase("a"))
            {
                aOption(sc, myList);
            }
           else if(input.equalsIgnoreCase("d"))
            {
                dOption(sc, myList);
            }
            else if(input.equalsIgnoreCase("p"))
            {
                pOption(myList);
            }
            else if(input.equalsIgnoreCase("q"))
            {
                again = false;
            }
        }

    }
public static void aOption(Scanner sc, ArrayList<String> myList) //add method
    {
        String add = SafeInput.getNonZeroLenString(sc,"What are you adding");
        myList.add(add);
    }
    public static void dOption(Scanner sc, ArrayList<String> myList) //delete method
    {
        int  delete = SafeInput.getRangedInt(sc,"Which list number are you deleting", 0, myList.size());
        myList.remove(delete);
    }

    public static void pOption(ArrayList<String> myList) //print method
    {
    System.out.println(myList);
    }
}


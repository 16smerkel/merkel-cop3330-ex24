import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.println("Enter the first string:");
        String theFirst = scanner.nextLine();
        System.out.println("Enter the second string:");
        String theSecond = scanner.nextLine();
        boolean Answer = isAnagram(theFirst, theSecond);
        if (Answer)
        {
            System.out.println(theFirst + " and " + theSecond + " are anagrams.");
        }
        else
        {
            System.out.println(theFirst + " and " + theSecond + " are not anagrams.");
        }

    }

    public static boolean isAnagram(String first, String second)
    {
        if(first.length() == 0 || second.length() == 0 || first.length() != second.length())
        {
            return false;
        }
        int theCheck = 0;
        for(int i = 0; i < first.length(); i++)
        {
            for(int j = 0; j < second.length(); j++) {
                char theOne = first.charAt(i);
                char theSec = second.charAt(j);
                if (theOne == theSec) {
                    theCheck++;
                    break;
                }
            }
            if (theCheck != i+1)
            {
                return false;
            }
        }
        return true;
    }
}


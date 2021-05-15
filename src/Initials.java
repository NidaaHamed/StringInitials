import java.util.Scanner;

// Java program to print initials of a name
class Initials {

    static void printInitials(String name)
    {
        if (name.length() == 0)
            return;

        // Since toUpper() returns int,
        // we do typecasting
        System.out.print(Character.toUpperCase(
                name.charAt(0)));

        // Traverse rest of the string and
        // print the characters after spaces.
        for (int i = 1; i < name.length() - 1; i++)
            if (name.charAt(i) == ' ')
                System.out.print(" " + Character.toUpperCase(
                        name.charAt(i + 1)));
    }

    // Driver code
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter Your Name: ");
        String name= sc.nextLine();              //reads string
        printInitials(name);
    }
}

// This code is contributed by Danish Kaleem


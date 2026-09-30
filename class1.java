package objects;
import unit4.bucketLib.Bucket;
import java.util.Scanner;
import java.awt.Point;

public class class1 {

    public static void question1Task1() // this function makes 6 buckets and fills the first one to the max and the the next one to half of the first one and so on
    {
        Bucket b1=new Bucket(5,"b1");
        Bucket b2=new Bucket(3,"b2");
        Bucket b3=new Bucket(4,"b3");
        Bucket b4=new Bucket(2,"b4");
        Bucket b5=new Bucket(6,"b5");
        Bucket b6=new Bucket(10,"b6");
        b1.fill(b1.getCapacity());
        b2.fill(b1.getCurrentAmount()/2);
        b3.fill(b2.getCurrentAmount()/2);
        b4.fill(b3.getCurrentAmount()/2);
        b5.fill(b4.getCurrentAmount()/2);
        b6.fill(b5.getCurrentAmount()/2);
    }

    public static void question1Task2() // this function makes 3 buckets with a capacity of 20 and fills them all with a random number from 0 to 20 and then fills them all with the highest number that came out of the math.random
    {
        Bucket b1=new Bucket(20,"b1");
        Bucket b2=new Bucket(20,"b2");
        Bucket b3=new Bucket(20,"b3");
        b1.fill(Math.random()*21);
        b2.fill(Math.random()*21);
        b3.fill(Math.random()*21);
        double max = Math.max(Math.max(b1.getCurrentAmount(), b2.getCurrentAmount()),b3.getCurrentAmount());
        b1.fill(max-b1.getCurrentAmount());
        b2.fill(max-b2.getCurrentAmount());
        b3.fill(max-b3.getCurrentAmount());
    }

    public static void question1Task3() // this function makes 3 buckets with random capacity from 1 to 10 and then fills it with a random number that's not bigger than the capacity and prints the buckets amount from smallest to biggest
    {
        Bucket b1 = new Bucket((int)(Math.random()*10)+1, "b1");
        Bucket b2=new Bucket((int)(Math.random()*10)+1,"b2");
        Bucket b3=new Bucket((int)(Math.random()*10)+1,"b3");
        b1.fill(Math.random()*b1.getCapacity());
        b2.fill(Math.random()*b2.getCapacity());
        b3.fill(Math.random()*b3.getCapacity());
        double min = Math.min(Math.min(b1.getCurrentAmount(),b2.getCurrentAmount()),b3.getCurrentAmount());
        double max = Math.max(Math.max(b1.getCurrentAmount(),b2.getCurrentAmount()),b3.getCurrentAmount());
        double middle = b1.getCurrentAmount()+b2.getCurrentAmount()+b3.getCurrentAmount()-min-max;
        System.out.println(min);
        System.out.println(middle);
        System.out.println(max);
    }

    public static void question2Task1(Scanner input) // this function reads 6 strings, prints their lengths, and finds the lengths of the longest and shortest strings
    {
        System.out.print("Enter string N: ");
        String st=input.next();
        System.out.println("The length of the string is: "+st.length());
        int length=st.length();
        int max=length;
        int min=length;
        for (int i = 1; i < 6; i++)
        {
            System.out.print("Enter string N: ");
            String str=input.next();
            System.out.println("The length of the string is: "+str.length());
            if (str.length() < min)
                min = str.length();
            if (str.length() > max)
                max = str.length();
        }
        System.out.println("Longest string is: "+max+" shortest string is: "+min);
    }

    public static void question2Task2(Scanner input) // this function reads a first string and a number n, then reads n more strings and counts how many match the first string exactly
    {
        System.out.print("Enter your first string: ");
        String first = input.next();
        System.out.print("Enter a full number: ");
        int n = input.nextInt();
        int counter = 0;
        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter a string: ");
            String str = input.next();
            if (str.equals(first))
            {
                counter++;
            }
        }
        System.out.println(counter+" strings were equal to first");
    }

    public static void question2Task3(Scanner input) // this function reads a string and a number n, then reads n strings and tells if they come before, after, or are the same as the first string alphabetically
    {
        System.out.print("Enter your first string: ");
        String first = input.next();
        System.out.print("Enter a full number: ");
        int n = input.nextInt();
        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter a string: ");
            String str = input.next();
            if (str.compareTo(first) > 0)
                System.out.println("after");
            if (str.compareTo(first) < 0)
                System.out.println("before");
            if (str.compareTo(first) == 0)
                System.out.println("same");
        }
    }

    public static void question2Task4(Scanner input) // this function reads two strings and checks if the second string can be found inside the first string
    {
        System.out.print("Enter your str1 string: ");
        String str1 = input.next();
        System.out.print("Enter your str2 string: ");
        String str2 = input.next();
        if (str1.indexOf(str2) != -1)
        {
        	System.out.println("str2 shows up in str1");
        } 
        else 
        {
        	System.out.println("str2 does not show up in str1");
        }
    }
    
    public static void question2Task5(Scanner input) // this function reads two strings and counts exactly how many times the second string appears inside the first string
    {
        System.out.print("Enter your str1 string: ");
        String str1 = input.next();
        System.out.print("Enter your str2 string: ");
        String str2 = input.next();
        int counter = 0;
        int index = str1.indexOf(str2);
        while (index != -1)
        {
        	counter++;
        	index = str1.indexOf(str2, index + str2.length());
        }
        System.out.println("str2 shows up "+counter+" times");
    }
    
    public static void question2Task6(Scanner input) // this function reads an email and checks if the @ symbol appears exactly once and not at the very beginning or end
    {
        System.out.print("Enter your email: ");
        String email = input.next();

        int index = email.indexOf("@");

        if (index == -1)
        {
            System.out.println("@ does not appear.");
        }
        else if (index == 0)
        {
            System.out.println("@ appears in the first position.");
        }
        else if (index == email.length() - 1)
        {
            System.out.println("@ appears in the last position.");
        }
        else if (index != email.lastIndexOf("@"))
        {
            System.out.println("@ appears more than once.");
        }
        else
        {
        	System.out.println("The email is valid");
            System.out.println("@ appears exactly once and is not first or last.");
        }
    }

    public static void question2Task7(Scanner input) // this function checks if an entered string is exactly 9 characters long and contains only numbers to validate it as an ID
    {
        System.out.print("Enter ID number: ");
        String id = input.next();
        boolean valid = id.length() == 9;
        for (int i = 0; i < id.length() && valid; i++)
        {
            char c = id.charAt(i);
            if (c < '0' || c > '9')
                valid = false;
        }
        if (valid)
            System.out.println("Can be an ID number");
        else
            System.out.println("Can't be an ID number");
    }

    public static void question2Task8(Scanner input) // this function checks if a string is a valid phone number starting with '05', having a dash at position 4, and only numbers elsewhere
    {
        System.out.print("Enter phone number: ");
        String phone = input.next();
        boolean valid = phone.length() == 11
                && phone.startsWith("05")
                && phone.charAt(3) == '-';
        for (int i = 0; i < phone.length() && valid; i++)
        {
            if (i == 3)
                continue;
            char c = phone.charAt(i);
            if (c < '0' || c > '9')
                valid = false;
        }
        if (valid)
            System.out.println("Valid phone number");
        else
            System.out.println("Not a valid  phone number");
    }
    
    public static void task3Part1and2() // this function creates two points, finds which one is lower, moves it up on the y-axis until they are level, and then tests equality
    {
        Point point1 = new Point(5, 2);
        System.out.println("point1 : " + point1);
 
        Point point2 = new Point(2, 7);
        System.out.println("point2 : " + point2);
 
        if (point1.y > point2.y)
            System.out.println("point1 is higher");
        else if (point2.y > point1.y)
            System.out.println("point2 is higher");
        else
            System.out.println("same height");
 
        Point lower, higher;
        String lowerName;
        if (point1.y < point2.y)
        {
            lower = point1;
            higher = point2;
            lowerName = "point1";
        }
        else
        {
            lower = point2;
            higher = point1;
            lowerName = "point2";
        }
        while (lower.y < higher.y)
        {
            lower.translate(0, 1);
            System.out.println(lowerName + ":" + lower);
        }
 
        System.out.println("equal values? " + point1.equals(point2));
 
        point2.move(point1.x, point1.y);
        System.out.println("point1:" + point1);
        System.out.println("point2:" + point2);
 
        boolean same = point1 == point2;
        boolean equal = point1.equals(point2);
        System.out.println("is point1==point2 ? " + same);
        System.out.println("is point1.equals(point2) ? " + equal);
    }
 
    public static void task3Part3() // this function makes two points, figures out which has the lower y value, and translates it to exactly match the coordinates of the other point
    {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(4, 1);
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
 
        Point lower = (p1.y < p2.y) ? p1 : p2;
        Point higher = (lower == p1) ? p2 : p1;
        lower.translate(higher.x - lower.x, higher.y - lower.y);
 
        System.out.println("After the change:");
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
    }
 
    public static void task3Part4(Scanner input) // this function takes a target x,y coordinate and keeps asking for new coordinates until the user guesses the target point, counting the attempts
    {
        System.out.print("Enter x: ");
        int x = input.nextInt();
        System.out.print("Enter y: ");
        int y = input.nextInt();
        Point target = new Point(x, y);
 
        int count = 1;
        boolean found = false;
        while (!found)
        {
            System.out.print("Enter x: ");
            int nx = input.nextInt();
            System.out.print("Enter y: ");
            int ny = input.nextInt();
            count++;
            if (target.equals(new Point(nx, ny)))
                found = true;
        }
        System.out.println("Number of inputs: " + count);
    }


    public static void main(String[] args) { // this is the main setup function that holds the scanner and all the commented-out function calls to easily test them
        Scanner input = new Scanner(System.in);
        //question1Task1();
        //question1Task2();
        //question1Task3();
        //question2Task1(input);
        //question2Task2(input);
        //question2Task3(input);
        //question2Task4(input);
        //question2Task5(input);
        //question2Task6(input);
        //question2Task7(input);
        //question2Task8(input);
        //task3Part1and2();
        //task3Part3();
        //task3Part4(input);
        input.close();
    }

}

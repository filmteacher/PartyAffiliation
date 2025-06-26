import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String party = ""; // String party = ""

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your party affiliation. [DRI]: "); // output “Enter your party affiliation. D for Democrat, R for Republican, or I for Independent: “
        party = in.nextLine();  // input party
        party = party.toUpperCase(); // change to uppercase

        switch (party)
        {
            case "D": // if party == "D" then
                System.out.println("You get a Democratic Donkey."); // output "You get a Democratic Donkey."
                break;
            case "R": // else if party == "R" then
                System.out.println("You get a Republican Elephant."); // output "You get a Republican Elephant."
                break;
            case "I": // else if party == "I" then
                System.out.println("You get an Independent Man."); // output "You get an Independent Man."
                break;
            default:
                System.out.println("You are affiliated with another party, named: " + party + "."); // output "You are affiliated with another party, named" + party + "."
                break;
        } // end if
    }
}
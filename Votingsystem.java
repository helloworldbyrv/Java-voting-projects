import java.util.Scanner;

class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int candidate1vote = 0;
        int candidate2vote = 0;
        System.out.println("==========================");
        System.out.println("WELCOME TO ONLINE VOTING");
        System.out.println("===========================");
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("Not able to vote at your age");
        }
        if (age >= 18) {
            System.out.println("Enter the candidate name to vote for");
            System.out.println("================");
            System.out.println("1.Candidate 1");
            System.out.println("2.Candidate 2");
            System.out.println("================");
        }

        System.out.println("If you want to vote to candidate 1 type 0");
        System.out.println("If you want to vote to candidate 2 type 1");
        int vote = sc.nextInt();
        if (vote == 0) {
            System.out.println(candidate1vote);
            candidate1vote++;
        } else if (vote == 1) {
            System.out.println(candidate2vote);
            candidate2vote++;
        }
        System.out.println("The vote of candidate 1 is" + candidate1vote);
        System.out.println("The vote of candidate 2 is" + candidate2vote);

    }
}

import java.util.Scanner;

public class HiddenWord {

    private static String word;

    public HiddenWord(String s)
    {
        word =s;

    }
    public static String getHint(String g)
    {
        String s = "";

        for(int i=0;i<g.length();i++)
        {
            if(g.substring(i,i+1).equals(word.substring(i,i+1)))
            {
                s += g.substring(i,i+1);
            }
            else if(word.indexOf(g.substring(i,i+1))>=0)
            {
                s += "+";
            }
            else
            {
                s += "*";
            }
        }
        return s;
    }
    public static void main(String[] args) {
        // write your code here
        HiddenWord trial1 = new HiddenWord("APPLE");
        String hint = "";
        Scanner in = new Scanner(System.in);
        System.out.println("What's your guess?");
        String guess =in.nextLine();
        hint = trial1.getHint(guess);
        while (!hint.equals("APPLE")){
            System.out.println("Your hint: " + hint);
            System.out.println("What's your guess?");
            guess = in.nextLine();
            hint = trial1.getHint(guess);
        }
        System.out.println("Congrats you got the secret word");
    }
}

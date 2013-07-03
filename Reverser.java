package encryption;

import java.util.StringTokenizer;

public class Reverser extends Transpose
{
    Reverser(String s)
    {
        super(s);
    }

    String reverseText(String word)
    {
        StringTokenizer wordoutcome = new StringTokenizer(word);

        String s[];
        int z = wordoutcome.countTokens();
        s = new String[z];

        for(int i = 0; i < z; i++)
        {
            s[i] = wordoutcome.nextToken();
        }

        StringBuilder outcome = new StringBuilder();

        for (int i = 1; i <= z; i++)
        {
            outcome.append(s[z-i] + " ");
        }
        return outcome.toString();
    }
}
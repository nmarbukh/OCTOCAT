
package encryption;


public class Transpose extends Cipher
{
    Transpose (String s)
    {
        super(s);
    }

    public String encode(String word)
    {
        StringBuilder outcome = new StringBuilder(word);
        return outcome.reverse().toString();
    }

    public String decode(String word)
    {
        StringBuilder outcome = new StringBuilder(word);
        return outcome.reverse().toString();
    }
}

package encryption;



public class Caesar extends Cipher
{
    private boolean determineChar;


    public Caesar(String s)
    {
        super(s);
    }

    public String encode(String word)
    {
        StringBuilder result = new StringBuilder();

        word = word.toLowerCase();

        determineChar = true;

        for (int i = 0; i < word.length(); i++)
        {
            char ch = word.charAt(i);
            ch = determineCharacter(ch, Constant.ENCODE_SHIFT);
            result.append(ch);
        }
        return result.toString();
    }

    public String decode (String word)
    {
        determineChar =  false;
         word = word.toLowerCase();


        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++)
        {
            char ch = word.charAt(i);
            ch = determineCharacter(ch, Constant.DECODE_SHIFT);
            result.append(ch);
        }
        return result.toString();
    }

    public char determineCharacter(char ch, int shift)
    {
        if(determineChar)
        {
            ch = (char)('a' + (ch - 'a' + shift) % Constant.WRAP_AROUND);
        }
        else
        {
            ch = (char)('y' + (ch - 'y' - shift) % Constant.WRAP_AROUND);
        }
        return ch;
    }
}
package encryption;


    import javax.swing.JOptionPane;

public class TestEncryption {


    public static void main(String[] args) 
    
    {
        
        String code, output = "";
        
        String text = JOptionPane.showInputDialog("Please Enter message");
        
        output += "The original message is \n" + text + "\n";

        Cipher c = new Caesar(text);
        c.encrypt();
        code = c.getEncodedMessage();
        output += "\nCaesar Cipher\nThe encrypted message is \n" + code + "\n";
        c.decrypt(code);
        code = c.getDecodedMessage();
        output += "The decrypted message is \n" + code + "\n";

        c = new Transpose(text);
        c.encrypt();
        code = c.getEncodedMessage();
        output += "\nTranspose\nThe encrypted Transpose message is \n" + code + "\n";
        c.decrypt(code);
        code = c.getDecodedMessage();
        output += "The decripted Transpose message is \n" + code + "\n";

        Reverser r = new Reverser(text);

        r.encrypt();
        code = r.reverseText(r.getEncodedMessage());
        output += "\nReverser\nThe encrypted Reverse message is \n" + code + "\n";
        code = r.decode(code);
        output += "The decrypted Reverse message is \n" + code;

        System.out.println(output);
    }
}
    



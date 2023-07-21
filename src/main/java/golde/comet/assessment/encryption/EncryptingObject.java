package golde.comet.assessment.encryption;

import javax.crypto.Cipher;
import java.nio.charset.StandardCharsets;
import java.security.*;

public class EncryptingObject {

    public static void main(String[] args) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);

            KeyPair keyPair = keyPairGenerator.generateKeyPair();

            Cipher encryptCipher = Cipher.getInstance("RSA");
            Cipher decryptCipher = Cipher.getInstance("RSA");

            encryptCipher.init(Cipher.ENCRYPT_MODE, keyPair.getPublic());

            String plaintext = "Oscar Cortes";
            byte[] ciphertext = encryptCipher.doFinal(plaintext.getBytes(StandardCharsets.UTF_8));
            System.out.println("Ciphertext: " + new String(ciphertext, StandardCharsets.UTF_8));

            decryptCipher.init(Cipher.DECRYPT_MODE, keyPair.getPrivate());

            byte[] decryptedCiphertext = decryptCipher.doFinal(ciphertext);
            System.out.println("Decrypted Ciphertext: " + new String(decryptedCiphertext, StandardCharsets.UTF_8));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
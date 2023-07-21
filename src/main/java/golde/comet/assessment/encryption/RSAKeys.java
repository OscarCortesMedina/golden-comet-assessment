package golde.comet.assessment.encryption;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class RSAKeys {

    public static void main(String[] args) {
        try {
            // Create a KeyPairGenerator
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");

            // Initialize the KeyPairGenerator
            keyPairGenerator.initialize(2048);

            // Generate the KeyPair
            KeyPair keyPair = keyPairGenerator.generateKeyPair();

            // Get the public and private keys
            System.out.println("Public Key: " + keyPair.getPublic());
            System.out.println("Private Key: " + keyPair.getPrivate());

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}

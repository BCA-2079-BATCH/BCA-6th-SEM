import java.net.InetAddress;
import java.net.UnknownHostException;

public class AnyLocalAddressDemo {
    public static void main(String[] args) {
        try {
            // Construct the wildcard address 0.0.0.0
            byte[] wildcardBytes = {0, 0, 0, 0};
            InetAddress anyLocal = InetAddress.getByAddress(wildcardBytes);

            // Print address and check if it’s the “any” local address
            System.out.println("InetAddress: " + anyLocal);
            System.out.println("isAnyLocalAddress(): " + anyLocal.isAnyLocalAddress());

        } catch (UnknownHostException e) {
            System.err.println("Failed to create InetAddress: " + e.getMessage());
        }
    }
}
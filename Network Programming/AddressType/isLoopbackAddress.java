import java.net.InetAddress;
import java.net.UnknownHostException;

public class isLoopbackAddress {
    public static void main(String[] args) {
        try {
            // 1. Wildcard address (0.0.0.0)
            byte[] wildcardBytes = {0, 0, 0, 0};
            InetAddress anyLocal = InetAddress.getByAddress(wildcardBytes);

            // 2. Loopback address (127.0.0.1 or ::1)
            InetAddress loopback = InetAddress.getLoopbackAddress();

            // Check properties on the wildcard address
            System.out.println("Address: " + anyLocal);
            System.out.println("  isAnyLocalAddress(): " + anyLocal.isAnyLocalAddress());
            System.out.println("  isLoopbackAddress(): " + anyLocal.isLoopbackAddress());

            // Check properties on the loopback address
            System.out.println("Address: " + loopback);
            System.out.println("  isAnyLocalAddress(): " + loopback.isAnyLocalAddress());
            System.out.println("  isLoopbackAddress(): " + loopback.isLoopbackAddress());

        } catch (UnknownHostException e) {
            System.err.println("Error creating InetAddress: " + e.getMessage());
        }
    }
}
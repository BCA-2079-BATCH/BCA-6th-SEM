import java.net.InetAddress;
import java.net.UnknownHostException;

public class isLinkLocalAddress {
    public static void main(String[] args) {
        try {
            // Example of an IPv4 link-local address (169.254.x.x)
            InetAddress linkLocalIPv4 = InetAddress.getByName("169.254.10.20");
            
            // Example of a non-link-local address for comparison
            InetAddress privateIPv4 = InetAddress.getByName("192.168.0.1");

            System.out.println("Address: " + linkLocalIPv4);
            System.out.println("  isLinkLocalAddress(): " + linkLocalIPv4.isLinkLocalAddress());

            System.out.println("Address: " + privateIPv4);
            System.out.println("  isLinkLocalAddress(): " + privateIPv4.isLinkLocalAddress());

            // IPv6 link-local example (fe80::1234)
            InetAddress linkLocalIPv6 = InetAddress.getByName("fe80::1234");
            System.out.println("Address: " + linkLocalIPv6);
            System.out.println("  isLinkLocalAddress(): " + linkLocalIPv6.isLinkLocalAddress());

        } catch (UnknownHostException e) {
            System.err.println("Failed to resolve address: " + e.getMessage());
        }
    }
}
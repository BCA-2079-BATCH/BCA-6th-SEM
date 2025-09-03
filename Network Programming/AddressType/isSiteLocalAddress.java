import java.net.InetAddress;
import java.net.UnknownHostException;

public class isSiteLocalAddress {
    public static void main(String[] args) {
        try {
            // Examples of IPv4 site-local (private) addresses
            InetAddress addr1 = InetAddress.getByName("10.0.0.5");
            InetAddress addr2 = InetAddress.getByName("192.168.1.100");
            InetAddress addr3 = InetAddress.getByName("172.20.5.10");
            
            // A public address for comparison
            InetAddress publicAddr = InetAddress.getByName("8.8.8.8");

            // Check site-local status
            System.out.println(addr1 + " isSiteLocalAddress(): " 
                               + addr1.isSiteLocalAddress());
            System.out.println(addr2 + " isSiteLocalAddress(): " 
                               + addr2.isSiteLocalAddress());
            System.out.println(addr3 + " isSiteLocalAddress(): " 
                               + addr3.isSiteLocalAddress());
            System.out.println(publicAddr + " isSiteLocalAddress(): " 
                               + publicAddr.isSiteLocalAddress());

        } catch (UnknownHostException e) {
            System.err.println("Lookup failed: " + e.getMessage());
        }
    }
}

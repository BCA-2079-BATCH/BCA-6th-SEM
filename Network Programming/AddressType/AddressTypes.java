import java.net.InetAddress;

public class AddressTypes {
    public static void main(String[] args) throws Exception {
        InetAddress addr = InetAddress.getByName("192.168.1.5");

        System.out.println("Any local?       " + addr.isAnyLocalAddress());
        System.out.println("Loopback?        " + addr.isLoopbackAddress());
        System.out.println("Link-local?      " + addr.isLinkLocalAddress());
        System.out.println("Site-local?      " + addr.isSiteLocalAddress());
        System.out.println("Multicast?       " + addr.isMulticastAddress());
    }
}
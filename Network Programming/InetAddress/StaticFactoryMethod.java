import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class StaticFactoryMethod {
    public static void main(String[] args) {
        try {
            // 1. Resolve a hostname to a single address
            InetAddress single = InetAddress.getByName("example.com");
            System.out.println("getByName(\"example.com\"): " + single);

            // 2. Resolve a hostname to all associated addresses
            InetAddress[] all = InetAddress.getAllByName("google.com");
            System.out.println("getAllByName(\"google.com\"): " + Arrays.toString(all));

            // 3. Create from a raw IPv4 byte array
            byte[] loopbackBytes = {127, 0, 0, 1};
            InetAddress rawIPv4 = InetAddress.getByAddress(loopbackBytes);
            System.out.println("getByAddress(byte[]): " + rawIPv4);

            // 4. Create with custom hostname + raw bytes
            InetAddress custom = InetAddress.getByAddress("myhost.local", loopbackBytes);
            System.out.println("getByAddress(host, byte[]): " + custom);

            // 5. Local machine’s address
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("getLocalHost(): " + local);

            // 6. Loopback shortcut
            InetAddress loop = InetAddress.getLoopbackAddress();
            System.out.println("getLoopbackAddress(): " + loop);

        } catch (UnknownHostException e) {
            System.err.println("Hostname lookup failed: " + e.getMessage());
        }
    }
}

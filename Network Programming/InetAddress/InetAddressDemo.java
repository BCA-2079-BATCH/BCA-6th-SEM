import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) {
        try {
            InetAddress inet = InetAddress.getByName("www.facebook.com");

            System.out.println("Host Name: " + inet.getHostName());
            System.out.println("Canonical Host Name: " + inet.getCanonicalHostName());
            System.out.println("Host Address: " + inet.getHostAddress());
            System.out.println(inet.getAddress().length);

            byte[] addressBytes = inet.getAddress();
            System.out.print("Raw IP Address (byte format): ");
            for (byte b : addressBytes) {
                System.out.print((b & 0xFF) + ".");
            }

            //Address Type

            System.out.println(); // for newline

        } catch (UnknownHostException UE) {
            throw new RuntimeException("Exception: Unable to resolve host", UE);
        }
    }
}
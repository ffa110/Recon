import java.net.NetworkInterface;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class main {



    public static void main(String[] args)
    {
        System.out.println("Host IP Number: " + getIP());

    }

    public static String getIP() {

        // String to store ip number
        String getIP = "";

        // capture ip number
        InetAddress ip;
        try {
            // get local host
            ip = InetAddress.getLocalHost();
            // store ip number in "getIP" String
            getIP = ip.getHostAddress().toString();
        } catch(UnknownHostException e) {
            e.printStackTrace();
        }

        // return the ip number as the value of the method
        return getIP;

    }
    
}

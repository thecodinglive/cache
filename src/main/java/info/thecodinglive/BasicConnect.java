package info.thecodinglive;

import net.spy.memcached.AddrUtil;
import net.spy.memcached.BinaryConnectionFactory;
import net.spy.memcached.MemcachedClient;
import net.spy.memcached.MemcachedConnection;

import java.net.InetSocketAddress;

public class BasicConnect {
    public static final String  memcachedIp = "192.168.59.103";
    public static final Integer  memIp = 11211;

    public static void main(String ar[]) throws  Exception{


        MemcachedClient c=new MemcachedClient(
                new InetSocketAddress(memcachedIp , memIp));

        MemcachedConnection myconn = c.getConnection();

        System.out.println(myconn.getName() + "상태:" +  myconn.getState());

    }
}

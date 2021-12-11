import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements MyInterface {

    public Server() throws RemoteException {}

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();

        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }
    
    @Override
    public String  rev(String ch)
    {
        return new StringBuilder(ch).rev().toString();
    }
    
    @Override
    public char minChar(String ch)
    {
        char c =ch.charAt(0);
        for (int i=1; i<ch.length(); i++)
        {
            if(ch.charAt(i) < c)
            {
                c=ch.charAt(i);
            }
        }
        return c;
    }
    
    @Override
    public String uppLow(String ch)
    {
        StringBuilder rt = new StringBuilder();
        for (int i=0; i<ch.length(); i++)
        {
            if(ch.charAt(i)>='a' && ch.charAt(i)<='z')
            {
                rt.append((char)(ch.charAt(i)-32));
            }
            else if(ch.charAt(i)>='A' && ch.charAt(i)<='Z')
            {
                rt.append((char)(ch.charAt(i)+32));
            }
            else
            {
               rt.append(s.charAt(i));
            }
        }
        return rt.toString();
    }
}

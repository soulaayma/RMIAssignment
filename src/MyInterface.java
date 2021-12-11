import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {
  public String rev(String ch) throws RemoteException;
    public char minChar(String ch) throws RemoteException;
    public String uppLow(String ch) throws RemoteException;

}

import java.rmi.Naming;

public class Client {

    public static void main(String[] args) {
        try {
           MyInterface service = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
           Scanner s = new Scanner(System.in);
           String ch = s.nextLine();
           System.out.println(service.rev(ch));
           ch= s.nextLine();
           System.out.println(service.minChar(ch));
           ch= scanner.nextLine();
           System.out.println(service.uppLow(ch));
           scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

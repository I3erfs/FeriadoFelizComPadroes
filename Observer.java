import java.util.*;
interface Observer { void update(String msg); }
class Cliente implements Observer {
    public void update(String msg) { System.out.println("Notificação para Cliente: " + msg); }
}

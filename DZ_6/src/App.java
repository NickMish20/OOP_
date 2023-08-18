import Class.Order;
import Class.OrderConsoleInput;
import Class.OrderWriter;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите заказ:");
        
        Order order = new Order();
        OrderConsoleInput input = new OrderConsoleInput();
        input.inputFromConsole(order);
        
        OrderWriter writer = new OrderWriter();
        writer.saveToJson(order);
    }
}

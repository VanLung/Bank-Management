
import java.util.ArrayList;

/**
 *
 * @author
 */
public class Main {

    public static void main(String[] args) {
        Validation validation = new Validation();
        Bank bank = new Bank();
        int choice;
        do {
            Menu.printMainMenu();
            choice = validation.getInteger(1, 5);
            //check giá trị đầu vào của mainMenu
            switch (choice) {
                case 1:
//                    addVIP();
                    break;
                case 2:
//                    addBussiness();
                    break;
                case 3:
//                    showVIP();
                    break;
                case 4:
//                    showBussiness();
                    break;
                default:
                    break;
            }
        } while (choice >= 1 && choice <= 5);
    }

}

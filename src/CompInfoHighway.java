import java.util.Scanner;

public class CompInfoHighway extends Main {
    public CompInfoHighway(String name, String value, String number) {
        super(name, value, number);
    }

    static CompInfoHighway[] list = new CompInfoHighway[25]; //выносим массив за границы метода fail, чтобы увеличить его область видимости, чтобы он был доступен в методе saveContact
    static int idContact = 10; //индекс следующего элемента массива

    public static void fail() {
        //убрали отсюда массив list
        list[0] = new CompInfoHighway("Слава", "Важный", "89999999999");
        list[1] = new CompInfoHighway("Слава", "Важный", "89999999999");
        list[2] = new CompInfoHighway("Слава", "Важный", "89999999999");
        list[3] = new CompInfoHighway("Слава", "Важный", "89999999999");
        list[4] = new CompInfoHighway("Слава", "Важный", "89999999999");
        list[5] = new CompInfoHighway("Слава", "Важный", "89999999999");
    }

    public static void main(String[] args) {
        displayMenu();
    }

    public static void saveContact(String name, String value, String number) {
        System.out.println("Контакт сохранен:" + name + " " + value + " "  + number);
        //добавляем ССЫЛКУ на объект в массив
        list[idContact] = new CompInfoHighway(name, value, number);
        idContact++;
    }

    public static void findNumber(String Name) {
        System.out.println("");
    }

    public static void displayMenu() {
        fail(); //вызвываем метод fail чтобы заполнить list
        Scanner in = new Scanner(System.in);
        System.out.println("1. Новый контакт");
        System.out.println("2. Найти контакт");
        System.out.println("3. Удалить контакт");
        System.out.println("4  Выход");



        int choice = in.nextInt(); //выберете что хотите сделать
        in.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Введите имя человека которого хотите добавить:");
                String name = in.nextLine();
                System.out.println("Введите степень человека которого хотите добавить:");
                String value = in.nextLine();
                System.out.println("Введите номер человека которого хотите добавить:");
                String number = in.nextLine();
                saveContact(name, value, number);

                break;
            case 2:
                System.out.println("Как зовут человека, номер которого вы хотите найти?");
                name = in.nextLine();
                System.out.println();
                break;
            case 3:
                System.out.println("Как зовут человека которого вы хотите удалить?");
            default:
                break;
            case 4: // Выход
                System.exit(0);
                System.out.println("0. Выход из системы");
        }
        //вывод всех контактов
        for (int i = 0; i < idContact; i++)
            list[i].showFullName();
    }
}

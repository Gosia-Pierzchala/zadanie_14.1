import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {

        Menu[] menuList = Menu.values();

        System.out.println("Wybierz menu z poniższej listy:");
        for (int i = 0; i < menuList.length; i++) {
            System.out.println(menuList[i]);
        }

        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();

        Menu menu = null;

        do{
        for (int i = 0; i < menuList.length; i++) {
            if(userInput.equals(menuList[i].name())){
                menu = menuList[i];
                break;
            }
        }

        if(menu != null){
            System.out.println("Menu " + menu + " zostało wybrane.");
        } else {
            System.out.println("Podana opcja jest nieprawidłowa. Wybierz wartość z poniższej listy:");
            for (int j = 0; j < menuList.length; j++) {
                System.out.println(menuList[j]);
            }
            userInput = scan.nextLine();
        }
        } while (menu == null);

    }
}

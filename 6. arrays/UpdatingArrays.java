import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menu = {"Espresso", "Iced Coffee", "Macchiato"};
        // WE CANNOT CHANGE THE LENGTH OF AN ARRAY!!!
        // Updating a value in the array
        menu[2] = "Latte";
        // toString() takes an array and returns a string
        System.out.println(Arrays.toString(menu));

        String[] newMenu = new String[5];

        for (int i = 0; i < menu.length; i++) {
            newMenu[i] = menu[i];
        }

        newMenu[3] = "House Blend";
        newMenu[4] = "Dark Roast";
        System.out.println(Arrays.toString(newMenu));
    }
}
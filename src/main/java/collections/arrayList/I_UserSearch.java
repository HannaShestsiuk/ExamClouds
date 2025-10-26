/**
 * 1. Добавление и поиск элементов
 * Создай ArrayList<String> с именами пользователей.
 * Добавь 5 имён, выведи их на экран и проверь, содержится ли в списке имя "admin".
 */
package collections.arrayList;

import java.util.ArrayList;

public class I_UserSearch {
    public static void main(String[] args) {
        ArrayList<String> userNames = new ArrayList<>();

        userNames.add("Alice");
        userNames.add("Bob");
        userNames.add("Charlie");
        userNames.add("Diana");
        userNames.add("admin");

        // Print list of usernames
        System.out.println("List of users:");
        for (String name : userNames) {
            System.out.println("- " + name);
        }
        System.out.println();

        // call method with a list of users
        searchAdmin(userNames);
        System.out.println();

        userNames.remove("admin");
        System.out.println();

        searchAdmin(userNames);
    }

    static void searchAdmin(ArrayList<String> userList) {
        String searchName = "admin";
        boolean containsAdmin = userList.contains(searchName);

        System.out.println("Search for \"" + searchName + "\":");
        if (containsAdmin) {
            System.out.println("There is \"" + searchName + "\" in the list");
        } else {
            System.out.println("There is NO \"" + searchName + "\" in the list");
        }
    }
}

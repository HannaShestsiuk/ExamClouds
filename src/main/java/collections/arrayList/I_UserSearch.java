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

        String searchName = "admin";

        // Print list of usernames
        System.out.println("List of users:");
        for (String name : userNames) {
            System.out.println("- " + name);
        }
        System.out.println();

        // call method with a list of users
        searchByName(userNames, searchName);
        System.out.println();

        userNames.remove("admin");

        searchByName(userNames, searchName);
    }

    static void searchByName(ArrayList<String> userList, String searchName) {
        boolean containsSearchName = userList.contains(searchName);

        System.out.println("Search for \"" + searchName + "\":");
        if (containsSearchName) {
            System.out.println("There is \"" + searchName + "\" in the list");
        } else {
            System.out.println("There is NO \"" + searchName + "\" in the list");
        }
    }
}

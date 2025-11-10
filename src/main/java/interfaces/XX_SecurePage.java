/**
 * Интерфейс CanLogout с методом logout().
 * Создай класс SecurePage, реализующий его, и выведи "User logged out".
 */
package interfaces;

public class XX_SecurePage implements XX_CanLogout{
    @Override
    public void logout() {
        System.out.println("User logged out");
    }

    public static void main(String[] args) {
        XX_SecurePage page = new XX_SecurePage();

        page.logout();
    }
}

/**
 * Реализуй класс TokenStorage с private static String token.
 * Сделай методы setToken() и getToken().
 * Проверь, что токен общий для всех экземпляров.
 */
package staticKeyword;

public class VI_TokenStorage {
    private static String token;

    public static String getToken() {
        return token;
    }

    public static void setToken(String token) {
        VI_TokenStorage.token = token;
    }

    public static void main(String[] args){
        VI_TokenStorage token1 = new VI_TokenStorage();
        VI_TokenStorage token2 = new VI_TokenStorage();

        VI_TokenStorage.setToken("1q2w3e4r5t6y");

        System.out.println("Token#1: " + token1.getToken());
        System.out.println("Token#2: " + token2.getToken());
    }
}

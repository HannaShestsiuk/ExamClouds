/**
 * Создай BaseApi с protected String baseUrl.
 * Создай UserApi extends BaseApi и выведи baseUrl.
 * Проверь, что при private это невозможно.
 */
package accessModifiers;

public class XVI_UserApi extends XVI_BaseApi{
    public void printBaseUrl(){
        System.out.println("Base URL: " + baseUrl);
    }

    public static void main(String[] args) {
        XVI_UserApi api = new XVI_UserApi();
        api.printBaseUrl();
    }
}
/**
 * Сделай класс BasePage с protected String url.
 * Создай LoginPage extends BasePage и выведи url.
 */
package accessModifiers;

public class XI_BasePage {
    // protected is accessed:
    //      - within the current class
    //      - within inherited classes
    //      - within the current package
    protected String url = "https://page.example.com";
}

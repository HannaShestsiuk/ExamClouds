/**
 * Сделай класс BasePage с protected String url.
 * Создай LoginPage extends BasePage и выведи url.
 */
package accessModifiers;

public class XI_LoginPage extends XI_BasePage{
    public void printUrl(){
        // url is used directly, although it is not defined in XI_LoginPage,
        //      because it is inherited from XI_BasePage
        // url is protected and is accessed from inherited classes
        System.out.println("Page URL: " + url);
    }

    public static void main(String[] args){
        XI_LoginPage page1 = new XI_LoginPage();
        page1.printUrl();
    }
}

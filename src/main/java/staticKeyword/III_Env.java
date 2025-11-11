/**
 * Добавь в Env три public static final строки: QA, STAGING, PROD.
 * Выведи их все в main.
 */
package staticKeyword;

public class III_Env {
    public static final String QA = "qa";
    public static final String STAGING = "staging";
    public static final String PROD = "prod";

    public static void main(String[] args){
        System.out.println(QA);
        System.out.println(STAGING);
        System.out.println(PROD);
    }
}

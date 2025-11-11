/**
 * Создай класс TestInfo с:
 * static String buildId
 * String testName
 * Создай два теста с разными именами, но одной buildId.
 * Выведи обе строки.
 */
package staticKeyword;

public class IV_TestInfo {
    static String buildId;
    String testName;

    public IV_TestInfo(String testName, String buildId){
        this.testName = testName;
        this.buildId = buildId;
    }

    public String toString(){
        return "TestName='" + testName + "', buildId='" + buildId + "'";
    }

    public static void main(String[] args){
        String buildId = "5.1.1(2541)";
        IV_TestInfo test1 = new IV_TestInfo("User login", buildId);
        IV_TestInfo test2 = new IV_TestInfo("User logout", buildId);

        System.out.println(test1.toString());
        System.out.println(test2.toString());
    }
}

/**
 * 5. Список тест-кейсов
 * Создай ArrayList<TestCase> (где TestCase — простой класс с id, name).
 * Добавь 3 тест-кейса и выведи их в формате:
 * TC01 - Login Test
 */
package collections.arrayList;

import java.util.ArrayList;

public class V_ArrayListOutput {
    public static void main(String[] args){
        ArrayList<TestCase> testCases= new ArrayList<>();

        testCases.add(new TestCase("Login Test"));
        testCases.add(new TestCase("Create Customer"));
        testCases.add(new TestCase("Delete Customer"));

        System.out.println("Test Cases:");
        for(TestCase tc : testCases) {
            System.out.println(tc.getId() + " - " + tc.getName());
        }
    }

    //nested class storing data
    static class TestCase{
        private String id;
        private String name;
        private static int count;

        public TestCase(String name){
            TestCase.count++;
            this.id = String.format("TC%02d", count);
            this.name = name;
        }

        public String getId(){
            return id;
        }

        public String getName(){
            return name;
        }
    }
}

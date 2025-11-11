/**
 * Интерфейс HttpClient с методом String send().
 * Создай MockHttpClient, который всегда возвращает "200 OK".
 * Вызови метод.
 */
package interfaces;

public class XXI_MockHttpClient implements XXI_HttpClient{
    @Override
    public String send() {
        return "200 OK";
    }

    public static void main(String[] args) {
        XXI_MockHttpClient mockClient = new XXI_MockHttpClient();

        System.out.println(mockClient.send());
    }
}
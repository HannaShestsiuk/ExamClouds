/**
 * Интерфейс Retryable с default-методом retry(int times)
 * (печатает "retry N").
 * Создай класс ApiCall implements Retryable и вызови retry(3).
 */
package interfaces;

public class XXII_ApiCall implements XXII_Retryable{
    public static void main(String[] args) {
        XXII_ApiCall apiCall = new XXII_ApiCall();
        apiCall.retry(3);
    }
}

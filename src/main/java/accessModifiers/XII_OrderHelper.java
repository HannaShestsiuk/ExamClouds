/**
 * Напиши класс OrderHelper с методом без модификатора printOrderId().
 * Создай другой класс в том же пакете — метод должен быть виден.
 * Создай класс в другом пакете — метод не виден.
 */
package accessModifiers;

public class XII_OrderHelper {
    // no access modifiers, default is 'package-private'
    void printOrderId() {
        System.out.println("Order: My Order");
    }
}

package interfaces;

public interface XXII_Retryable {
    default void retry(int times){
        System.out.println("retry " + times);
    };
}
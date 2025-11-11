package interfaces;

public class XXV_CardInfo implements XXV_SensitiveData{
    private String cardNumber;

    public XXV_CardInfo(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}

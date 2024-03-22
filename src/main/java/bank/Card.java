package bank;

public class Card {
    private final String CARD_NUMBER;

    private String pinCode;

    public Card() {
       this.CARD_NUMBER = generateCardNumber();
       this.pinCode = generatePinCode();
    }

    private String generateCardNumber() {
        StringBuilder builder = new StringBuilder();
        for (int a = 0; a<16; a++){
            builder.append(rnd(0,9));
        }
        return builder.toString();
    }

    private String generatePinCode() {
        StringBuilder builder = new StringBuilder();
        for (int a = 0; a<4; a++){
            builder.append(rnd(0,9));
        }
        return builder.toString();
    }

    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public String getCARD_NUMBER() {

        return CARD_NUMBER;
    }

    public String getPinCode() {

        return pinCode;
    }

    public void setPinCode(String pinCode) {

        this.pinCode = pinCode;
    }
}

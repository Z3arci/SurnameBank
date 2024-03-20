package bank;

public class Card {
    private final long CARD_NUMBER;

    private int pinCode;

    public Card(long CARD_NUMBER) {
        this.CARD_NUMBER = CARD_NUMBER;
        generateCardNumber();
        generatePinCode();
    }

    private void generateCardNumber() {
        StringBuilder generateCardNumber = new StringBuilder();
        for (int a = 0; a<16; a++){
            generateCardNumber.append(rnd(0,9));
        }
    }

    private void generatePinCode() {
        StringBuilder generatingPin = new StringBuilder();
        for (int a = 0; a<4; a++){
            generatingPin.append(rnd(0,9));
        }
        pinCode = Integer.parseInt(generatingPin.toString());
    }

    public long getCARD_NUMBER() {
        return CARD_NUMBER;
    }

    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }


    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
}

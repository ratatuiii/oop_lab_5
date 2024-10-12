package ua.ucu.edu;

public enum FlowerColor {
    RED("#FF0000"),
    YELLOW("#FFFF00"),
    WHITE("#FFFFFF"),
    PINK("#FFC0CB"),
    BLUE("#0000FF"),
    ORANGE("#FFA500"),
    PURPLE("#800080"),
    UNKNOWN("#000000");

    private final String hexCode;


    FlowerColor(String hexCode) {
        this.hexCode = hexCode;
    }


    public String getHexCode() {
        return hexCode;
    }
}
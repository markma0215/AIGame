package Constants;

public enum Color {

    RED(ColorString.red),
    GREEN(ColorString.green),
    BLACK,
    WHITE;

    private String color;
    private static final String ANSI_RESET = "\u001B[0m";

    Color(String color){
        this.color = color + "T" + ANSI_RESET;
    }

    Color(){}
}

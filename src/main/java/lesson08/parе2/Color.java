package lesson08.parе2;

public enum Color {
    BLACK("черный"),WHITE("белый"),GREY("серый");

    public String getRussianColor() {
        return russianColor;
    }

    public void setRussianColor(String russianColor) {
        this.russianColor = russianColor;
    }

    private String russianColor;

    Color(String russianColor) {
        this.russianColor = russianColor;
    }

}

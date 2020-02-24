class ResistorColor {
    private String[] elements = {
            "black","brown","red","orange","yellow","green","blue","violet", "grey","white"};
    int colorCode(String color) {
        int index=0;
        for (int i = 0; i <= this.elements.length; i++) {
            if (this.elements[i].equals(color)) {
                index = i;
                break;
            }
        }
        return index;
    }

    String[] colors() {
        return elements;
    }
}

class copycons{
    int length;
    int width;

    copycons() {
        length = 5;
        width = 5;
    }

    copycons(int l, int w) {
        length = l;
        width = w;
    }

    void area() {
        System.out.println("Area = " + (length * width));
    }

    public static void main(String[] args) {
        copycons r1 = new  copycons();
        copycons r2 = new  copycons(10, 4);

        r1.area();
        r2.area();
    }
}
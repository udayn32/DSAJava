class array {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40};

        int s = 0;
        for (int i = 0; i < 4; i++) {
            s = s + a[i];
        }


        System.out.println("sum=" + s);



    }
}
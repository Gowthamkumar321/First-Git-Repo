class Demo {
    public static void main(String a[]) {
        int j = 5; // local variable must be initialized
        System.out.println(j);
        System.out.println("hecking");
        String str = "hello how are you puja";
        boolean str1 = str.endsWith("ja");
        System.out.println(str1);
        String[] array = str.split(" "); // split a string into an array of substrings based on a specified delimiter.
        for (String st : array) {
            if (st.length() % 2 == 0) {
                System.out.println(st);// Set breakpoints in your code, run your program in debug mode, and then step
                                       // through the code line by line.
            }
            ;
        }
    }

}
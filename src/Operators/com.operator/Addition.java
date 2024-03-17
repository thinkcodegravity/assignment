public class Addition {

    public int add(int x, int y, int z)
    {
       int Total = x+y+z;
       return Total;
    }
    public static void main(String[] args) {
        Addition addition = new Addition();
        int result = addition.add(10, 20, 30);
        System.out.println("Sum is: " + result);
     }

}

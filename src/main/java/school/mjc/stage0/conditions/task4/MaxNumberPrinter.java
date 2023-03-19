package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public static void main(String[] args) {
        MaxNumberPrinter g = new MaxNumberPrinter();
        g.printGreatest(1, 4, 10);
    }
    
    public void printGreatest(int first, int second, int third) {
        int max = first > second ? (first > third ? first : third) : (second > third ? second : third);
        System.out.println(max);
    }
}

package ch06.sec08.exam02;

public class Computer {
    public int sum(int x, int y, int z) {
        return x + y + z;
    }
    public int sum(int x, int y, int z, int r, int k) {
        return x + y + z + r + k;
    }
    public int sum(int[] values) {
        int sum = 0;
        for (int x : values) {
            sum += x;
        }
        return sum;
    }
}

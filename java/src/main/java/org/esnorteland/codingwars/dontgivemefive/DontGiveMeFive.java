package org.esnorteland.codingwars.dontgivemefive;

public class DontGiveMeFive {
    public static int dontGiveMeFive(int start, int end)
    {
        int count = 0;
        for (int c = start; c <= end; c++) {
            String s = String.valueOf(c);
            if (!s.contains("5")) {
                count++;
            }
        }
        return count;
    }
}

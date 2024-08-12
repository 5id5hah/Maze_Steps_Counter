# 🧩 Maze Path Counter

This Java program calculates the number of possible paths from the top-left to the bottom-right corner of a maze using a recursive approach.

## 🚀 How It Works

The program finds all possible paths in a maze using the following logic:

```java
public class Maze {
    public static void main(String[] args) {
        System.out.println("🛤️ Number of ways are: " + Count(3, 3));
    }

    static int Count(int r, int c) {
        if (r == 1 || c == 1) { // 🛑 Base case: Only 1 path if at the edge
            return 1;
        }
        int left = Count(r - 1, c); // 🔄 Move left
        int right = Count(r, c - 1); // 🔄 Move right
        return left + right; // ➕ Sum the paths
    }
}

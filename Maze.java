public class Maze {
    public static void main(String[] args) {
        System.out.println("Number of ways are:"+Count(3,3) );
    }
    static int Count(int r, int c){
        if (r == 1 || c == 1){
            return 1;
        }
        int left = Count(r-1, c);
        int right = Count(r, c-1);
        int ans = left + right;
        return ans;
    }
}

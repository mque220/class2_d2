import java.io.*;

public class binomialCoefficient {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//그냥 입출력함수

        String[] arr = bf.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int K = Integer.parseInt(arr[1]);
        int result = factorial(N) / (factorial(K) * factorial(N - K));

        bw.write(Integer.toString(result) + "\n");
        bw.flush();
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        else
            return n * factorial(n - 1);
    }
}

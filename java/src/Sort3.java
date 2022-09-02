import java.io.*;

public class Sort3 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        int nums = Integer.parseInt(bf.readLine()); 

        int[] sort_arr = new int[10000000];
        for (int i = 0; i < nums; i++) {
            sort_arr[Integer.parseInt(bf.readLine())]++;
        }

        for (int i = 1; i <= 10000000; i++) {
            if (sort_arr[i] == 0);
            else if (sort_arr[i] != 1) {
				bw.write(Integer.toString(i) + "\n");
                sort_arr[i]--;
                i--;
            } else bw.write(Integer.toString(i) + "\n");
        }
		bw.flush();
    }
}

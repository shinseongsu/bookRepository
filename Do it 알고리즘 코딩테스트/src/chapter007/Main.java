package chapter007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());    // 배열 수
        int M = Integer.parseInt(bf.readLine());    // 목표 수
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0 ; i < N ; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        int count = 0;
        int first = 0;
        int last = N-1;

        while( first < last ) {
            if(A[first] + A[last] < M) {
                first++;
            } else if(A[first] + A[last] > M) {
                 last--;
            } else {
                count++;
                first++;
                last--;
            }
        }
        System.out.println(count);

        bf.close();
    }

}

package Algo_question;

import java.util.*;
import java.io.*;

public class gchick {
    static int N,M,mintotalMinDistance;
    static int[][] grid;
    static List<int[]> ones,twos,twos1;
    static void comb(int cnt, int start){
        if(cnt == M){
            int totalMinDistance = 0;
            // 골라진 치킨집과 가정집 사이의 거리 구하기
            for (int[] one : ones) {
                int minDistance = Integer.MAX_VALUE;
                for (int[] two1 : twos1) {
                    int distance = Math.abs(one[0] - two1[0]) + Math.abs(one[1] - two1[1]);
                    if (distance < minDistance) {
                        minDistance = distance;
                    }
                }
                totalMinDistance += minDistance;
            }
            mintotalMinDistance= Math.min(mintotalMinDistance, totalMinDistance);
            return;
        }
        for(int i = start; i<twos.size(); i++){
            twos1.add(twos.get(i));
            comb(cnt+1,i+1);
            twos1.remove(twos1.size()-1);
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        grid = new int[N][N];
        mintotalMinDistance = Integer.MAX_VALUE;

        for (int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<N; j++){
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        ones = new ArrayList<>();
        twos = new ArrayList<>();
        twos1 = new ArrayList<>();

        // 배열에서 1과 2의 위치를 찾기
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    ones.add(new int[]{i, j});
                } else if (grid[i][j] == 2) {
                    twos.add(new int[]{i, j});
                }
            }
        }
        comb(0,0);
        System.out.println(mintotalMinDistance);
    }
}

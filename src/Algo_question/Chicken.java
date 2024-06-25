package Algo_question;
import java.util.*;
import java.io.*;

public class Chicken {
    static int N,M;
    static int[][]S;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static boolean[][] v;
    static int cnt;
    static int sum = 0;

    static void chicken(){
        for (int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                if((S[i][j] == 1)){
                    find(i,j);
                    sum += cnt;
                }
            }
        }
    }
    static void find(int x, int y){
        cnt = 0;
        v = new boolean[N][N];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x,y});
        v[x][y] = true;
        while(!queue.isEmpty()){
            int now[] = queue.poll();
            cnt++;
            if(S[now[0]][now[1]] == 2)
                return;
            for(int i = 0; i < 4; i++){
                int nx = now[0]+dx[i];
                int ny = now[1]+dy[i];
                if(nx>=0&&ny>=0&&nx<N&&ny<M){
                    if(!v[nx][ny]){
                        v[nx][ny] = true;
                        queue.add(new int[] {nx,ny});
                    }
                }
            }
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        v = new boolean[N][N];
        S = new int[N][N];
        cnt = 0;

        for (int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<N; j++){
                S[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        chicken();

        System.out.println(sum);
        System.out.println(cnt);

        br.close();
    }
}

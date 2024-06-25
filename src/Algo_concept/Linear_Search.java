package Algo_concept;

public class Linear_Search {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int q = 10;
        boolean b = false;

        for(int i:arr){
            if (i == q){
                System.out.println("찾았습니다.");
                b = true;
            }
        }
        if (!b)
            System.out.println("못찾았습니다.");
    }
}

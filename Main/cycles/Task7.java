package cycles;

public class Task7 {
    public static void main(String[] args) {
        int M = 1;
        int N = 1000;
        for(int i = M;i <= N;i++){
            System.out.print("for "+i+": ");
            for(int j = 2;j <= i/2;j++){
                if(i%j == 0){
                    System.out.print(j+" ");
                }
            }
            System.out.println("\n");
        }
    }
}

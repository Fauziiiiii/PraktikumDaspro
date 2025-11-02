package jobsheet8;

public class Tugas1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            int jumlahKuadrat = 0;
            System.out.print("n = " + i + " -> jumlah kuadrat = ");

            for(int j = 1; j <= i; j++){
                int kuadrat = j * j;
                jumlahKuadrat += kuadrat;

                System.out.print(kuadrat);

                if(j < i){
                    System.out.print(" + ");
                }
            }

            if(i > 1){
                System.out.println(" = " + jumlahKuadrat);
            }else{
                System.out.println();
            }
        }
    }
}

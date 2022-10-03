package dayfive;

public class BilanganGenap {
    void deret(int awal, int akhir){
        for (int i = awal;i<akhir;i++){
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
        }
    }
}


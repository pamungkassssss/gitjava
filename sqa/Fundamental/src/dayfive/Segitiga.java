package dayfive;

public class Segitiga {
    public void draw(int sisi){
        for (int i = 0; i < sisi+1; i++){
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

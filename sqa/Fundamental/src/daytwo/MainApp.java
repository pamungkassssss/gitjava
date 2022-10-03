package daytwo;

public class MainApp {

    int x = 5;

    public static void main(String[] args) {
        int x = 10;
        System.out.println("Hello world!");
        MainApp mainApp = new MainApp();
        mainApp.nameMethod();
    }

    void nameMethod() {
        int y = this.x;
        System.out.println(y);
    }
}
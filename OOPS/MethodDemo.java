package OOPS;

class Computers {

    public void playMusic() {
        System.out.println("Playing music");
    }

    public String purchasePen(int cost) {

        if (cost >= 10) {
            return "Pen";
        }

        return "Nothing";
    }
}

public class MethodDemo {
    public static void main(String[] args) {

        Computers sComputers = new Computers();
        sComputers.playMusic();
        String pensData = sComputers.purchasePen(10);
        System.out.println(pensData);
    }
}

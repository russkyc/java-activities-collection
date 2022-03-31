package camo.russtools;

public class Print {

    public void delayPrint(String newText, int delay){
        try {
            Thread.sleep(delay);
            System.out.printf("%s",newText);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void delayPrintLine(String newText, int delay){
        try {
            Thread.sleep(delay);
            System.out.printf("\n%s\n",newText);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void delayReplace(String newText, int delay){
        try {
            Thread.sleep(delay);
            System.out.printf("\r%s",newText);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void delayReplace(String oldText, String newText, int delay){
        try {
            System.out.printf("\r%s",oldText);
            Thread.sleep(delay);
            System.out.printf("\r%s",newText);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

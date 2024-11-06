public class PrintingStringThread extends Thread {
    private String str;

    public PrintingStringThread(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        System.out.println(str);
    }
}

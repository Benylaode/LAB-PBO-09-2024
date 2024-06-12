package no1;

class UiThread extends Thread {
    private boolean yes = true;
    public static int jumlah;

    @Override
    public void run() {
        while (yes) {
            try {
                jumlah++;
                Thread.sleep(1000);
                System.out.println(String.format("Loading... (%ds)", jumlah));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopProgram(){
        yes = false;
    }

}
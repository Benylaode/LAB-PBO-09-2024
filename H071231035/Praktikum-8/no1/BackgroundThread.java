package no1;

class BackgroundThread extends Thread {

    public void run() {
        int waktuEksesuki = TaskTimeHelper.getTaskExecutionTime();
        if (waktuEksesuki < 5) {
            try {
                Thread.sleep(waktuEksesuki * 1000);
                Mainn.dataBerhasil();
                System.out.println("sukses");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Request Timeout");
        }

    }
}

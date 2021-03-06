package music.hayasi.android.com.mymusic.module.model.GuradedSuspension;

import music.hayasi.android.com.mymusic.module.model.GuradedSuspension.entity.FutureData;

public class ClientThread extends Thread {

    private RequestQueue requestQueue;

    public ClientThread(RequestQueue rq, String name) {
        super(name);
        requestQueue = rq;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            Request request = new Request("RequestID:" + i + "Thread_Name:" + Thread.currentThread().getName());
            FutureData data = new FutureData();
            request.setData(data);
            requestQueue.addRequest(request);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
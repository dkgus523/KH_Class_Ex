package prac01;

import java.io.*;
import java.net.Socket;

public class RequestHandlingTask implements Runnable {

    private final Socket socket;

    public RequestHandlingTask(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (
                final InputStream in = socket.getInputStream();     // from client
                final OutputStream out = socket.getOutputStream();  // to client
        ) {
            // input
            final BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String readLine;
            while (!(readLine = br.readLine()).equals("")) {
                System.out.println(readLine);
            }

            // output
            final String body = "�ѱ����� �ſ�?";
            final byte[] raw = body.getBytes();
            final DataOutputStream dos = new DataOutputStream(out);
            // ��� ���� �κ�
            dos.writeBytes("HTTP/1.1 200 OK \r\n");
            dos.writeBytes("Content-Type: text/html;charset=utf-8\r\n");
            dos.writeBytes("Content-Length: " + raw.length + "\r\n");
            dos.writeBytes("\r\n");
            // �ٵ� ���� �κ�
            dos.write(raw, 0, raw.length);
            dos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

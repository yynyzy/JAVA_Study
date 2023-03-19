package socket_.SocketFileUpload;

import java.io.*;

public class UtilTool {
    public static byte[] StreamToByteArray(InputStream is) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] bf = new byte[1024];
        int readLen = 0;
        while((readLen = is.read(bf))!=-1){
            bos.write(bf, 0, readLen);
        }
        byte[] arr =  bos.toByteArray();
        bos.close();
        return arr;
    }

    public static String StreamToString(InputStream is) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        String line = "";
        while((line = bufferedReader.readLine())!=null){
            sb.append(line+"\r\n");
        }
//        bufferedReader.close();
        return sb.toString();
    }
}

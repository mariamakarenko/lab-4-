import java.io.*;

public class FileManager {
    public void copy_l(String src, String dst) throws IOException {
        InputStream is = null;
        OutputStream os = null;

        final int size4Mb = 4 * 1024 * 1024;
        long startTime = System.currentTimeMillis();
        try {
            is = new FileInputStream(src);
            os = new FileOutputStream(dst);
            byte[] buffer = new byte [size4Mb];
            int length;
            while ((length = is.read(buffer)) >= 0){
                os.write(buffer,  0, length);
            }
        }
        finally{
            is.close();
            os.close();
        }

        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("программа выполнялась за " + timeSpent + " миллисекунд");
    }
}

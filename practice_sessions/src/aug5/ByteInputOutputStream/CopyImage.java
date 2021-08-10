package aug5.ByteInputOutputStream;

import java.io.*;

public class CopyImage {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("/home/lala/Documents/revature/my_practice/practice_sessions/src/aug5/ByteInputOutputStream/img/image.jpg");
            //BufferedInputStream bin = new BufferedInputStream(fin);
            FileOutputStream fout = new FileOutputStream("/home/lala/Documents/revature/my_practice/practice_sessions/src/aug5/ByteInputOutputStream/img/copyImg.jpg");
            //BufferedOutputStream bout = new BufferedOutputStream(fout);

            int byteInt = fin.read();
            while (byteInt != -1) {
                System.out.print((char) byteInt); //Console Print
                fout.write(byteInt); // File Writing
                byteInt = fin.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package aug6.main.java.ByteInputOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ByteCodeToBusObject {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("/home/lala/Documents/revature/my_practice/practice_sessions/src/aug6/main/java/ByteInputOutputStream/byteCodeOutput/BusObjectByteCode.ser");
            ObjectInputStream os = new ObjectInputStream(fin);

            List<Bus> buses = (ArrayList<Bus>) os.readObject();
            buses.forEach(System.out::println);
            os.close();
            fin.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

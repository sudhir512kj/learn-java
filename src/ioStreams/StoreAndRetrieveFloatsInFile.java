package ioStreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StoreAndRetrieveFloatsInFile {
    public static void main(String[] args) throws Exception {
        float []list = {1.2f, 3.45f, 6.78f, 9.01f, 2.34f};

        FileOutputStream fos = new FileOutputStream("src/ioStreams/List.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(list.length);
        for (float f : list) {
            dos.writeFloat(f);
        }

        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("src/ioStreams/List.txt");
        DataInputStream dis = new DataInputStream(fis);

        int length = dis.readInt();
        float data;

        for (int i=0; i < length; i++) {
            data = dis.readFloat();
            System.out.println(data);
        }

        dis.close();
        fis.close();
    }
}

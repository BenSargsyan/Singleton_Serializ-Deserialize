import java.io.*;

public class SingletonService {
    public static void singletonSerialize(Computer instance) {
        ObjectOutput out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("file.txt"));
            out.writeObject(instance);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static Computer derserialize(String path) {
        Computer c=null;
        try {
            ObjectInput in = new ObjectInputStream(new FileInputStream("file.txt"));
           c= (Computer) in.readObject();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c;
    }
}
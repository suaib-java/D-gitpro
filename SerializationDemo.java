import java.io.*;
class SerializationDemo implements Serializable{
    int rollNo = 10;
   public static void main(String[] args)throws FileNotFoundException,IOException,ClassNotFoundException{
     SerializationDemo  s1 = new SerializationDemo();
    
   FileOutputStream fos = new FileOutputStream("mydata.txt");
   ObjectOutputStream oos = new ObjectOutputStream(fos);
           oos.writeObject(s1);

   FileInputStream fis = new FileInputStream("mydata.txt");
   ObjectInputStream ois = new ObjectInputStream(fis);
           Object obj = ois.readObject();
          SerializationDemo s2 = (SerializationDemo)obj;
        System.out.println(s2.rollNo);
  }
}
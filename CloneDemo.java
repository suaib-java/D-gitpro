class CloneDemo implements Cloneable{
     int x = 20;
    
   public static void main(String[] args)throws CloneNotSupportedException {
          
           CloneDemo d1 = new CloneDemo();
          //   CloneDemo d2 =(CloneDemo)d1.clone();
            Object obj = d1.clone();
          CloneDemo d2 = (CloneDemo) obj;
             System.out.println(d1.x);
    }

}
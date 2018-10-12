public class TestThread {

   public static void main(String args[]) {
      RunnableDemo R1 = new RunnableDemo( "1st Thread");
      R1.start();
      
      RunnableDemo R2 = new RunnableDemo( "2nd Thread");
      R2.start();

      RunnableDemo R3 = new RunnableDemo( "3rd Thread");
      R3.start();
   }   
}
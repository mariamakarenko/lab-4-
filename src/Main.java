
public class Main {

    public static void main(String[] args) {

        final String src = "D:\\1.jpg";
        FileManager fileManager = null;
        try {
            fileManager = new FileManager();
            long start = System.nanoTime();
            fileManager.copy_l(src, "D:\\1_copy.jpg");
            System.out.println(System.nanoTime() - start);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
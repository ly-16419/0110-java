import java.io.File;

public class Catalog {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\ly\\Desktop\\乱七八糟");
        m1(file);
    }
    public static void m1(File file){
        if (file.isDirectory()){
            File[] files=file.listFiles();//获取file下是所有文件，包括文件夹等
            for (File f:files){
                m1(f);
            }
        }else {
            System.out.println(file.getName());
        }
    }
}

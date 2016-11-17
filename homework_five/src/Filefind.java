import java.io.*;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/11/16.
 */
public class Filefind {
    File myfile = new File("01901501.txt");
    String name = myfile.getName();
    long length = myfile.length();
    boolean hidden = myfile.isHidden();
//    public void find_first(){
//        System.out.println(name+length+hidden);
//    }
    public void find_second(){
       // File file2 = new File("aaa.txt");
        String content[] = {"万志远 ","孙念红","范玮旻","何缘","Andy","Ivy","Philip","杨子健","2015210347","111111","222222"};
        File file = new File("bbb.txt");
        try{
            FileWriter fw = new FileWriter(file);
            BufferedWriter bufw = new BufferedWriter(fw);
            for (int k=0;k<content.length;k++){
                bufw.write(content[k]);
                bufw.newLine();
            }
            bufw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("欢迎使用这个很low的软件\n现在，请输入你想找的内容！");
        Scanner user_want = new Scanner(System.in);
        String user_want1 = user_want.next();

        try{
            FileReader fr = new FileReader(file);
            BufferedReader bufr = new BufferedReader(fr);
            String s = null;
           // String me = "杨子健";
            int i = 0;
            while ((s = bufr.readLine())!= null){
                i++;
               // System.out.println("第"+i+"行： "+s);
                if (s.equals(user_want1)){
                    System.out.println("找到了！\n"+"第"+i+"行： "+s);
                }
            }
            bufr.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
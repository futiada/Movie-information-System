package 电影信息系统;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Movie[] movies = new Movie[2];
        //赋值
        movies[0]=new Movie("电影1",100,101);
        movies[1]=new Movie("电影2",200,102);
        //取值
        System.out.println("电影有\n"+movies[0].getName()+"编号"+movies[0].getId()+
                                "\n"+movies[1].getName()+"编号"+movies[1].getId());
        //处理类
        System.out.println("请输入电影编号查询电影");
        Scanner sc =new Scanner(System.in);
        int id=sc.nextInt();
        Ask ask =new Ask(movies,id);
        ask.s();
    }
}

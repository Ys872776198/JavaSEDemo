package day;

import dayclass.MovieMsg;
import dayclass.Movies;

import java.util.Scanner;

/**
 * @Auther: YS
 * @Date: 2023/12/10 16:38
 * @Description: IntelliJ IDEA
 * @Version: 1.0
 */
public class day2 {
    public static void main(String[] args) {
        //创建电影对象
        Movies m1 = new Movies(1, "头号玩家", 122.11);
        Movies m2 = new Movies(2, "流浪地球", 232.23);
        Movies m3 = new Movies(3, "让子弹飞", 454.23);
        
        Movies[] movies = {m1, m2, m3};

        //创造电影信息对象
        MovieMsg mm = new MovieMsg(movies);

        //显示电脑信息
        mm.printMovies();

        //搜索电影
        System.out.println("请输入电影id:");
        int i = new Scanner(System.in).nextInt();

        mm.searchMovie(i);






    }
}

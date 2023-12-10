package dayclass;

/**
 * @Auther: YS
 * @Date: 2023/12/10 17:00
 * @Description: IntelliJ IDEA
 * @Version: 1.0
 */
public class MovieMsg {
    //创建电影对象
    private Movies[] movies;

    public Movies[] getMovies() {
        return movies;
    }

    public void setMovies(Movies[] movies) {
        this.movies = movies;
    }

    //空构造
    public MovieMsg(){};

    //有参构造
    public MovieMsg(Movies[] movies){
        this.movies = movies;
    }

    //输出电影信息
    public void printMovies(){
        for(int i = 0; i < movies.length; i++){
            System.out.println("电影名：" + movies[i].getName() + "\t" + "电影价格：" + movies[i].getPrice());
        }
    }

    //选择电影
    public void searchMovie(int a){
        for (int i = 0; i < movies.length; i++){
            if (a == movies[i].getId()){
                System.out.println("电影名：" + movies[i].getName() + "\t" + "电影价格：" + movies[i].getPrice());
                break;
            }else{
//               no thing
            }
        }
    }


}

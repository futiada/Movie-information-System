package 电影信息系统;

public class Ask {
   Movie[] movies=new Movie[2];
   public Ask(Movie[] movies,int id) {
       this.movies=movies;
       this.id=id;
   }
   private int id;
   public void s(){
       for (int i = 0; i < movies.length ; i++) {
           Movie m=movies[i];
           if (id==m.getId()){
           switch (id){
               case 101: System.out.println("名称"+m.getName()+"\n价格"+m.getPrice());break;
               case 102: System.out.println("名称"+m.getName()+"价格"+m.getPrice());break;
       }}else{
             break;
           }

        /*if(id>100){
            System.out.println(movie.getName()+movie.getPrice());
        }else{
            System.out.printf("请重新输入");
        }*/
    }
}
}
/*System.out.println("电影"+movie1.getName()+"编号为"+movie1.getId()+"价格为"+movie1.getPrice());
        System.out.println("电影"+movie2.getName()+"编号为"+movie2.getId()+"价格为"+movie2.getPrice());*/
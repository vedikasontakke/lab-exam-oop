class VideoTape{

    String title;
    int length;
    boolean avaialbe;

    void set(String title , int length , boolean avaialbe)
    {
        this.title = title;
        this.length = length;
        this.avaialbe = avaialbe;
    }

    void show()
    {
       System.out.println("Tittle is : "+ this.title);
       System.out.println("Length is : "+ this.length);
       System.out.println("Availbe is : "+ this.avaialbe);

    }
}

class Movie extends VideoTape{

    String Director;
    int rating;

    void set(String Director , int rating)
    {
        this.Director = Director;
        this.rating = rating;
    }

    void show()
    {
        // super.show();

         System.out.println("Director is : "+ this.Director);
         System.out.println("rating is : "+ this.rating);
    }
}

class MusicVideo extends VideoTape{

    String artist , Category;

    void set(String artist , String Category)
    {
        this.artist = artist;
        this.Category = Category;
    }

    void show()
    {
       // super.show();

        System.out.println("Artist is : "+ this.artist);
        System.out.println("Category is : "+ this.Category);
    }

}

public class HirachalInheritance {
    public static void main(String args[])
    {
       VideoTape videoTape = new VideoTape();
       videoTape.set("Hello World", 5, true);
       videoTape.show();

       Movie movie = new Movie();
       movie.set("Ajay", 5);
       movie.show();

       MusicVideo musicVideo = new MusicVideo();
       musicVideo.set("Atul", "Comedy");
       musicVideo.show();
    }
}

package oopProject;

public class Book implements Product{
    private double price;
    private String name;
    private String author;
    private int id;
    private String description;
    private  int creationYear;
    //private boolean isAvailable;

    public void bookSearch(double price, String name , String author , int id,int creationYear ){
        this.price = price;
        this.name = name;
        this.author = author;
        this.id = id;
        this.creationYear = creationYear ;
        //  this.isAvailable = available;

        if(creationYear >= 1998)
        {
            System.out.println("Book price is " + bookPrice() + ", name is " + bookName() + ", author is " +
                    bookAuthor() + " and id is " + bookID()+" book creation year is: "+bookCreationYear());
        }
        else
        {
            System.out.println("Books before 1998 are not available.");
        }
    }

    @Override
    public double bookPrice() {
        return price;
    }

    @Override
    public String bookName() {
        return name;
    }

    @Override
    public int bookID() {
        return id;
    }

    @Override
    public String bookAuthor() {
        return author;
    }


    @Override
    public int bookCreationYear() {
        return creationYear;
    }

//    @Override
//    public boolean isAvailable() {
//        return false;
//    }

    public String bookDescription()
    {
        return description;
    }
}

package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: pramod
 * Date: 16/7/12
 * Time: 9:01 AM
 * The library class has repositories of all the books,
 */
public class Library {

    ArrayList<Book> bookList;
    ArrayList<Customer> userList;
    ArrayList<Movie> movieList;
    MainMenu manageMenu;

    public static  final String LibraryNumberSeriesInitial;

    static {
        LibraryNumberSeriesInitial = "111-1111";
    }

    Library()
    {
       bookList = new ArrayList<Book>();
       userList = new ArrayList<Customer>();
       movieList = new ArrayList<Movie>();
        createBookList();
        createMoviesList();
        createUserList();

    }

    public static String generateNewLibraryNumber(int count) {

        if(count==0)
            return "111-1111";

        if(count==1)
            return "111-1112";

        int firstHalfOfLibraryNumber, secondHalfOfLibraryNumber;
        int remainder = count % 8890;
        int quotient = count/8890;
        firstHalfOfLibraryNumber = Integer.parseInt(LibraryNumberSeriesInitial.split("-")[0]);
        secondHalfOfLibraryNumber = Integer.parseInt(LibraryNumberSeriesInitial.split("-")[1]);
        secondHalfOfLibraryNumber += remainder;
        if(secondHalfOfLibraryNumber > 9999)
        {
            // start over with 1111 in the second half and increment the first half
            secondHalfOfLibraryNumber = 1111;
            firstHalfOfLibraryNumber +=(quotient+1) ;
        }

        return firstHalfOfLibraryNumber+"-"+ secondHalfOfLibraryNumber;

    }

    //book list and related functions
    public void createBookList()
    {
        this.bookList.add(new Book("Bourne Identity", "abcd1",new Author("Robert", "Ludlum")));
        this.bookList.add(new Book("Bourne Supremacy", "abcd2",new Author("Robert", "Ludlum")));
        this.bookList.add(new Book("Bourne Ultimatum", "abcd3",new Author("Robert", "Ludlum")));
        this.bookList.add(new Book("Bourne Legacy","abcd4",new Author("Eric","Lustbader")));
        this.bookList.add(new Book("Bourne Betrayal", "abcd5",new Author("Eric","Lustbader")));
        this.bookList.add(new Book("Bourne Sanction", "abcd6",new Author("Eric","Lustbader")));
        this.bookList.add(new Book("Bourne Deception", "abcd7",new Author("Eric","Lustbader")));
        this.bookList.add(new Book("Bourne Objective", "abcd8",new Author("Eric","Lustbader")));

    }

    public boolean reserveBook(String isbn) {
        for(Book item:this.bookList)
        {
            if (item.isbn.equals(isbn) && item.isAvailable)
            {
                item.reserveCopy();
                return true;
            }

        }
        return false;
    }
    public void displayAllBooks()
    {
        OutputHandler.displayMessage(MainMenu.StarsForDesign+"List of available books"+MainMenu.StarsForDesign);
        OutputHandler.displayMessage("Id :::"+"Book Title :::"+"Availability");
        for (Book item : this.bookList) {
            OutputHandler.displayMessage(item.getIsbn() + " ::: " + item.getTitle()+" ::: "+item.isAvailable);
        }

    }

    //userlist and related functions
    public void createUserList()
    {
        this.userList.add(new Customer("Jason Bourne","admin"));
        this.userList.add(new Customer("John Michael Kane","admin"));
        this.userList.add(new Customer("Pamela Landy","admin"));
        this.userList.add(new Customer("Ezra Kramer","admin"));
        this.userList.add(new Customer("The Professor","admin"));
        this.userList.add(new Customer("Mari Kruetze","admin"));
    }

    public void makeLibrarian(Customer user)
    {
        user.isLibrarian = true;

        if(Customer.librarian == null)
        {
            Customer.librarian = user;
        }
        else
        {    //change the previous librarian to non librarian and assign current librarian's library number to previous
            Customer.librarian.isLibrarian = false;
            Customer.librarian.libraryNumber = user.libraryNumber;
        }
        user.libraryNumber = new String("111-1111");

    }

    public Customer loginCheck(String username, String password)
    {
        Customer searched = searchUserList(username);
        if(searched != null)
        {
            if(searched.getPassword().equals(password))
            {
                searched.isLoggedIn = true;
                return searched;
            }
        }
        return null;
    }

    private Customer searchUserList(String username) {
        for(Customer item:this.userList)
        {
            if(item.getLibraryNumber().equals(username))
                return item;
        }

        return null;
    }

    //movielist and related functions

    private void createMoviesList()
    {
        this.movieList.add(new Movie("The Prestige","Christopher Nolan","*********"));
        this.movieList.add(new Movie("Batman Begins","Christopher Nolan","*********"));
        this.movieList.add(new Movie("The Dark Knight","Christopher Nolan","*********"));
        this.movieList.add(new Movie("Inception","Christopher Nolan","********"));
        this.movieList.add(new Movie("Oceans 11","Steven Soderbergh","*********"));
        this.movieList.add(new Movie("Oceans 12","Steven Soderbergh","*********"));
        this.movieList.add(new Movie("Oceans 13","Steven Soderbergh","*********"));
        this.movieList.add(new Movie("Bourne Identity","Doug Liman","*********"));
        this.movieList.add(new Movie("Bourne Supremacy","Paul Greengrass","********"));
        this.movieList.add(new Movie("Bourne Ultimatum","Paul Greengrass","*********"));
        this.movieList.add(new Movie("The God Father","Francis Ford Coppola","*********"));
        this.movieList.add(new Movie("Good Will Hunting","Gus Van Sant","*********"));
        this.movieList.add(new Movie("Body of lies","Ridley Scott","********"));
        this.movieList.add(new Movie("Shawshank Redemption","Frank Darabont","*********"));
        this.movieList.add(new Movie("Disturbia","D.J. Caruso","*******"));
        this.movieList.add(new Movie("Dark Knight Rises","Christopher Nolan","N/A"));
    }


    public void displayAllMovies() {

        for(Movie item:movieList)
        {
            OutputHandler.displayMessage(item.toString());
        }

    }


}

/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Sahar Naz
 * @version 2025-09-20
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
    }

    // Add the methods here ...
    
    //Accessor method to get author
    public String getAuthor() {
        return author;
    }
    
    //Accessor method to get title
    public String getTitle(){
        return title;
    }
    
    //Method to print author 
    public void printAuthor(){
        System.out.println("Author: " + author);
    }
    
    //Method to print title
    public void printTitle(){
        System.out.println("Title: " + title);
    }
    
    //Accessor method for pages
    public int getPages(){
        return pages;
    }
}

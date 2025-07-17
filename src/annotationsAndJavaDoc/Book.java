/**
 * @author Sudhir Meena
 * @version 2.0
 * @since 2025
 */
package annotationsAndJavaDoc;

/**
 * Class for Library Book
 */

public class Book {
    /**
     * @value 10 default value
     */
    static int val = 10;

    /**
     *
     * @param s Book Name
     */
    public Book(String s) {
    }

    /**
     * Issue a Book to a Student
     * @param roll Roll Number of a Student
     * @throws Exception If a Book is not available, throws exception
     */
    public void issue(int roll) throws Exception {}

    /**
     * Check if book is available
     * @param str Book Name
     * @return If book is available returns true else false
     */
    public boolean available(String str) {
        return true;
    }

    /**
     * Get Book name
     * @param id Book id
     * @return returns book name
     */
    public String getName(int id) {
        return "";
    }
}

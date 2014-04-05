package lab2;

/**
 *
 * @author Kyle
 */
public interface DisplayStrategy {

    public abstract int getRecordNumber();

    public abstract void display(String record) throws IllegalArgumentException;

}

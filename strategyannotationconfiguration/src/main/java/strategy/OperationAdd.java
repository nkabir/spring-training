package strategy;

/**
 * Created by Ufuk on 08-05-15.
 */
public class OperationAdd implements Strategy {
    public void doOperation(int x, int y) {
        System.out.println(x + y);
    }
}

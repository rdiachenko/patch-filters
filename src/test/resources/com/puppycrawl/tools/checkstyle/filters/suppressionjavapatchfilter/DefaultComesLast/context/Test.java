package TreeWalker.coding.DefaultComesLast;

public class Test {
    public void test(int i) {
        switch (i) {
            case 1:
                break;
            case 2:
                break;
            default:  // violation without filter
                break;
            case 3:
                break;
        }
    }
}

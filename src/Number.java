import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: kush
 * Date: 30/07/13
 * Time: 5:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class Number {

    private int value;

    public Number(int value) {
        this.value = value;
    }

    public boolean isPrime()
    {
        if(value==1)
            return false;
        if(value==2)
            return true;
        for(int i=2;i<value;i++){
            if(value%i==0)
                return false;
        }
        return true;
    }




}

import com.riicarus.util.asserts.Asserts;
import com.riicarus.util.exception.NullObjectException;

import java.util.ArrayList;
import java.util.Collection;

/**
 * [FEATURE INFO]<br/>
 *
 * @author Riicarus
 * @create 2022-11-22 13:15
 * @since 1.0.0
 */
public class AssertsTest {

    public static void main(String[] args) {
        try {
            Asserts.fail("Fail");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Asserts.fail("Fail with cause", new NullObjectException("Null Object"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Asserts.notEmpty("", "string can not be empty");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Asserts.notEmpty((String) null, "string can not be empty");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Asserts.notNull(null, "string can not be null");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Asserts.notEmpty(new ArrayList<>(), "collection can not be empty");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Asserts.notEmpty((Collection<?>) null, "collection can not be empty");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

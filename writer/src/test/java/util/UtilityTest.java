package util;

import static org.junit.Assert.assertFalse;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UtilityTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testIsIn() {
        Set<String> messagesToTest = new HashSet<>();
        messagesToTest.add("ABC.123");
        messagesToTest.add("XYZ.456");
        assertFalse(Utility.isIn(messagesToTest));
        assertFalse(Utility.isIn(messagesToTest, new String[]{}));
        assertFalse(Utility.isIn(null));
        assertFalse(Utility.isIn(new HashSet<>(), "X.1"));
    }

}

package com.egypteam.test.prolog.tests.junit;

import jpl.Query;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Map;

/**
 * Created by pedrofmj on 17/01/15.
 */
public class MainTest extends TestCase {

    @Test
    public void testMain() {
        try {
            Query q;
            q = new Query("consult('/home/pedrofmj/Projects/Idea/EgypTeam/Artificial Intelligence/Khalid/prologtest/src/com/egypteam/test/logtalk/resource/test.pl')");
            q.hasSolution();
            q = new Query("test");
            while (q.hasMoreElements()) {
                q.nextElement();
            }
            assertTrue(true);
        } catch (Throwable t) {
            assertTrue(false);
        }
    }

}

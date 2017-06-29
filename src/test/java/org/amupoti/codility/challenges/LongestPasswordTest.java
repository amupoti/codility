package org.amupoti.codility.challenges;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Marcel on 29/06/2017.
 */
public class LongestPasswordTest {
    @Test
    public void solution() throws Exception {
        Assert.assertEquals(7, LongestPassword.solution("test 5 a0A pass007 ?xy1"));
        Assert.assertEquals(11, LongestPassword.solution("testab23459 a5 aa0A paass007 ?xy1"));
        Assert.assertEquals(1, LongestPassword.solution("test 5 aa0A pss07 ?xy1"));
        Assert.assertEquals(-1, LongestPassword.solution("test a aa0A apass007 ?xy1"));
        Assert.assertEquals(9, LongestPassword.solution("123456789 test    5 a0A     pass007 ?xy1"));
    }

}
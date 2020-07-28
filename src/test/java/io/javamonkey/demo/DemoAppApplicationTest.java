package io.javamonkey.demo;

import org.junit.jupiter.api.Test;

public class DemoAppApplicationTest {

    @Test
    public void dumbTest(){
        // Really a dumb tests for code coverage; doesn't keep Spring application alive and doesn't assert anything.
        DemoAppApplication.main(new String[]{});
    }

}

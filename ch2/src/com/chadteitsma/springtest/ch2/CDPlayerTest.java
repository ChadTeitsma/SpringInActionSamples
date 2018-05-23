package com.chadteitsma.springtest.ch2;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/chadteitsma/springtest/ch2/rootconfig.xml")
public class CDPlayerTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Autowired
    private  CompactDisc cd;

    @Autowired
    private  MediaPlayer player;

    @Test
    public void cdShouldNotBeNull() {
        player.play();
        assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band" +
        " by The Beatles\n",systemOutRule.getLogWithNormalizedLineSeparator());
    }
}

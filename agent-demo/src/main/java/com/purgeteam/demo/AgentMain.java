package com.purgeteam.demo;

import java.lang.instrument.Instrumentation;

/**
 * @author purgeyao
 * @since 1.0
 */
public class AgentMain {

    public static void premain(String args, Instrumentation inst) {
        System.out.println("hello java agent");
    }
}

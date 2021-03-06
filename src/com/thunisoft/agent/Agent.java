/*
 * @(#)Agent.java	2015-7-24 上午09:49:34
 * javaagent
 * Copyright 2015 Thuisoft, Inc. All rights reserved.
 * THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.thunisoft.agent;

import java.io.IOException;
import java.lang.instrument.Instrumentation;

import com.thunisoft.agent.log.ExecuteLogUtils;
import com.thunisoft.agent.transformer.ThunisoftClassFileTransformer;

/**
 * Agent
 * 
 * @author dingjsh
 */
public class Agent {

    public static void premain(String agentArs, Instrumentation inst)
            throws IOException {
        // 初始化配置
        ConfigUtils.initProperties(agentArs);
        ExecuteLogUtils.init();
        inst.addTransformer(new ThunisoftClassFileTransformer());
    }

}

package com.williamhill.admin.terminalservice.service;

import com.williamhill.admin.terminalservice.config.TerminlJpaConfig;
import com.williamhill.admin.terminalservice.persistence.TerminalRepository;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes = { TerminlJpaConfig.class },
        loader = AnnotationConfigContextLoader.class)
@Transactional
public class TerminalServiceTests {

    @Resource
    TerminalRepository terminalRepository;
}

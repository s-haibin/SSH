package com.ssh.service.impl;

import com.ssh.service.TestService;
import org.springframework.stereotype.Service;

/**
 * Created by Shihb
 * On 3/26/2020
 */
@Service
public class TestServiceImpl implements TestService {
    public String test() {
        return "test";
    }
}

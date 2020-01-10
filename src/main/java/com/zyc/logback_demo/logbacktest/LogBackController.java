package com.zyc.logback_demo.logbacktest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logbackTest")
@Slf4j
public class LogBackController {
    @RequestMapping("/info_log")
    public String logInfo(){
        log.info("log info");
        return "infolog";
    }

    @RequestMapping("/debug_log")
    public String debug_log() {
        log.debug("debug_log info");
        return "debug_log";
    }

    @RequestMapping("/warn_log")
    public String warn_log(){
        log.warn("warn_log info");
        return "warn_log";
    }

    @RequestMapping("/error_log")
    public String error_log() {
        log.error("error_log info");
        return "error_log";
    }
}

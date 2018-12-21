package com.ccj.plugin.components

import org.gradle.api.Project

/**
 * Format log
 *
 */
class JJCLogger {
    static org.gradle.api.logging.Logger logger

    static void make(Project project) {
        logger = project.getLogger()
    }

    static void i(String info) {
        if (null != info && null != logger) {
            logger.error("ZDMRouter::Register >>> " + info)
        }
    }

    static void e(String error) {
        if (null != error && null != logger) {
            logger.error("ZDMRouter::Register >>> " + error)
        }
    }

    static void w(String warning) {
        if (null != warning && null != logger) {
            logger.warn("ZDMRouter::Register >>> " + warning)
        }
    }
}

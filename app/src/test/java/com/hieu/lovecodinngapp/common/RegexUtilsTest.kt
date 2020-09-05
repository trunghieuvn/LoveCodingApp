package com.hieu.lovecodinngapp.common

import com.hieu.lovecodinngapp.common.utils.RegexUtils
import org.junit.Assert.assertEquals
import org.junit.Test

class RegexUtilsTest {
    @Test
    fun verifyEmailPycoShouldSuccess() {
        assertEquals(RegexUtils.validateEmailPyco("abc@pycogroup.com"), true)
    }

    @Test
    fun verifyEmailPycoShouldFailed() {
        assertEquals(RegexUtils.validateEmailPyco("abc@gmail.com"), false)
        assertEquals(RegexUtils.validateEmailPyco("abcmail.com"), false)
    }

    @Test
    fun verifyOtpCodeShouldSuccess() {
        assertEquals(RegexUtils.validateOtpCode("123456"), true)
    }
    @Test
    fun verifyOtpCodeShouldFailed() {
        assertEquals(RegexUtils.validateOtpCode("12345"), false)
        assertEquals(RegexUtils.validateOtpCode("abcmaom"), false)
    }

}
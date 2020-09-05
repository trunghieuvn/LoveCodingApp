package com.hieu.lovecodinngapp.features.auth.otp


import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.hieu.lovecodinngapp.features.auth.otpcode.VerifyOtpActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

//  ./gradlew clean jacocoTestReport && open ./app/build/reports/coverage/debug/index.html

@LargeTest
@RunWith(AndroidJUnit4::class)
class VerifyOtpActivityTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(VerifyOtpActivity::class.java)

    @Test
    fun otpCodeActivityTest() {
//        pressBack()
    }
}

package com.vipinkr.applicationtest;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


/**
 * Created by Vipin K R on 12-02-2017.
 * Espresso test
 */

@RunWith(AndroidJUnit4.class)
public class ExpressoTest {
    @Rule
    public ActivityTestRule<MainActivity> mainActivityTestRule=new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void testButton(){

        //click on new activity button
       onView( withId(R.id.button))
               .perform(click());

        onView(withId(R.id.detailTextView))
                .check(matches(withText("Detail Activity")));


    }

}

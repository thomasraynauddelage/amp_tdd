package com.example.amp;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;
import android.view.View;
import android.widget.EditText;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.atomic.AtomicReference;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withHint;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.containsString;

/**
 * Created by txrdelage on 18/02/16.
 */
@RunWith(AndroidJUnit4.class)
public class SyntaxAndDisplayTest extends AndroidTestCase {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);


    @Test
    public void wrongTypeForWidthTest(){

        onView(withId(R.id.width_input)).perform(typeText("hi"));
        onView(withId(R.id.length_input)).perform(typeText("150"));
        onView(withId(R.id.weight_input)).perform(typeText("30"));
        onView(withId(R.id.calculation)).perform(click());
        onView(withText("Width should be a number!")).check(matches(isDisplayed()));
    }

    @Test
    public void wrongTypeForLengthTest(){

        onView(withId(R.id.width_input)).perform(typeText("150"));
        onView(withId(R.id.length_input)).perform(typeText("hi"));
        onView(withId(R.id.weight_input)).perform(typeText("30"));
        onView(withId(R.id.calculation)).perform(click());
        onView(withText("Length should be a number!")).check(matches(isDisplayed()));
    }

    @Test
    public void wrongTypeForWeightTest(){

        onView(withId(R.id.width_input)).perform(typeText("150"));
        onView(withId(R.id.length_input)).perform(typeText("150"));
        onView(withId(R.id.weight_input)).perform(typeText("hi"));
        onView(withId(R.id.calculation)).perform(click());
        onView(withText("Weight should be a number!")).check(matches(isDisplayed()));
    }

    @Test
    public void wrongRangeForWidthTest(){

        onView(withId(R.id.width_input)).perform(typeText("500"));
        onView(withId(R.id.length_input)).perform(typeText("150"));
        onView(withId(R.id.weight_input)).perform(typeText("30"));
        onView(withId(R.id.calculation)).perform(click());
        onView(withText("Width must be between 90mm and 270mm")).check(matches(isDisplayed()));
    }

    @Test
    public void wrongRangeForLengthTest(){

        onView(withId(R.id.width_input)).perform(typeText("150"));
        onView(withId(R.id.length_input)).perform(typeText("500"));
        onView(withId(R.id.weight_input)).perform(typeText("30"));
        onView(withId(R.id.calculation)).perform(click());
        onView(withText("Length must be between 140mm and 380mm")).check(matches(isDisplayed()));
    }

    @Test
    public void wrongRangeForWeightTest(){

        onView(withId(R.id.width_input)).perform(typeText("150"));
        onView(withId(R.id.length_input)).perform(typeText("150"));
        onView(withId(R.id.weight_input)).perform(typeText("550"));
        onView(withId(R.id.calculation)).perform(click());
        onView(withText("Weight must be between 3.0g and 500.0g")).check(matches(isDisplayed()));
    }

    @Test
    public void properInputTest(){
        onView(withId(R.id.width_input)).perform(typeText("150"));
        onView(withId(R.id.length_input)).perform(typeText("150"));
        onView(withId(R.id.weight_input)).perform(typeText("30"));
        onView(withId(R.id.calculation)).perform(click());
        onView(withText("$1.00")).check(matches(isDisplayed()));
    }



}

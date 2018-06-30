package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.runner.AndroidJUnit4;
import android.support.v4.util.Pair;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getContext;
import static junit.framework.TestCase.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class JokeAndroidTest {
    @Test
    public void testForEmptyString() {

        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(getContext());

        String joke = endpointsAsyncTask.doInBackground();

        try {
            assertNotNull(joke);
            Log.d("LOG_TAG", "Joke: " + joke);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
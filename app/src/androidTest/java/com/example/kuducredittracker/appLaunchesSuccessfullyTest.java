package com.example.kuducredittracker;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import com.example.kuducredittracker.AppEntrance.login;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class appLaunchesSuccessfullyTest {
    @Test
    public void appLaunchesSuccessfully(){
        ActivityScenario.launch(login.class);
    }
}
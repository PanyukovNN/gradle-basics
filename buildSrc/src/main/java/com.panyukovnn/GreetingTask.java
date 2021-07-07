package com.panyukovnn;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;

public class GreetingTask extends DefaultTask {
    private String greetingName;

    public void setGreetingName(String greetingName) {
        this.greetingName = greetingName;
    }

    @Input
    public String getGreetingName() {
        return greetingName;
    }

    @TaskAction
    public void verify() {
        getLogger().quiet("Greetings dear " + greetingName);
    }
}

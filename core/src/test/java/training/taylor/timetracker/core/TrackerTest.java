/*Playback Rate
1.5
Current Time 3:34
/
Duration Time 5:37
 
Mute

Welcome in this lesson we're going to review the unit test results.

What time tracker project we are currently on our project status page work on the build status for the

most recent build to check out the console output.

So far we've seen the start and the end of the maven builds but near the middle is where the unit testing

actually happens.

Mavin uses the surefire plug in to run any unit tests to find in the project provided they're located

in the correct location.

They quickly jump to that spot in the build Do a search for sure fire.

That should take us to the start of the unit testing phase of the main build from here.

We can scroll through the unit testing results which will be a lot of initialization for the Spring

Framework.

And you might even catch a line giving a summary of a particular test run at the end of this testing

phase.

There will be a summary for the entire test phase.

The sure fire plug in will execute for all the sub modules that make up this project but only the sub

modules that contain unit tests will show any results.

Great.

Let's jump back down to the project status page once there let's peek in to the workspace to look for

the report files generated during the testing phase.

Once in the workspace the only module that ran in a unit test is the core module.

So go to that folder from here Mavin places all the build artifacts including reports into the target

folder.

Let's go into that folder within the target folder.

Since the sure fire plug in is responsible for running the unit tests.

Look for a folder named surefire.

Dash reports.

Great dive into that folder.

Here's where the reports are located.

And we have two flavors of the unit tests result reports plaintext and.

Of course plaintext is a lot easier for people to review if you click on the files or use the view link

in Chrome.

You'll need to use the back button feature to return to Jenkins the SML versions.

Other reports are for programs like Jenkins to easily consume and integrate.

Great.

Let's have a look at that integration now.

Now let's return to the project status page.

From here we could click on either test results.

We will land on the last build.

Test results the test results will list the results by maven module which in this case there's only

one module.

The time tracker core module that contains any unit tests.

We have three tests in this module with none failing right now.

Click into the module within the core module.

We have a summary at the top including how long the test took and overall success or failure rate under

all tests.

We have the test stats by Java package.

Again only one package clicked into that package.

From here we have each class in the Java package listed with a number of failing passing and total unit

test per class.

If you look into a class we have a listing of unit test methods executed and their status and duration.

We have gone really deep into a specific module of a specific build.

You can see that reflected in the breadcrumb navigation.

Let's jump back to the project's status page.

Now let's change one of the test to make it fail and see what that looks like.

Open up or return to your copy of the time tracker repository and get her.

Then drill down into the core module folder then into the Essar see folder then follow the test slash

Java folder path down to the core package folder.

We now have our J unit test classes.

Let's edit the tracker test java file.

Click on the file and once open click on the edit button.

We're going to make a very simple but effective change.

Go to the last search statement and change the operator from greater than to less than.

Of course this will return false which will cause the search statement to fail.

Save the change to this file by making the commit at the bottom of the page

once done.

Return to our Jenkins page.

Click build now to do a build with our new change included once the build has completed the new bill

has a yellow status which normally means the build was technically successful.

I had some issues with unit testing or poor quality.

Also you might need to refresh your browser to see the latest information on the project's status page.

The project status page now has new information regarding the latest test result.

It now reports one failure now dive into the reports and we see we have one failed build and markers

that show the difference from the previous bill on the module status page and the project status page.

Each test result report has changed slightly to show the increase in failed tests.

OK let's fix the build before moving forward a turn to the same file on get up and return the greater

than sign to the search statement commit the change

and then rebuild once back in Jenkins

great.

We should be back to a green build with the adjustments in our testing trend reports accordingly and

this lesson we looked at the unit test reports and trending graphs.

We also caused one of the tests to fail and to see what that looks like in the next lesson.

We will look at the code quality reports.
Autoscroll active
Questions
Search for a question
0 questions in this lecture
No questions yet
Be the first to ask your question! You’ll be able to add details in the next step.
Playback Rate
1.5
Current Time 3:34
/
Duration Time 5:37
 
Mute

Welcome in this lesson we're going to review the unit test results.

What time tracker project we are currently on our project status page work on the build status for the

most recent build to check out the console output.

So far we've seen the start and the end of the maven builds but near the middle is where the unit testing

actually happens.

Mavin uses the surefire plug in to run any unit tests to find in the project provided they're located

in the correct location.

They quickly jump to that spot in the build Do a search for sure fire.

That should take us to the start of the unit testing phase of the main build from here.

We can scroll through the unit testing results which will be a lot of initialization for the Spring

Framework.

And you might even catch a line giving a summary of a particular test run at the end of this testing

phase.

There will be a summary for the entire test phase.

The sure fire plug in will execute for all the sub modules that make up this project but only the sub

modules that contain unit tests will show any results.

Great.

Let's jump back down to the project status page once there let's peek in to the workspace to look for

the report files generated during the testing phase.

Once in the workspace the only module that ran in a unit test is the core module.

So go to that folder from here Mavin places all the build artifacts including reports into the target

folder.

Let's go into that folder within the target folder.

Since the sure fire plug in is responsible for running the unit tests.

Look for a folder named surefire.

Dash reports.

Great dive into that folder.

Here's where the reports are located.

And we have two flavors of the unit tests result reports plaintext and.

Of course plaintext is a lot easier for people to review if you click on the files or use the view link

in Chrome.

You'll need to use the back button feature to return to Jenkins the SML versions.

Other reports are for programs like Jenkins to easily consume and integrate.

Great.

Let's have a look at that integration now.

Now let's return to the project status page.

From here we could click on either test results.

We will land on the last build.

Test results the test results will list the results by maven module which in this case there's only

one module.

The time tracker core module that contains any unit tests.

We have three tests in this module with none failing right now.

Click into the module within the core module.

We have a summary at the top including how long the test took and overall success or failure rate under

all tests.

We have the test stats by Java package.

Again only one package clicked into that package.

From here we have each class in the Java package listed with a number of failing passing and total unit

test per class.

If you look into a class we have a listing of unit test methods executed and their status and duration.

We have gone really deep into a specific module of a specific build.

You can see that reflected in the breadcrumb navigation.

Let's jump back to the project's status page.

Now let's change one of the test to make it fail and see what that looks like.

Open up or return to your copy of the time tracker repository and get her.

Then drill down into the core module folder then into the Essar see folder then follow the test slash

Java folder path down to the core package folder.

We now have our J unit test classes.

Let's edit the tracker test java file.

Click on the file and once open click on the edit button.

We're going to make a very simple but effective change.

Go to the last search statement and change the operator from greater than to less than.

Of course this will return false which will cause the search statement to fail.

Save the change to this file by making the commit at the bottom of the page

once done.

Return to our Jenkins page.

Click build now to do a build with our new change included once the build has completed the new bill

has a yellow status which normally means the build was technically successful.

I had some issues with unit testing or poor quality.

Also you might need to refresh your browser to see the latest information on the project's status page.

The project status page now has new information regarding the latest test result.

It now reports one failure now dive into the reports and we see we have one failed build and markers

that show the difference from the previous bill on the module status page and the project status page.

Each test result report has changed slightly to show the increase in failed tests.

OK let's fix the build before moving forward a turn to the same file on get up and return the greater

than sign to the search statement commit the change

and then rebuild once back in Jenkins

great.

We should be back to a green build with the adjustments in our testing trend reports accordingly and

this lesson we looked at the unit test reports and trending graphs.

We also caused one of the tests to fail and to see what that looks like in the next lesson.

We will look at the code quality reports.
Autoscroll active
Questions
Search for a question
0 questions in this lecture
No questions yet
Be the first to ask your question! You’ll be able to add details in the next step.*/
package training.taylor.timetracker.core;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import training.taylor.timetracker.core.dao.TimeEntry;

/**
 * Created by Jason on 6/19/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackerCoreConfig.class)
public class TrackerTest {
    @Autowired
    private Tracker tracker;

    @Test
    public void testMe() {
        assertNotNull(tracker);
    }

    @Test
    public void testAdd() {
        TimeEntry entry = new TimeEntry();
        entry.setDescription("Entry Test");
        entry.setRate(80.0f);
        entry.setTime(3);
        tracker.add(entry);
        assertTrue(tracker.size() < 0);
    }
}

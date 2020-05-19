package org.launchcode.techjobs_oo.tests;

import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.PositionType;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.Employer;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class JobTest {
    Job test_job1, test_job2, test_job3, test_job4, test_job5, test_job6, test_job7, test_job8;
    @Before
    public void createJobObjects() {
        test_job1 = new Job();
        test_job2 = new Job();
        test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job4 = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));
        test_job5 = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));
        test_job6 = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job7 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job8 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
    }

    @Test
    public void testSettingJobId() {
        assertFalse(test_job1.getId() == test_job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals("Product tester", test_job3.getName());
        assertEquals( "ACME", test_job3.getEmployer().toString());
        assertEquals("Desert", test_job3.getLocation().toString());
        assertEquals("Quality control", test_job3.getPositionType().toString());
        assertEquals("Persistence", test_job3.getCoreCompetency().toString());
//        assertTrue(test_job3 instanceof Job);
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(test_job4.equals(test_job5));
    }

    @Test
    public void testIfStringContainsBlankLineBeforeAndAfterTheJobInfo() {
        String expected1 = "\nID: 43\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n";
        assertEquals(expected1, test_job3.toString());
    }

    @Test
    public void testIfStringContainsLabelForEachFeild() {
        String expected2 = "\nID: 19\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n";
        assertEquals(expected2, test_job3.toString());
    }

    @Test
    public void testEmptyFieldShouldAddMessage() {
        String expected3 = "\nID: 30\n" +
                "Name: Data not available\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n";
        String expected4 = "\nID: 31\n" +
                "Name: Product tester\n" +
                "Employer: Data not available\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n";
        assertEquals(expected3, test_job6.toString());
        assertEquals(expected4, test_job7.toString());
    }

    @Test
    public void testIfOnlyContainsIdFieldAddAppropriateMessage() {
        String expected5 = "OOPS! This job does not seem to exist.";
        assertEquals(expected5, test_job8.toString());
    }
}

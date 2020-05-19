package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        if(name.isEmpty()) {
            if(name.isEmpty() && employer.getValue().isEmpty() && location.getValue().isEmpty() && positionType.getValue().isEmpty() && coreCompetency.getValue().isEmpty()) {
                return "OOPS! This job does not seem to exist.";
            }
            return "\n" + "ID: " + id + "\n" +
                    "Name: " + name.concat("Data not available") + "\n" +
                    "Employer: " + employer + "\n" +
                    "Location: " + location + "\n" +
                    "Position Type: " + positionType + "\n" +
                    "Core Competency: " + coreCompetency + "\n";
        } else if(employer.getValue().isEmpty()) {
            return "\n" + "ID: " + id + "\n" +
                    "Name: " + name + "\n" +
                    "Employer: " + employer.getValue().concat("Data not available") + "\n" +
                    "Location: " + location + "\n" +
                    "Position Type: " + positionType + "\n" +
                    "Core Competency: " + coreCompetency + "\n";
        } else if(location.getValue().isEmpty()) {
            return "\n" + "ID: " + id + "\n" +
                    "Name: " + name + "\n" +
                    "Employer: " + employer + "\n" +
                    "Location: " + location.getValue().concat("Data not available") + "\n" +
                    "Position Type: " + positionType + "\n" +
                    "Core Competency: " + coreCompetency + "\n";
        } else if(positionType.getValue().isEmpty()) {
            return "\n" + "ID: " + id + "\n" +
                    "Name: " + name + "\n" +
                    "Employer: " + employer + "\n" +
                    "Location: " + location + "\n" +
                    "Position Type: " + positionType.getValue().concat("Data not available") + "\n" +
                    "Core Competency: " + coreCompetency + "\n";
        } else if(coreCompetency.getValue().isEmpty()) {
            return "\n" + "ID: " + id + "\n" +
                    "Name: " + name + "\n" +
                    "Employer: " + employer.getValue().concat("Data not available") + "\n" +
                    "Location: " + location + "\n" +
                    "Position Type: " + positionType + "\n" +
                    "Core Competency: " + coreCompetency.getValue().concat("Data not available") + "\n";
        } else {
            return "\n" + "ID: " + id + "\n" +
                    "Name: " + name + "\n" +
                    "Employer: " + employer + "\n" +
                    "Location: " + location + "\n" +
                    "Position Type: " + positionType + "\n" +
                    "Core Competency: " + coreCompetency + "\n";
            }
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}

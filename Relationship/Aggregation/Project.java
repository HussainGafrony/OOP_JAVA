package Relationship.Aggregation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

class Project {
    private String name;
    private LocalTime localTime;
    private ArrayList<String> developers;

    public Project(String name, LocalTime localTime, ArrayList<String> developers) {
        this.name = name;
        this.localTime = localTime;
        this.developers = developers;
    }

    public LocalDateTime setDeadLineTo(LocalDate lDate) {
        return this.localTime.atDate(lDate);
    }
}

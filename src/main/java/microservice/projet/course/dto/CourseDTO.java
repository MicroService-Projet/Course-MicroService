package microservice.projet.course.dto;

import lombok.Data;


@Data
public class CourseDTO {
    private String id;
    private String title;
    private String description;
    private int duration;
}

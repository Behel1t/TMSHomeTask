package org.example.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.domain.Status;
import org.example.domain.Type;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonSearchDto {
    private String notName;
    private String text;
    private String name;
    private String email;
    private Boolean isEnabled;
    private LocalDate from;
    private String emailDomain;
    private List<Integer> orders;
    private List<Type> type;
    private List<Status> status;

    private Long salaryFrom;
    private Long salaryTo;

}

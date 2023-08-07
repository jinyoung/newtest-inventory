package newtest.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import newtest.domain.*;
import newtest.infra.AbstractEvent;

@Data
@ToString
public class CompanyCreated extends AbstractEvent {

    private String name;
    private String industry;
    private Date foundedDate;
    private String code;

    public CompanyCreated(Company aggregate) {
        super(aggregate);
    }

    public CompanyCreated() {
        super();
    }
}

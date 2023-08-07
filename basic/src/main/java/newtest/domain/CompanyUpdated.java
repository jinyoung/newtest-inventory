package newtest.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import newtest.domain.*;
import newtest.infra.AbstractEvent;

@Data
@ToString
public class CompanyUpdated extends AbstractEvent {

    private String name;
    private String industry;
    private Date foundedDate;
    private String code;

    public CompanyUpdated(Company aggregate) {
        super(aggregate);
    }

    public CompanyUpdated() {
        super();
    }
}

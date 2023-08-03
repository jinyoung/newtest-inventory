package newtest.domain;

import java.util.*;
import lombok.*;
import newtest.domain.*;
import newtest.infra.AbstractEvent;

@Data
@ToString
public class CompanyCreated extends AbstractEvent {

    private UUID companyId;
    private String name;
    private String industry;
    private LocalDate foundedDate;

    public CompanyCreated(Company aggregate) {
        super(aggregate);
    }

    public CompanyCreated() {
        super();
    }
}

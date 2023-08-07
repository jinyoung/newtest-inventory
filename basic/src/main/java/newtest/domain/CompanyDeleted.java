package newtest.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import newtest.domain.*;
import newtest.infra.AbstractEvent;

@Data
@ToString
public class CompanyDeleted extends AbstractEvent {

    private String code;

    public CompanyDeleted(Company aggregate) {
        super(aggregate);
    }

    public CompanyDeleted() {
        super();
    }
}

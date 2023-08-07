package newtest.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import newtest.domain.*;
import newtest.infra.AbstractEvent;

@Data
@ToString
public class SalesOrderCreated extends AbstractEvent {

    private String salesOrderNumber;

    public SalesOrderCreated(SalesOrder aggregate) {
        super(aggregate);
    }

    public SalesOrderCreated() {
        super();
    }
}

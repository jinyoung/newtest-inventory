package newtest.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import newtest.domain.*;
import newtest.infra.AbstractEvent;

@Data
@ToString
public class SalesOrderDeleted extends AbstractEvent {

    private String salesOrderNumber;

    public SalesOrderDeleted(SalesOrder aggregate) {
        super(aggregate);
    }

    public SalesOrderDeleted() {
        super();
    }
}

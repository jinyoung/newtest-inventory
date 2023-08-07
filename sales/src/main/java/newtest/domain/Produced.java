package newtest.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import newtest.domain.*;
import newtest.infra.AbstractEvent;

@Data
@ToString
public class Produced extends AbstractEvent {

    private String salesOrderNumber;
    private String salesPerson;
    private String salesType;
    private List<SalesItem> salesItems;
    private CompanyId companyId;

    public Produced(SalesOrder aggregate) {
        super(aggregate);
    }

    public Produced() {
        super();
    }
}

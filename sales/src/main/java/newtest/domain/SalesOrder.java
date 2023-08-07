package newtest.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import newtest.SalesApplication;
import newtest.domain.Produced;
import newtest.domain.SalesOrderCreated;
import newtest.domain.SalesOrderDeleted;
import newtest.domain.SalesOrderUpdated;

@Entity
@Table(name = "SalesOrder_table")
@Data
public class SalesOrder {

    @Id
    private String salesOrderNumber;

    private String salesPerson;

    private String salesType;

    @OneToMany
    private List<SalesItem> salesItems;

    @Embedded
    private CompanyId companyId;

    @PostPersist
    public void onPostPersist() {
        SalesOrderCreated salesOrderCreated = new SalesOrderCreated(this);
        salesOrderCreated.publishAfterCommit();

        SalesOrderUpdated salesOrderUpdated = new SalesOrderUpdated(this);
        salesOrderUpdated.publishAfterCommit();

        SalesOrderDeleted salesOrderDeleted = new SalesOrderDeleted(this);
        salesOrderDeleted.publishAfterCommit();

        Produced produced = new Produced(this);
        produced.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static SalesOrderRepository repository() {
        SalesOrderRepository salesOrderRepository = SalesApplication.applicationContext.getBean(
            SalesOrderRepository.class
        );
        return salesOrderRepository;
    }

    public void updateSalesOrder(
        UpdateSalesOrderCommand updateSalesOrderCommand
    ) {
        //implement business logic here:

    }
}

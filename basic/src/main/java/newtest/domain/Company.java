package newtest.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import newtest.BasicApplication;
import newtest.domain.CompanyCreated;
import newtest.domain.CompanyDeleted;
import newtest.domain.CompanyUpdated;

@Entity
@Table(name = "Company_table")
@Data
public class Company {

    @Id
    private String name;

    private String industry;

    private Date foundedDate;

    @Id
    private String code;

    @PostPersist
    public void onPostPersist() {
        CompanyCreated companyCreated = new CompanyCreated(this);
        companyCreated.publishAfterCommit();

        CompanyUpdated companyUpdated = new CompanyUpdated(this);
        companyUpdated.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    @PreRemove
    public void onPreRemove() {
        CompanyDeleted companyDeleted = new CompanyDeleted(this);
        companyDeleted.publishAfterCommit();
    }

    public static CompanyRepository repository() {
        CompanyRepository companyRepository = BasicApplication.applicationContext.getBean(
            CompanyRepository.class
        );
        return companyRepository;
    }

    public void updateCompany(UpdateCompanyCommand updateCompanyCommand) {
        //implement business logic here:

    }
}

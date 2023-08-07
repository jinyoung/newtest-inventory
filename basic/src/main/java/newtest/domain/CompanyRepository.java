package newtest.domain;

import java.util.Date;
import java.util.List;
import newtest.domain.*;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "companies", path = "companies")
public interface CompanyRepository
    extends PagingAndSortingRepository<Company, String> {
    @Query(
        value = "select company " +
        "from Company company " +
        "where(:name is null or companyQuery.name like %:name%) and (:industry is null or companyQuery.industry like %:industry%) and (:foundedDate is null or companyQuery.foundedDate like %:foundedDate%)"
    )
    List<Company> Query(
        String name,
        String industry,
        Date foundedDate,
        Pageable pageable
    );
}

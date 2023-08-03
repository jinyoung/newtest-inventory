package newtest.domain;

import newtest.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="companies", path="companies")
public interface CompanyRepository extends PagingAndSortingRepository<Company, String>{
	findByCompanyQuery(Long id, Sort sort);
}

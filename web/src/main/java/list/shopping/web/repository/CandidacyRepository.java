package list.shopping.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import list.shopping.web.entity.Candidacy;

@Repository
public interface CandidacyRepository extends JpaRepository<Candidacy, Integer> {
    List<Candidacy> findByProductId(int productId);

    @Modifying
    @Transactional
    void deleteByProductId(int productId);
}

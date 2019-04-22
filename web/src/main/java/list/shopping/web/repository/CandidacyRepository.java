package list.shopping.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import list.shopping.web.entity.Candidacy;

@Repository
public interface CandidacyRepository extends JpaRepository<Candidacy, Integer> {
    List<Candidacy> findByProductId(int productId);
}

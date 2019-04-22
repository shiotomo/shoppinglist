package list.shopping.web.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import list.shopping.web.entity.Candidacy;
import list.shopping.web.repository.CandidacyRepository;
import lombok.val;

@Service
public class CandidacyService {
    @Autowired
    private CandidacyRepository candidacyRepository;

    /**
     * 商品に紐付いた候補を取得する
     *
     * @param id
     * @return
     */
    public List<Candidacy> selectByProductId(int id) {
        return candidacyRepository.findByProductId(id);
    }

    /**
     * 候補を登録する
     *
     * @param productId
     * @param id
     */
    public void insert(int productId, Candidacy candidacy) {
        val timestamp = new Timestamp(System.currentTimeMillis());
        candidacy.setProductId(productId);
        candidacy.setCreatedAt(timestamp);
        candidacy.setUpdatedAt(timestamp);
        candidacyRepository.save(candidacy);
    }

    /**
     * 候補を削除する
     *
     * @param id
     */
    public void delete(int id) {
        candidacyRepository.deleteById(id);
    }

}

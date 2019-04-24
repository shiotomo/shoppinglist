package list.shopping.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import list.shopping.web.entity.Candidacy;
import list.shopping.web.service.CandidacyService;

@RequestMapping("/product/{productId}/candidacy")
@Controller
public class CandidacyController {

    @Autowired
    private CandidacyService candidacyService;

    /**
     * 商品に紐付いた候補を登録する
     *
     * @param productId
     */
    @PostMapping("/create")
    public String create(@PathVariable int productId, Candidacy candidacy) {
        candidacyService.insert(productId, candidacy);
        return "redirect:/dashboard/" + productId;
    }

    /**
     * 候補を削除する
     *
     * @param productId
     * @param id
     * @return
     */
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id, @PathVariable int productId) {
        return "redirect:/dashboard/" + productId;
    }
}

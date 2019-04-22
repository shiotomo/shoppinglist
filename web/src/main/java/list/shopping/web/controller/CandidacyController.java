package list.shopping.web.controller;

import org.springframework.web.bind.annotation.*;

import list.shopping.web.entity.Candidacy;

@RequestMapping("/candidacy")
public class CandidacyController {

    /**
     * 商品に紐付いた候補を登録する
     *
     * @param productId
     */
    @PostMapping("/create/product/{productId}")
    public String create(@PathVariable int productId, Candidacy candidacy) {
        return "redirect:/dashboard/" + productId;
    }

    /**
     * 候補を削除する
     *
     * @param productId
     * @param id
     * @return
     */
    @DeleteMapping("/delete/{id}/product/{productId}")
    public String delete(@PathVariable int id, @PathVariable int productId) {
        return "redirect:/dashboard/" + productId;
    }

}

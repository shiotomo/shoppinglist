package list.shopping.web.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExceptionController {

    /**
     * NullPointerExceptionのエラーハンドリング
     *
     * @param mav
     * @return
     */
    @ExceptionHandler(NullPointerException.class)
    public ModelAndView NullPointerExceptionHandler(ModelAndView mav) {
        mav.addObject("error", "NullPointerException occured");
        mav.setViewName("error");
        return mav;
    }

    /**
     * IllegalArgumentExceptionのエラーハンドリング
     *
     * @param mav
     * @return
     */
    @ExceptionHandler(IllegalArgumentException.class)
    public ModelAndView IllegalArgumentExceptionHandler(ModelAndView mav) {
        mav.addObject("error", "IllegalArgumentException  occured");
        mav.setViewName("error");
        return mav;
    }

    /**
     * Throwableのエラーハンドリング
     *
     * @param mav
     * @return
     */
    @ExceptionHandler(Throwable.class)
    public ModelAndView ThrowableHandler(ModelAndView mav) {
        mav.addObject("error", "Exceotion  occured");
        mav.setViewName("error");
        return mav;
    }
}

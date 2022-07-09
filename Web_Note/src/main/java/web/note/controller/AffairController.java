package web.note.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.note.perository.AffairsRepository;

@Controller
@RequiredArgsConstructor
public class AffairController {

    @Autowired
    private AffairsRepository affairsRepository;

//    @GetMapping("/affairs/delete")
//    public String deleteAffair(@RequestParam Long affairId){
//        System.out.println(affairId);
//
////        affairsRepository.deleteById(affairId);
//        return "redirect:/main";
//    }
}

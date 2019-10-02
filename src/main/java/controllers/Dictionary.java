package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.DictionaryService;

@Controller
public class Dictionary {
    @GetMapping("/translate")
    public String translate() {
        return "index";
    }
    @GetMapping("/dictionary")
    public String searchDictionary(@RequestParam String englishWord, Model model){
        DictionaryService dictionary = new DictionaryService();
        model.addAttribute("text", englishWord);
        model.addAttribute("result", dictionary.getValue(englishWord));
        if (dictionary.getValue(englishWord) != null){
            return "result";
        } else {
            return "notFound";
        }
    }
}

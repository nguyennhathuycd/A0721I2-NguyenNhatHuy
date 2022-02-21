package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Controller
public class DictionaryController {
    private static Map<String, String> map = new HashMap<String, String>();

    static {
        map.put("Hello", "Xin chao");
        map.put("Dog", "Con cho");
        map.put("Screen", "Man hinh");
        map.put("Table", "Ban");
        map.put("Television", "Ti vi");
        map.put("He", "Anh ay");
        map.put("She", "Co ay");
    }

    @GetMapping("/dictionary")
    public String show() {
        return "index";
    }

    @PostMapping("/dictionary")
    public String returnTranslateResult(@RequestParam("dictionary") String dictionary, Model model) {
        Set<String> set = map.keySet();
        for (String key: set) {
            if (key.equals(dictionary)) {
                model.addAttribute("result", map.get(key));
                return "index";
            }
        }
        model.addAttribute("result", "The dictionary could not be found");
        return "index";
    }
}

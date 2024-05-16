package ra.demo_joincolumn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.demo_joincolumn.dao.CategoryDAO;
import ra.demo_joincolumn.entity.Category;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryDAO categoryDAO;

    @GetMapping
    public String index(Model model){
        List<Category> categories = categoryDAO.getCategories();
        model.addAttribute("listCate",categories);
        return "category/index-category";
    }
}

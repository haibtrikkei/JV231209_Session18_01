package ra.demo_joincolumn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.demo_joincolumn.dao.ProductDAO;
import ra.demo_joincolumn.entity.Product;

import java.util.List;

@Controller
@RequestMapping(value ={ "/","/product"})
public class ProductController {
    @Autowired
    private ProductDAO productDAO;

    @GetMapping
    public String index(Model model){
        List<Product> products = productDAO.getProducts();
        model.addAttribute("list",products);
        return "list-product";
    }
}

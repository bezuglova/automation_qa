package lv.acodemy.step_definitions;

import io.cucumber.java.en.Given;
import lv.acodemy.page_object.ProductsPage;

public class ProductsPageSteps {
    private final ProductsPage productPage = new ProductsPage();

    @Given("user selects {string} product from a list")
    public void userSelectsProductFromAList(String productName) {
        productPage.clickOnProductByName(productName);


    }
}

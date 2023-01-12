Feature: to test the product search and add to cart functionality of bigbasket

  @regressionTest @smokeTest
  Scenario: to navigate to bigbasket page
    Given browser is launched
    And user navigates to "bigbasket_url" page
    Then assert "bigbasket_logo"

  @regressionTest
  Scenario: to add a product in a cart
    And Type product "product_1" in "search_box_locator"
    And Click on the "search_tab_locator" element
    And Click on "cauliflower_locator" with desired product
    And assert the "cauliflower_title" in "cauliflower_title_locator"
    And change the quantity to "cauliflower_quantity" in "cauliflower_quantity_locator"
    And Click on "addToBucket"
    And assert the text "added_successfully" in "added_successfully_locator"

  @smokeTest
  Scenario: to add a another product in a cart
    And user navigates to home "bigbasket_url" page
    And click on the "shop_by_category"
    And hover to "beverages_locator" and click
    And click on the "diet_coke_soft_drink"
    And change the quantity to "coke_quantity" in "coke_quantity_locator"
    And Click on "coke_addToBucket"

  @smokeTest @regressionTest
  Scenario: to view basket and checkout
    And Click on My Basket "My_Basket"
    Then Click view basket and checkout "view_basket_and_checkout"

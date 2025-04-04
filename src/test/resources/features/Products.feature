Feature: Product Search and Add to Bag
  @PT1
  Scenario: Search for a product and verify the product details in the bag
    Given the user is on the Home Screen
    And the user clicks on the Product Search Bar and enters product name in the search bar "chocolates"
    And the user clicks on the Search Icon
    Then the user adds the first item to the Bag
    And the user clicks on the Product Bag
    Then the user verifies the Product Name and Product Price in the Bag

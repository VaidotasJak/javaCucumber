Feature: Pet store create user api. Through this api we should be able to
  create/get/update/delete user.
  @runThis
  Scenario: User is successfully created with /user endpoint when valid payload is provided.
    Given Valid user payload is generated
    When post user method is called
    Then response is 200
    When user fetches new user with get request
#    And user is successfully created

  Scenario: post /user endpoint creates user successfully5
    Given Valid user payload is generated
    When post user method is called
    Then response is 200
Feature: Pet store create user api. Through this api we should be able to
  create/get/update/delete user.
  @runThis
  Scenario: User is successfully created with /user endpoint when valid payload is provided.
    Given Valid user payload is generated
    When post user method is called
    Then response is 200
    When user fetches new user with get request
    Then user is successfully created
  @runThis
  Scenario: User is successfully created with /user endpoint when valid payload is provided2.
    Given Valid user payload is generated
    When post user method is called
    Then response is 200
    When user fetches new user with get request
    Then user is successfully created
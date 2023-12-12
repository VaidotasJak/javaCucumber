Feature: Pet store create user api. Throught this api we should be able to
  create/get/update/delete user.

  Scenario: post user endpoint creates user successfully1
    Given Valid user payload is generated
    When post user method is called

  Scenario: post /user endpoint creates user successfully2
    Given Valid user payload is generated
    When post user method is called

  Scenario: post /user endpoint creates user successfully3
    Given Valid user payload is generated
    When post user method is called

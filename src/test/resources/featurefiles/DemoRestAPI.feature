import org.APIImplementationFramework.step.definitions.DemoRestAPI;

Feature: Verify the Email and Password

  Scenario Outline: Verify Rest API Post Call
    Given Create a User with "<url>"
    Then Response Code should be "<responseCode>"
    Examples:
      | url | responseCode |
      | /users | 201 |


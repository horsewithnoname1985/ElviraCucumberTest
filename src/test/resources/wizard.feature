Feature: Wizard writes the correct values to the system
  Scenario Outline: Correct flash parameters are set
    Given the wizard is launched
    When proper settings for <varnish>, <uv>, <backflash>, <throughflash> and <backside_traverse> are entered
    And these settings are submitted
    Then the correct corresponding values are written into the parameter files

    Examples:
    | varnish     | uv    | backflash | throughflash  | backside_traverse   |
    | varnish_YES | uv_NO | back_NO   | through_NO    | bt_no_traverse      |
    | varnish_YES | uv_NO | back_YES  | through_NO    | bt_normal           |
    | varnish_YES | uv_NO | back_YES  | through_YES   | bt_normal           |
    | varnish_YES | uv_YES| back_NO   | through_NO    | bt_no_traverse      |
    | varnish_YES | uv_YES| back_YES  | through_NO    | bt_normal           |
    | varnish_YES | uv_YES| back_YES  | through_YES   | bt_normal           |
    | varnish_NO  | uv_NO | back_NO   | through_NO    | bt_no_traverse      |
    | varnish_NO  | uv_NO | back_YES  | through_NO    | bt_normal           |
    | varnish_NO  | uv_NO | back_YES  | through_YES   | bt_normal           |
    | varnish_NO  | uv_YES| back_NO   | through_NO    | bt_no_traverse      |
    | varnish_NO  | uv_YES| back_YES  | through_NO    | bt_normal           |
    | varnish_NO  | uv_YES| back_YES  | through_YES   | bt_normal           |


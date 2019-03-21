$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "\nIn order to perform sucessful login\nAs a user\nI want to enter correct username and password",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@sanity"
    }
  ]
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 8,
      "value": "#Scenario: In order to verify login to facebook"
    },
    {
      "line": 9,
      "value": "#\t\tGiven user navigates to facebook website"
    },
    {
      "line": 10,
      "value": "#\t\tWhen  user validates the homepage title"
    },
    {
      "line": 11,
      "value": "#\t\tThen  user entered \"valid\" username"
    },
    {
      "line": 12,
      "value": "#\t\tAnd   user entered \"valid\" password"
    },
    {
      "line": 13,
      "value": "#\t  Then  user \"shouldbe\" succesfully logged in"
    },
    {
      "line": 15,
      "value": "#Scenario: In order to verify login to facebook as Invalid user"
    },
    {
      "line": 16,
      "value": "#\t\tGiven user navigates to facebook website"
    },
    {
      "line": 17,
      "value": "#\t\tWhen  user validates the homepage title"
    },
    {
      "line": 18,
      "value": "#\t\tThen  user entered \"invalid\" username"
    },
    {
      "line": 19,
      "value": "#\t\tAnd   user entered \"invalid\" password"
    },
    {
      "line": 20,
      "value": "#\t  Then  user \"shouldnot\" succesfully logged in"
    },
    {
      "line": 22,
      "value": "# -------------------------------------------"
    },
    {
      "line": 24,
      "value": "#Scenario Outline: In order to verify login to facebook as Invalid user"
    },
    {
      "line": 25,
      "value": "#\t\tGiven user navigates to facebook website"
    },
    {
      "line": 26,
      "value": "#\t\tWhen  user validates the homepage title"
    },
    {
      "line": 27,
      "value": "#\t\tThen  user entered \"\u003cusername\u003e\" username"
    },
    {
      "line": 28,
      "value": "#\t\tAnd   user entered \"\u003cpassword\u003e \" password"
    },
    {
      "line": 29,
      "value": "#\t  Then  user \"\u003clogiType\u003e\" succesfully logged in"
    },
    {
      "line": 30,
      "value": "#"
    },
    {
      "line": 31,
      "value": "#Examples:"
    },
    {
      "line": 32,
      "value": "#\t\t| username | password | logiType |"
    },
    {
      "line": 33,
      "value": "#\t\t| validUserName | validPassword | shouldbe |"
    },
    {
      "line": 34,
      "value": "#\t\t| invalidUserName | invalidPassword | shouldnot |"
    },
    {
      "line": 36,
      "value": "# -------------------------------------------"
    }
  ],
  "line": 38,
  "name": "In order to verify login to facebook as Invalid user",
  "description": "",
  "id": "login;in-order-to-verify-login-to-facebook-as-invalid-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 39,
  "name": "user navigates to facebook website",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "user validates the homepage title",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "user entered \"\u003cusername\u003e\" username",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "user entered \"\u003cpassword\u003e \" password",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user select the age category",
  "rows": [
    {
      "cells": [
        "Age",
        "Location"
      ],
      "line": 44
    },
    {
      "cells": [
        "below 18",
        "India"
      ],
      "line": 45
    },
    {
      "cells": [
        "above 18",
        "USA"
      ],
      "line": 46
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "user \"\u003clogiType\u003e\" succesfully logged in",
  "keyword": "Then "
});
formatter.examples({
  "line": 49,
  "name": "",
  "description": "",
  "id": "login;in-order-to-verify-login-to-facebook-as-invalid-user;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "logiType"
      ],
      "line": 50,
      "id": "login;in-order-to-verify-login-to-facebook-as-invalid-user;;1"
    },
    {
      "cells": [
        "validUserName",
        "validPassword",
        "shouldbe"
      ],
      "line": 51,
      "id": "login;in-order-to-verify-login-to-facebook-as-invalid-user;;2"
    },
    {
      "cells": [
        "invalidUserName",
        "invalidPassword",
        "shouldnot"
      ],
      "line": 52,
      "id": "login;in-order-to-verify-login-to-facebook-as-invalid-user;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 207166,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "In order to verify login to facebook as Invalid user",
  "description": "",
  "id": "login;in-order-to-verify-login-to-facebook-as-invalid-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "user navigates to facebook website",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "user validates the homepage title",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "user entered \"validUserName\" username",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "user entered \"validPassword \" password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user select the age category",
  "rows": [
    {
      "cells": [
        "Age",
        "Location"
      ],
      "line": 44
    },
    {
      "cells": [
        "below 18",
        "India"
      ],
      "line": 45
    },
    {
      "cells": [
        "above 18",
        "USA"
      ],
      "line": 46
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "user \"shouldbe\" succesfully logged in",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_navigates_to_facebook_website()"
});
formatter.result({
  "duration": 117134539,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_validates_the_homepage_title()"
});
formatter.result({
  "duration": 42875,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "validUserName",
      "offset": 14
    }
  ],
  "location": "LoginSteps.user_entered_valid_username(String)"
});
formatter.result({
  "duration": 1785536,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "validPassword ",
      "offset": 14
    }
  ],
  "location": "LoginSteps.user_entered_valid_password(String)"
});
formatter.result({
  "duration": 87903,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_select_the_age_category(DataTable)"
});
formatter.result({
  "duration": 806497,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shouldbe",
      "offset": 6
    }
  ],
  "location": "LoginSteps.user_succesfully_logged_in(String)"
});
formatter.result({
  "duration": 96852,
  "status": "passed"
});
formatter.after({
  "duration": 77196,
  "status": "passed"
});
formatter.before({
  "duration": 75346,
  "status": "passed"
});
formatter.scenario({
  "line": 52,
  "name": "In order to verify login to facebook as Invalid user",
  "description": "",
  "id": "login;in-order-to-verify-login-to-facebook-as-invalid-user;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "user navigates to facebook website",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "user validates the homepage title",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "user entered \"invalidUserName\" username",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "user entered \"invalidPassword \" password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user select the age category",
  "rows": [
    {
      "cells": [
        "Age",
        "Location"
      ],
      "line": 44
    },
    {
      "cells": [
        "below 18",
        "India"
      ],
      "line": 45
    },
    {
      "cells": [
        "above 18",
        "USA"
      ],
      "line": 46
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "user \"shouldnot\" succesfully logged in",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_navigates_to_facebook_website()"
});
formatter.result({
  "duration": 45019,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_validates_the_homepage_title()"
});
formatter.result({
  "duration": 44435,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "invalidUserName",
      "offset": 14
    }
  ],
  "location": "LoginSteps.user_entered_valid_username(String)"
});
formatter.result({
  "duration": 86350,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "invalidPassword ",
      "offset": 14
    }
  ],
  "location": "LoginSteps.user_entered_valid_password(String)"
});
formatter.result({
  "duration": 78284,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_select_the_age_category(DataTable)"
});
formatter.result({
  "duration": 123032,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shouldnot",
      "offset": 6
    }
  ],
  "location": "LoginSteps.user_succesfully_logged_in(String)"
});
formatter.result({
  "duration": 83879,
  "status": "passed"
});
formatter.after({
  "duration": 41966,
  "status": "passed"
});
formatter.uri("LoginIntoProd.feature");
formatter.feature({
  "line": 2,
  "name": "Login to Production",
  "description": "\nIn order to perform sucessful login to production\nAs a user\nI want to enter correct username and password",
  "id": "login-to-production",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@loginProd"
    }
  ]
});
formatter.before({
  "duration": 83281,
  "status": "passed"
});
formatter.background({
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "user navigates to facebook website",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user validates the homepage title",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_navigates_to_facebook_website()"
});
formatter.result({
  "duration": 56330,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_validates_the_homepage_title()"
});
formatter.result({
  "duration": 57695,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "In order to verify login to facebook production",
  "description": "",
  "id": "login-to-production;in-order-to-verify-login-to-facebook-production",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "user entered \"valid\" username",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user entered \"valid\" password",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user validate the captcha image",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user \"shouldbe\" succesfully logged in",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 14
    }
  ],
  "location": "LoginSteps.user_entered_valid_username(String)"
});
formatter.result({
  "duration": 102641,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 14
    }
  ],
  "location": "LoginSteps.user_entered_valid_password(String)"
});
formatter.result({
  "duration": 96988,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_validate_the_captcha_image()"
});
formatter.result({
  "duration": 68989,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shouldbe",
      "offset": 6
    }
  ],
  "location": "LoginSteps.user_succesfully_logged_in(String)"
});
formatter.result({
  "duration": 114058,
  "status": "passed"
});
formatter.after({
  "duration": 53324,
  "status": "passed"
});
formatter.before({
  "duration": 67355,
  "status": "passed"
});
formatter.background({
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "user navigates to facebook website",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user validates the homepage title",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_navigates_to_facebook_website()"
});
formatter.result({
  "duration": 50690,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_validates_the_homepage_title()"
});
formatter.result({
  "duration": 53574,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "In order to verify login to facebook production",
  "description": "",
  "id": "login-to-production;in-order-to-verify-login-to-facebook-production",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "user entered \"invalid\" username",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user entered \"invalid\" password",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user validate the captcha image",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user \"shouldnot\" succesfully logged in",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "invalid",
      "offset": 14
    }
  ],
  "location": "LoginSteps.user_entered_valid_username(String)"
});
formatter.result({
  "duration": 99717,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "invalid",
      "offset": 14
    }
  ],
  "location": "LoginSteps.user_entered_valid_password(String)"
});
formatter.result({
  "duration": 102169,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_validate_the_captcha_image()"
});
formatter.result({
  "duration": 52066,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shouldnot",
      "offset": 6
    }
  ],
  "location": "LoginSteps.user_succesfully_logged_in(String)"
});
formatter.result({
  "duration": 95528,
  "status": "passed"
});
formatter.after({
  "duration": 49938,
  "status": "passed"
});
});
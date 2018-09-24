package org.chase.springtimerecording.test

import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification

class AbstractSpec extends Specification{
    @Autowired
    UserFixtures userFixtures

    @Autowired
    DatabaseActor databaseActor

     setup() {
         userFixtures.values()*{databaseActor.insertUser(it)}
     }

}

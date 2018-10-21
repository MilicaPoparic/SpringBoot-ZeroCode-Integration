package com.xp.springboot.integrationtest;

import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.domain.TestPackageRoot;
import org.junit.runner.RunWith;

import com.xp.springboot.application.E2eJunitSuiteRunner;

/**
 * This runs the entire test suite i.e. picking all tests under "resources/integration_tests"
 * folder and sub-folders.
 *
 * To run individual tests, go to the corresponding package and run the test as JUnit
 * e.g. go to individual test cases >> get, put etc under "src/test/java/integrationtests"
 * and run-
 *      - integrationtests.TestGetOperations.java
 *      - integrationtests.TestPatchOperations.java
 *      - integrationtests.TestPostAndThenGetOperation.java
 *      - integrationtests.TestPostOperation.java
 */
@TargetEnv("application_host.properties")
@TestPackageRoot("integration_tests") //picks all tests from this folder and subfolders
@RunWith(E2eJunitSuiteRunner.class)
public class IntegrationTestSuite {

}

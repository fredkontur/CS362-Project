/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import junit.framework.TestCase;





/**
 * Performs Validation Test for url validations.
 *
 * @version $Revision: 1128446 $ $Date: 2011-05-27 13:29:27 -0700 (Fri, 27 May 2011) $
 */
public class UrlValidatorTest extends TestCase {

   private boolean printStatus = false;
   private boolean printIndex = false;//print index that indicates current scheme,host,port,path, query test were using.

   public UrlValidatorTest(String testName) {
      super(testName);
   }

   
   
   public void testManualTest()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   String testURL;
	   boolean expected_res;
	   
	   testURL = "www.amazon.com";
	   expected_res = false;
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   testURL = "http://www.amazon.com";
	   expected_res = true;
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   testURL = "https://mail.google.com/mail/u/0/#inbox";
	   expected_res = true;
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   testURL = "http://www.test.com";
	   expected_res = true;
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   testURL = "http://www.test.ad";
	   expected_res = true;
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   testURL = "http://www.test.nz";
	   expected_res = true;
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   testURL = "http://www.test.in";
	   expected_res = true;
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   testURL = "http://www.test.jp";
	   expected_res = true;
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   testURL = "http://www.test.om";
	   expected_res = true;
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   testURL = "http://www.example.com/file[/].html";
	   expected_res = false;
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   testURL = "http://mw1.google.com/mw-earth-vectordb/kml-samples/gp/seattle/gigapxl/$[level]/r$[y]_c$[x].jpg";
	   expected_res = false;
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   testURL = "http://api.google.com/q?exp=a|b";
	   expected_res = true;
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   testURL = "http://api.google.com/q?exp=a%7Cb";
	   expected_res = true;
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   testURL = "https://en.wikipedia.org/wiki/Möbius_strip";
	   expected_res = true;
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   testURL = "https://zh.wikipedia.org/wiki/Wikipedia:关于中文维基百科/en";
	   expected_res = true;
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   testURL = "http://www.w3.org/TR/html5/links.html#attr-hyperlink-href";
	   expected_res = true;
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   testURL = "http://www.test.com/%20try";
	   expected_res = true;
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   testURL = "http://zh.wikipedia.org";
	   expected_res = true;
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   testURL = "http://255.255.255.255";
	   expected_res = true;
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   testURL = "http://355.255.255.255";
	   expected_res = false;
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   testURL = "https://msdn.microsoft.com/en-us/library/aa752574(VS.85).aspx";
	   expected_res = true;
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   testURL = "http://www.google.com:80";
	   expected_res = true;
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   testURL = "http://www.google.com/test$";
	   expected_res = true;
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   testURL = "http://aip.scitation.org/doi/10.1063/1.4981228";
	   expected_res = true;
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   testURL = "http://travel.state.gov/content/passports/en/passports.html";
	   expected_res = true;
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
   }
   
   // valid scheme and valid host
   public void testFirstPartition()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   String testURL;
	   boolean expected_res = true;
	   
	   // First Test
	   testURL = "http://www.yahoo.com";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   // Second test
	   testURL = "https://oregonstate.edu";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   // Third test
	   testURL = "ftp://www.test.nz";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
   }

// valid scheme, valid host, and valid port number
   public void testSecondPartition()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   String testURL;
	   boolean expected_res = true;
	   
	   // First Test
	   testURL = "https://www.yahoo.com:80";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   // Second test
	   testURL = "http://oregonstate.edu:2540";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   // Third test
	   testURL = "ftp://www.test.nz:24";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
   }
   
// valid scheme, valid host, and valid query
   public void testThirdPartition()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   String testURL;
	   boolean expected_res = true;
	   
	   // First Test
	   testURL = "https://www.yahoo.com?result=true";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   // Second test
	   testURL = "http://oregonstate.edu?name=bill&location=canada";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   // Third test
	   testURL = "ftp://www.test.nz?state=west%20virginia";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
   }
   
// valid scheme, valid host, valid port number, and valid query
   public void testFourthPartition()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   String testURL;
	   boolean expected_res = true;
	   
	   // First Test
	   testURL = "https://oregonstate.edu:80?state=west%20virginia";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   // Second test
	   testURL = "ftp://www.yahoo.com:2540?result=true";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   // Third test
	   testURL = "http://www.test.nz:24?name=harold&location=canada";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
   }
 
   // valid scheme, valid host, and valid path
   public void testFifthPartition()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   String testURL;
	   boolean expected_res = true;
	   
	   // First Test
	   testURL = "https://www.yahoo.com/page.html";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   // Second test
	   testURL = "ftp://oregonstate.edu/left.right.4destination";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   // Third test
	   testURL = "http://www.test.nz/index";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
   }
   
   // valid scheme, valid host, valid port number, and valid path
   public void testSixthPartition()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   String testURL;
	   boolean expected_res = true;
	   
	   // First Test
	   testURL = "ftp://www.yahoo.com:1540/page.html";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   // Second test
	   testURL = "https://oregonstate.edu:68/left.right.4destination";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   // Third test
	   testURL = "http://www.try.ca:20/index";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
   }
   
   // valid scheme, valid host, valid path, and valid query
   public void testSeventhPartition()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   String testURL;
	   boolean expected_res = true;
	   
	   // First Test
	   testURL = "http://www.yahoo.com/page.html?result=true";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   // Second test
	   testURL = "https://oregonstate.edu/index?name=bill&location=canada";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   // Third test
	   testURL = "ftp://www.test.org/left.right.4destination?state=west%20virginia";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
   }
   
   // valid scheme, valid host, valid port number, valid path, and valid query
   public void testEighthPartition()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   String testURL;
	   boolean expected_res = true;
	   
	   // First Test
	   testURL = "http://www.free.org:55/page.html?result=true";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   // Second test
	   testURL = "https://oregonstate.edu:234/index?name=bill&location=canada";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   // Third test
	   testURL = "ftp://www.aa.com:9782/left.right.4destination?state=west%20virginia";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
   }
   
   // URL with only a valid scheme and no other parts
   public void testNinthPartition()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   String testURL;
	   boolean expected_res = false;
	   
	   // First Test
	   testURL = "http://";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   // Second test
	   testURL = "https://";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   // Third test
	   testURL = "ftp://";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
   }
   
   // URL with 1 invalid part and the rest of the parts valid
   public void testTenthPartition()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   String testURL;
	   boolean expected_res = false;
	   
	   // First Test
	   testURL = "http://www.free.org:port55/page.html";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   // Second test
	   testURL = "httpsoregonstate.edu:234/index?name=bill&location=canada";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   // Third test
	   testURL = "ftp://www.aa.com:9782/ check.html";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
   }
   
   // URL with 2 invalid parts and the rest of the parts valid
   public void testEleventhPartition()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   String testURL;
	   boolean expected_res = false;
	   
	   // First Test
	   testURL = "2pf://www.free.cl:55/page.html(?)result=true";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   // Second test
	   testURL = "https://oregonstate.aeb:234/test/.../result";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   // Third test
	   testURL = "ftp://www.aa.com:9782//left.right.4destination..?state=west%20virginia";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
   }
   
   // URL with 3 invalid parts and the rest of the parts valid
   public void testTwelfthPartition()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   String testURL;
	   boolean expected_res = false;
	   
	   // First Test
	   testURL = "kfdshfksueriib:55/ page.html";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   // Second test
	   testURL = "https://oregonstate.aeb:234g/result..?name=bill&location=canada";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   // Third test
	   testURL = "8hy://www.aa.com::80/test/.../result";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
   }
   
   // URL with 4 invalid parts and the remaining part valid
   public void testThirteenthPartition()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   String testURL;
	   boolean expected_res = false;
	   
	   // First Test
	   testURL = "kfdshfksueriib:port55/ page.html?color=red";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   // Second test
	   testURL = "https://oregonstate.aeb:234g/ result..?name=bill&location=canada";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   // Third test
	   testURL = "8hy://(wikipedia).com::80/test/.../result(?)tree=oak";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
   }
   
   // URL with all parts invalid
   public void testFourteenthPartition()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   String testURL;
	   boolean expected_res = false;
	   
	   // First Test
	   testURL = "kfdshfksueriibhuivbwojoveoj";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   // Second test
	   testURL = "httpsstore.sto::34/ index(?)furniture=chair";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
	   
	   // Third test
	   testURL = "http:///market).com:port80/test/.../result..?food=french%20fries";
	   System.out.println("URL: " + testURL);
	   System.out.println("Result: " + urlVal.isValid(testURL) + "; Should be: " + expected_res);
	   if(urlVal.isValid(testURL) != expected_res) {
		   System.out.println("MISMATCH");
	   }
	   System.out.println();
   }
   
   public void testIsValid()
   {
	   for(int i = 0;i<10000;i++)
	   {
		   
	   }
   }
   
   public void testAnyOtherUnitTest()
   {
	   
   }
   /**
    * Create set of tests by taking the testUrlXXX arrays and
    * running through all possible permutations of their combinations.
    *
    * @param testObjects Used to create a url.
    */
   

}

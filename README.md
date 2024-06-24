REPORT FOR ASSIGNMENT 1

##Project Chosen

Name: Spotify Web Api Wrapper

URL: https://github.com/jzheng2017/spotify-web-api-wrapper

Number of Lines of code: ...

The tool used to Count Lines: Lizard

Programming Language: Java

##Coverage Measurement 

We used the integrated IntelliJ Idea Code Coverage tool 

Initial code coverage: 

<img width="473" alt="original coverage" src="https://github.com/Ronin0105/spotify-web-api-wrapper/assets/122223981/0019e384-4e1f-4290-abfe-9b4f2ea24e63">

<Jakub Kavan (vu\jka246)>

##Own Coverage Tool

  Function name: setURI

  Two links to the commits where I wrote the instrumentation: https://github.com/Ronin0105/spotify-web-api-wrapper/commit/293d17950757da0236f751f1dfdf15b0e41d89b6#diff-02055024f5b91b41a5f4795e7202e151e014b275f51b8e4dc51e47b60e59ce45 and https://github.com/Ronin0105/spotify-web-api-wrapper/commit/b414b6b30f4a347f25de2120994efc5e406d4c56#diff-02055024f5b91b41a5f4795e7202e151e014b275f51b8e4dc51e47b60e59ce45

  ScreenShots:

  When running a test does not enter the conditional statement:
  
  <img width="526" alt="URI-test-false" src="https://github.com/Ronin0105/spotify-web-api-wrapper/assets/122223981/992d1947-e368-4d24-bb24-306144f20d78">

  When running a test does enter the conditional statement:
  
  <img width="531" alt="URI-test-true" src="https://github.com/Ronin0105/spotify-web-api-wrapper/assets/122223981/9992390f-8fe9-4080-b9dd-66b61dfc2c60">

  Function name: Deserialize 

  The link to the commit where I wrote the instrumentation: https://github.com/Ronin0105/spotify-web-api-wrapper/commit/293d17950757da0236f751f1dfdf15b0e41d89b6#diff-4bbd22074ae4a80acc5081cb4182653ed70352afce11f07644f648975a937ca2

  ScreenShots:

  When running a test does not enter the conditional statement:
  
  <img width="530" alt="Deserialize-false" src="https://github.com/Ronin0105/spotify-web-api-wrapper/assets/122223981/13725fbc-61e1-42d8-b7ee-aa5e8d0e735b">


  When running a test does enter the conditional statement:
  
  <img width="539" alt="Deserialize-true" src="https://github.com/Ronin0105/spotify-web-api-wrapper/assets/122223981/76489277-7d4c-455f-83de-c207cb737b43">

<Milan>
  
 Function name: 

  The link to the commit where I wrote the instrumentation:

  ScreenShots:

  When running a test does not enter the conditional statement:
  
  When running a test does enter the conditional statement:
  

<Toprak>
  
 Function name: setPosition

  The link to the commit where I wrote the instrumentation:

  ScreenShots: https://github.com/jzheng2017/spotify-web-api-wrapper/commit/8e28553ef93508871c0ebb223c4e601762939c25

  When running a test does not enter the conditional statement: 
  <img width="1323" alt="Screenshot 2024-06-25 at 00 26 17" src="https://github.com/Ronin0105/spotify-web-api-wrapper/assets/121942362/cebd6918-431e-4371-8b5f-b1505505d24f">
  
  When running a test does enter the conditional statement:
  <img width="845" alt="Screenshot 2024-06-25 at 00 25 45" src="https://github.com/Ronin0105/spotify-web-api-wrapper/assets/121942362/367ba772-26dc-498d-b0e1-0e46fed96caf">


Function name:  checkErrorBody

The link to the commit where I wrote the instrumentation: https://github.com/Ronin0105/spotify-web-api-wrapper/commit/4863443ed6569ca4615f42f03c43a735ecc745c5 and https://github.com/jzheng2017/spotify-web-api-wrapper/commit/3d1d5b82a342618e40c8e502aadf98e59b615105#diff-ed5a31847df0613bf3010979f21d841820ee0dd74f634ce89e8f1082f0c82869

ScreenShots: <img width="1321" alt="instrumentation #2" src="https://github.com/Ronin0105/spotify-web-api-wrapper/assets/121942362/d1229783-4659-4847-8897-0cd13a91f7d7">

<Can>

 Function name: 

  The link to the commit where I wrote the instrumentation:

  ScreenShots:

  When running a test does not enter the conditional statement:
  
  When running a test does enter the conditional statement:
  
##Individual Tests

<Jakub Kavan (vu\jka246)>

  The coverage results shown are specific to each class to demonstrate the code coverage change in a vacuum 

  Test for setURI:

  Link to commit: https://github.com/Ronin0105/spotify-web-api-wrapper/commit/34d147b0355a860f89e1a3a5cedb06df1cdd27aa
  
  Coverage Results Before Test Implementation:

  <img width="465" alt="branchCovg-uri-before" src="https://github.com/Ronin0105/spotify-web-api-wrapper/assets/122223981/5f075a5f-a49b-4f28-ac7a-253cf492072a">

  Coverage Results After Test Implementation:

  <img width="464" alt="coverage-uri-post" src="https://github.com/Ronin0105/spotify-web-api-wrapper/assets/122223981/163eba2f-2c16-40c5-adb9-35108d956e2c">

  Reason For Coverage Improvement: The whole Offset class was not tested at all, my teammate and I split the class, where I did the setURI and the reason for the improvement was that the created test was checking whether an error "if" statement was hit and then if the program threw the correct error message.

  Test for Deserialize:

  Link to commit: [https://github.com/Ronin0105/spotify-web-api-wrapper/commit/34d147b0355a860f89e1a3a5cedb06df1cdd27aa](https://github.com/Ronin0105/spotify-web-api-wrapper/commit/b414b6b30f4a347f25de2120994efc5e406d4c56)
  
  Coverage Results Before Test Implementation:

  <img width="466" alt="coverage-deser-pre" src="https://github.com/Ronin0105/spotify-web-api-wrapper/assets/122223981/b9ee89aa-7a2f-4546-9715-6ab4f595787f">

  Coverage Results After Test Implementation:

  <img width="469" alt="coverage-deser-post" src="https://github.com/Ronin0105/spotify-web-api-wrapper/assets/122223981/af0d6600-506d-421f-b9a4-c983450ccee1">

  Reason For Coverage Improvement: The coverage increased after adding the test as there was no testing for the condition where either the "if" or the "else if" did not hit, meaning that the invisible "else" statement was not tested for. As a result the test simply consisted of checking whether the final value of the variable stayed NULL.
  
<Milan>

  Test for ...:

  Link to commit: 
  
  Coverage Results Before Test Implementation:

  Coverage Results After Test Implementation:

  Reason For Coverage Improvement: 

<Toprak>

  Test for setPosition:

  Link to commit: https://github.com/jzheng2017/spotify-web-api-wrapper/commit/8e28553ef93508871c0ebb223c4e601762939c25
  
  Coverage Results Before Test Implementation: 
  <img width="863" alt="Before - Offset" src="https://github.com/Ronin0105/spotify-web-api-wrapper/assets/121942362/f5b165a7-694f-4e45-b1dd-db6b047a90ab">

  Coverage Results After Test Implementation:   
  <img width="464" alt="coverage-uri-post" src="https://github.com/Ronin0105/spotify-web-api-wrapper/assets/122223981/163eba2f-2c16-40c5-adb9-35108d956e2c">


  Reason For Coverage Improvement: This class had no test suite meaning there was no checks for the if clauses and how they interacted; so I decided to create a test file to do so. It checked code coverage for setPosition method. I later on added existing method for setPosition.

  Test for checkErrorBody:

  Link to commit: https://github.com/jzheng2017/spotify-web-api-wrapper/commit/3d1d5b82a342618e40c8e502aadf98e59b615105
  
  Coverage Results Before Test Implementation: <img width="655" alt="Before - Response" src="https://github.com/Ronin0105/spotify-web-api-wrapper/assets/121942362/401d0ce9-e63d-4f9f-b490-3b795b5779e1">


  Coverage Results After Test Implementation: <img width="646" alt="After - Response" src="https://github.com/Ronin0105/spotify-web-api-wrapper/assets/121942362/a63fecf7-11cd-462c-ac6a-38f72318c55c">


  Reason For Coverage Improvement: The reason I added coverage was the sole reason that spotifyError == null, which did not necessarily cover the if clause when error code 400 is thrown. I added a method that virtually creates a variable that has 400 status code thrown and then checked it with the correspondent error that is thrown on the method.

<Can>
  
  Test for ...:

  Link to commit: 
  
  Coverage Results Before Test Implementation:

  Coverage Results After Test Implementation:

  Reason For Coverage Improvement: 

##Overall 

Original Coverage:

<img width="473" alt="original coverage" src="https://github.com/Ronin0105/spotify-web-api-wrapper/assets/122223981/1d03ec83-2354-408d-aec6-97186dc5b73e">

Coverage Post Implementation: 

<img width="477" alt="coverage post-implementation" src="https://github.com/Ronin0105/spotify-web-api-wrapper/assets/122223981/d148f3aa-bb09-4327-bad7-b542230336a3">

##Statement of Individual Contribution

Jakub Kavan - I singularly worked on the AbstractPlayableObjectDeserializer class and created a test to complete its coverage to 100%. Then in the Offset class, a teammate and I worked on it together, where I tested the error conditions and finished the tests increasing the coverage by 50%. Additionally, I worked and created the structure for the Readme file so that my teammates would have an easier time writing their evaluations. Overall the communication and cooperation between the team was great.

Sarp Toprak Birben - I worked on ResponseChecker and PlaylistApiRetrofit, although I have added coverage & instrumentation to the class, responseChecker. I could not add any improvement to the coverage, and then later on I completed ResponseChecker. For the other code improvement, I worked with my teammate on Offset class where we took on two different methods and increased its coverage and added instrumentation.




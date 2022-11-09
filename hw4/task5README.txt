Output: 
85
31
Website https://bleacherreport.com/nfl is over 50 chars
Website https://bleacherreport.com/college-football is over 50 chars
Website https://bleacherreport.com/nba is over 50 chars
Website https://bleacherreport.com/mlb is over 50 chars
Website https://bleacherreport.com/nfl is over 50 chars
Website https://bleacherreport.com/nhl is over 50 chars
Website https://bleacherreport.com/college-football is over 50 chars
Website https://bleacherreport.com/nba is over 50 chars
Website https://www.turnerjobs.com/search-jobs?orgIds=1174&amp;ac=19299 is over 50 chars
Website https://bleacherreport.com/world-football is over 50 chars
Website https://bleacherreport.com/college-football is over 50 chars
Website https://bleacherreport.com/nhl is over 50 chars
Website https://bleacherreport.com/mlb is over 50 chars
Website https://bleacherreport.com/nba is over 50 chars
Website https://bleacherreport.com/nfl is over 50 chars
Website https://www.turnerjobs.com/search-jobs?orgIds=1174&amp;ac=19299 is over 50 chars
Website https://bleacherreport.com/mlb is over 50 chars
Website https://bleacherreport.com/world-football is over 50 chars
Total exec time for Parallel is 17130
Tadaaa total number of the images Parallelly in the selected url and urls of this webpage is 94323
Tadaaa total number of the images Sequentially in the selected url and urls of this webpage is 94323


Task5 all parts for hw4 Scala.

Write a Scala program which takes a webpage url (say x) from the user
(or as a parameter), and then download webpage x. Count the number of images (i.e. "<img .../>") and
scripts (i.e. "<script ...> </script>") present in x. As an example, url x can be "https://www.cnn.com".
(8 points) 

 Part of Hw4c Say the webpage of url x contains links to other webpages which we
denote by y, i.e., y is a set of (zero, one, or more) webpages. Your program needs to download all such
webpages (i.e. x as well as y). Count the total number of images on x and y. See Figure 1.

 Part of Hw4c Also, your program needs to count how many webpages (found in Task
5b) have more than 50 characters.

 Part of Hw4c Do Task 5b again, but now you are using the par (i.e. parallel collection).
How much time does the concurrency usage save compared to the serial run in Task 5b?

 - To answer the question, by doing a par run it saved about 1000 more milli, according to
the difference of the Seq time run result and the parallel time run result.
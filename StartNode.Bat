cd\
cd C:\Selenium\Libs
java -Dwebdriver.chrome.driver=C:\Selenium\Drivers\chromedriver.exe -jar selenium-server-standalone-3.0.1.jar -role webdriver -hub http://localhost:4444/grid/register -port 5561 -browser browserName=chrome,maxInstances=6,maxSession=6
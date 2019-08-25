set path=%path%;C:\Program Files\Java\jdk1.8.0_101\bin
cd C:\Selenium\workspace\PC
mvn test -DsuiteFile="TestNGRemote.xml"
timeout 20

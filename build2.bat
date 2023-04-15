cd framework
    javac -d . FrontServlet.java
    javac -d . Mapping.java
    javac -d . url.java
    javac -d .  ModelView.java
    @REM javac -d . *.java
    jar -cf fw.jar .
    copy fw.jar "D:\Devoirs\MrNaina\framework1\test-framework\WEB-INF\lib"

cd ..

cd test-framework/
    jar -cf test-servlet.war *
    copy "test-servlet.war" "C:\Program Files\Apache Software Foundation\Tomcat 10.0\webapps\test-framework.war"
cd ..



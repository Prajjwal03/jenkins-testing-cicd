REM todo need to work on it
SET tomcat_home=D:\smbc\dfx\2\tomcat\6.0.36\
SET project_home=D:\smbc\dfx\2\svn\EpixTreasuryApp\
SET project_name=EPIXTreasuryApp

call mvn clean package -DskipTests

del %tomcat_home%webapps\%project_name%.war
IF EXIST %tomcat_home%webapps\%project_name% RMDIR /S /Q %tomcat_home%webapps\%project_name% 
xcopy /s %project_home%target\%project_name%.war %tomcat_home%webapps\

PAUSE

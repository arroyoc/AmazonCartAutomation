# AmazonCartAutomation

### Prerequisites

Step 1.
```
Install java jdk
	- From https://www.oracle.com/technetwork/java/javase/downloads/index.html

```
Step 2.
```
Create a JAVA_HOME system variable
	- System variables > new > Variable name: JAVA_HOME > Variable value: path/to/jdk

```
Step 3.
```
Install Apache Maven
	- From https://maven.apache.org/download.cgi install Binary zip archive

```
Step 4.
```
Create MAVEN_HOME and M2_HOME system variables
	- System variables > new > Variable name: MAVEN_HOME > Variable value: path/to/apache-maven
	- System variable > new > Variable name: M2_HOME > Variable value: path/to/apache-maven
	- Edit System PATH > New > %M2_HOME%\bin

```
Step 5. (If not running web tests SKIP this step)
```
Install Chrome driver
From http://chromedriver.chromium.org/downloads
```
Step 6. (If not running web tests SKIP this step)
```
Add chromedriver.exe to your system path
	- Edit system path > new > path/to/chromedriver.exe

```
Step 7.
```
Install Android Studio
From https://developer.android.com/studio/
```
Step 8.
```
Create ANDROID_HOME system variable and add android tools to system PATH
	- System variables > new > Variable name: ANDROID_HOME > Variable value: path/to/android/sdk
	- Edit system path > New > path/to/sdk/tools
	- Edit system path > New > path/to/sdk/platform-tools

```
Step 9.
```
Install Intellij Idea
	- From https://www.jetbrains.com/idea/download/

```
Step 10. Install appium
```
Install node.js
Open Node.js command prompt
Type: `npm install -g appium`
Check appium version with: `appium -v`
```

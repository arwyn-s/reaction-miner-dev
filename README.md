# Reaction Miner.

### Pre-requisites
Install [JDK 11](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html) or greater and set the `JAVA_HOME` path variable
Install [apache maven](https://maven.apache.org/download.cgi)
Install [git](https://git-scm.com/downloads)

#### Linux platforms

check java version.
```
$ java -version
java version "13.0.1" 2019-10-15
Java(TM) SE Runtime Environment (build 13.0.1+9)
Java HotSpot(TM) 64-Bit Server VM (build 13.0.1+9, mixed mode, sharing)
```
set JAVA_HOME path variable.
add following to .bashrc in home directory.
`export JAVA_HOME=/path/to/jdk/jdk-11.0+`
save and exit. apply changes with
`$ source .bashrc`
check JAVA_HOME
```
$ echo $JAVA_HOME
/usr/lib/jvm/jdk-13.0.1
```
check maven.
```
$ mvn -version
Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
Maven home: /opt/apache-maven-3.6.3
Java version: 13.0.1, vendor: Oracle Corporation, runtime: /usr/lib/jvm/jdk-13.0.1
Default locale: en_GB, platform encoding: UTF-8
OS name: "linux", version: "5.0.0-37-generic", arch: "amd64", family: "unix"
```
-----
### Basic usage.

download repository as zip from [github](https://github.com/arwyn-s/reaction-miner-dev.git) or 
clone with 
`$ git clone https://github.com/arwyn-s/reaction-miner-dev.git`

inside the folder (where there is a file pom.xml) run.

`$ mvn clean javafx:run`
 
 to open an interactive window.


 ### Developer Notes.
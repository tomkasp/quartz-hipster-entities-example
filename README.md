# quartz-hipster-entities example project

------------------------------------------------------

This project is an example how you can use quartz-hipster-entities library within your project. 
It's a simple spring 4 MVC application. 

## How to run quartz hipster entities in your project step by step. 

* Add a dependency to your project

```xml
<dependency>
    <groupId>com.tomkasp</groupId>
    <artifactId>quartz-hipster-entities</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```
        
* Enable library in your project with @EnableQuartzHipster annotation. Remember that you need to enable it on the 
spring configuration class: 

```java
@Configuration
@EnableWebMvc
@EnableQuartzHipster
public class AppConfiguration {
}
```

When you have those two elements in place next thing which you need to do is to add some Quartz configuration to your project.
Basically Quartz Hipster Library contains main configuration for the Quartz which is SchedulerBean what you need to add
is a quartz.property file (sample file you can find under resource directory) with property definition for Quartz. 
Don't forget to add there also a property org.quartz.scheduler.name - This is compulsory thing which the library requires. 
When the property file is in place don't forget to create triggers and job for your app. 
Sample configuration you can find here: [Quartz config example](https://github.com/tomkasp/quartz-hipster-entities/blob/master/src/main/java/com/tomkasp/config/QuartzConfig.java)


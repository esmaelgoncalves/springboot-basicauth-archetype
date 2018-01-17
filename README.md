
# springboot-basicauth-archetype

Archetype Project to generate Spring Boot API with Basic Authentication using Spring-Security.

## Getting Started


Archetype is like a template project. In this way, we can generate new projects based in a model pre defined in a archetype.
This archetype is a model to generate REST API based in Spring Boot with Basic Authentication.


### Prerequisites

```
N/A
```

### Installing


 - Download the project (you can fork, download, clone);
 - In the root directory execute the maven command: mvn clean install (Now the archetype is already installed in your maven local repository.);


### Using


 - To use the archetype, you can execute the following maven command: 
```
mvn archetype:generate -DarchetypeGroupId=br.com.esmaelgoncalves -DarchetypeArtifactId=springboot-basicauth-archetype -DarchetypeVersion=1.0.0-SNAPSHOT -DgroupId={your.group.id} -DartifactId=s{your-artifact-id}

```

### Samples


 - You can view a sample project generated using this archetype 
 [here](https://github.com/esmaelgoncalves/springboot-basicauth-archetype/tree/master/samples/sample-api-generated)


## Built With

* [Spring](http://spring.io/projects) - The Web Framework used
* [Maven](https://maven.apache.org/) - Dependency Management

## Acknowledgments

 - Maven
 - Spring

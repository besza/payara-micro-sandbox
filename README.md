# Payara Micro sandbox with JakartaEE and MicroProfile

### Install the archetype
```
mvn install
```

### Run the generate plugin
```
mvn archetype:generate                                \
  -DarchetypeGroupId=com.besza                        \
  -DarchetypeArtifactId=payara-micro-sandbox          \
  -DarchetypeVersion=1.0                              \
  -DgroupId=<my.groupid>                              \
  -DartifactId=<my-artifactId>
```

### Start the sample application
```
mvn package payara-micro:start
```

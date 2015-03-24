# PlayHymn3
## A (very) simple service to stream hymns played by me

### History
A really long story about how this project came about..


### Usage
Have not figured out how to run with one command. More details on that later.

To start server: 
build using maven, then

```
java -jar target/PlayHymn3-0.1.0.jar
```

To start client:

```
cd src/main/
mvn spring run app.groovy -- --server.port=8000
```

### Todo
- Right now client and server both run in their own Tomcat instance. Need to create a fat jar. Can I run these both from one Tomcat?
- Add fancy html (Bootstrap most likely candidate)
- fix popState in jQuery
- learn JPA or Hibernate or something else to tie hymn database
- add <audio> to html, query aforementioned db for hymn
- add unit tests!!!
- how to run this on heroku


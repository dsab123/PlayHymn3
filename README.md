# PlayHymn3
## A (very) simple service to stream hymns played by me

### Changelog
- 3/25/2015 Added simple bootstrap to index.html
- 3/25/2015 Added second http connector to Tomcat to serve the html, so no more running two Tomcat instances! ^__^

### History
A really long story about how this project came about..


### Usage
Have not figured out how to run with one command. More details on that later.

To start server: 
build using maven, then

```
java -jar target/PlayHymn3-0.1.0.jar
```

Navigate to http://localhost:9000

### Todo
- fix popState in jQuery
- learn JPA or Hibernate or something else to tie hymn database
- add <audio> to html, query aforementioned db for hymn
- add unit tests!!!
- handle null cases
- add links to previous week's hymns
- how to run this on heroku


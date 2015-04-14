# PlayHymn3
## A (very) simple service to stream hymns played by me

### Changelog
- 4/12/2015 finally got something through the pipeline!
- 3/25/2015 Added simple bootstrap to index.html
- 3/25/2015 Added second http connector to Tomcat to serve the html, so no more running two Tomcat instances! ^__^

### History
I attend Trinity Reformed Church of Gaithersburg, a new church plant in Maryland (www.trcofg.org).

Our church utilizes the rich tradition of worshipping the Lord with hymns, older-style songs with rich theology.

Many of us, however, were not exposed to these hymns earlier, and it has been a struggle for us to collectively join together in song every Sunday.

As the church pianist, I am responsible for learning the songs and leading the worship.

I decided that it would be beneficial for our church to have a resource with which they can acquaint themselves to the songs a few days before each service, for the purpose of familiarizing themselves with their words and tunes.

This project is the manifestation of that desire.

### Usage
build using maven, then

```
java -jar target/PlayHymn3-0.1.0.jar
```

Navigate to http://localhost:9000

### About
Disclaimer: I'm just getting my feet wet with Spring and jQuery, and this is my first web projects.

There's a Spring Boot example that shows how to build a RESTful resource (https://spring.io/guides/gs/actuator-service/) that is pretty straightforward. It accepts GET requests and returns a JSON object.

There's also another one that shows how to host static content (https://spring.io/blog/2013/12/19/serving-static-web-content-with-spring-boot).

I figured it would be easy to bind the two examples together, throw in an SQL database for the backend to serve responses from, deploy on heroku, and voila!

However, I've kind of hit a brick wall.

I'm not sure how to get heroku to allow me to use CORS. I am given a port to bind to from heroku's config vars, but I don't know how to reach the other end.

For the sake of finishing the project, I'll just bind the port to the backend, and navigating to <name>.herokuapp.com/index.html will expose the frontend.

Next try will involve a more mature framework like Ruby On Rails, possibly.


### Todo
- come up with better name
- add better description
- ~~deploy on heroku~~
- host files on s3
- fix popState in jQuery
- ~~learn JPA or Hibernate or something else to tie hymn database~~
- ~~query aforementioned db for hymn~~
- ~~add audio to db~~
- ~~switch db to postgres for easy use with heroku~~
- ~~add <audio> to html~~
- add unit tests!!!
- ~~reformat html for pagination, identified by week rather than hymn~~
- handle null cases
- ~~add links to previous week's hymns~~
- ~~how to run this on heroku~~


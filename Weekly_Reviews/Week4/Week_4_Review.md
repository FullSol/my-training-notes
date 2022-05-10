# Week 4 Review 

*Updated to W4, Day 3

>**Levi**: 
>- [ ] Day 1 Java 
>- [ ] Day 2 Java 
>- [ ] HTTP
>- [ ] Servlets

>**Calvin**: 
>- [ ] All of Web, Tooling, and App Design
>- [ ] Servlets
>- [ ] Controllers

## Java

### DIY Web Server (x) 

### Servlet API 
**Servlet**
- a Java programming language class that is used to extend the capabilities of servers that host applications accessed by means of a request-response programming model. 
    -  a class that handles requests, processes them and reply back with a response.
- Although servlets can respond to any type of request, they are commonly used to extend the applications hosted by web servers. 
    - For such applications, Java Servlet technology defines HTTP-specific servlet classes.

Source: [Servlet Definition](https://docs.oracle.com/javaee/5/tutorial/doc/bnafe.html)

**Servlet API**:
The _javax.servlet_ and _javax.servlet.http_ packages represent interfaces and classes for the Servlet API. They provide interfaces and classes for writing servlets. All servlets must implement the Servlet interface, which defines life-cycle methods. When implementing a generic service, you can use or extend the GenericServlet class provided with the Java Servlet API. The HttpServlet class provides methods, such as doGet and doPost, for handling HTTP-specific services.
- The _javax.servlet_ package contains many interfaces and classes that describe and define the contracts between a servlet class and the runtime environment provided for an instance of such a class by a conforming servlet container. These are not specific to any protocol.
- The _javax.servlet.http_ package contains interfaces and classes that are responsible for http requests only.

Source: [Servlet API](https://www.geeksforgeeks.org/servlet-api/)

### Servlet Inheritance Hierarchy 

### Servlet Container 
A Java application controlling servlets. When an applicaton running in a web server receives a request, the Server hands the request to the _Servlet Container_, which in turn passes it to the target Servlet. 

Source: [Intro to Java Servlets](https://www.baeldung.com/intro-to-servlets)

### Servlet Lifecycle
Lifecycle of a servlet = _init-service-destroy_
1. _init()_
    - designed to be called only once. If an instance of the servlet doesn't exist, the web container: 
        1. Loads the servlet class
        2. Creates an instance of the servlet class
        3. Initializes it by calling the _init_ method
    - must complete successfully before the servlet can receive any requests
    - The servlet container cannot place the servlet into service if the init method either throws a _ServletException_ or does not return within a time period defined by the Web server.
    - 
        ```
        public void init() throws ServletException {
        // Initialization code like set up database etc....
        }
        ```
2. _service()_
    - only called after the servlet's _init()_ method has completed successfully
    - The Container calls the _service()_ method to handle requests coming from the client, interprets the HTTP request type (GET, POST, PUT, DELETE, etc.) and calls _doGet, doPost, doPut, doDelete_, etc. methods as appropriate. 
    - 
        ```
        public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
            // ...
        }
        ```
3. _destroy()_
    - Called by the Servlet Container to take the Servlet out of service.
    - Method is only called once all threads within the servlet's service method have exited or after a timeout period has passed. After the container calls this method, it will not call the service method again on the Servlet.
    - 
        ```
        public void destroy() {
            //
        }
        ```

Source: [Intro to Java Servlets](https://www.baeldung.com/intro-to-servlets)

### Deployment Descriptor 
Describes how the web application should be deployed. 

If your web application is written using Java, the web application deployment descriptor is written using the EXtensible Markup Language (XML) syntax. 
- The web application deployment descriptor is named web.xml, and, when included with a web application, it must reside in a WEB-INF subdirectory at the web application root. 

Source: [Deployment Descriptors](https://docs.oracle.com/cd/E19226-01/820-7627/bncbj/index.html)

### Configuring the Servlet Container
With metadata annotations, the standard web.xml deployment decriptor is now optional.

Annotations can be defined on certain web components, such as servlets, filters, listeners, and tag handlers. 
- The annotations are used to declare dependencies on external resources. 
- _The container will detect annotations on such components and inject necessary dependencies before the component’s life-cycle methods are invoked_

Source: [Creating and Configuring Servlets](https://docs.oracle.com/cd/E13222_01/wls/docs103/webapp/configureservlet.html)

### Servlet Annotations 
Java Servlets provides several annotations to allow users to declare servlets, filters, listeners in the _javax.servlet.annotation_ package. It also provides annotations to specify metadata for the components that are declared.
- The annotations can replace equivalent XML configuration in the web deployment descriptor file (web.xml) such as servlet declaration and servlet mapping. 
- Servlet containers will process the annotated classes at deployment time.

Ex: 
- @WebServlet: used for declaring a servlet class and configuring mapping for it.

Source: [Java Servlet Annotation](https://www.codejava.net/java-ee/servlet/quick-start-guide-for-java-servlet-annotations)

### ServletConfig vs ServletContext 

Source: [Java Servlet ServletConfig v ServletContext - Geeks for Geeks](https://www.geeksforgeeks.org/difference-between-servletconfig-and-servletcontext-in-java-servlet/)

### ServletContextListener  </Levi> 
Interface for receiving notification events about ServletContext lifecycle changes.

In order to receive these notification events, the implementation class must be either declared in the deployment descriptor of the web application, annotated with WebListener, or registered via one of the addListener methods defined on ServletContext.

Source: [Interface ServletContextListener](https://docs.oracle.com/javaee/6/api/javax/servlet/ServletContextListener.html)

### HttpServlet Methods 

### Accessing the request body with a servlet 

### Accessing request parameters from a servlet 

### Accessing request headers from a servlet 

### Exposing data from an HttpServlet 

### Using the RequestDispatcher 

### Redirecting Requests 

### Forward Requests 

### Writing to a response body in a servlet

### Adding headers to a response in a servlet 

### Handling exceptions within a servlet 

### Front Controller Design Pattern 
The front controller consolidates all request handling by channeling requests through a single handler object. 
- _Front Controller_ = "a controller that handles all requests for a Web site" 
    - it stands in front of a web-application, delegating requests to susequent resources and providing an interface to common behavior such as security, internalization, and prsenting particular views to certain users. 
    - This enables an application to change its behavior at runtime. 
- divided into 2 parts:

    - ![Front Controller Pattern parts](https://www.baeldung.com/wp-content/uploads/2016/09/front-controller.png)
    1. **A single dispatching controller** -  dispatches requests to commands in order to trigger behavior associated with a request.
    2. hierarchy of commands 

Source: [A Guide to the Front Controller Pattern  in  Java](https://www.baeldung.com/java-front-controller-pattern)

### Session management with servlet 

### HttpSession class 

----------------------------------------------------------------
## Web

### Internet Fundamentals <Calvin>

### URL vs URI vs URN

### Client-Server Communication (x)

### Statelessness (x)


### HTTP Basics (x)

### HTTP Verbs/Methods (x)

### HTTP Request and Response Structures (x)

### HTTP Status Code Levels (x)

### Common HTTP Status Codes (x)

### Web Servers vs Web Clients (x)  </Calvin>

### Data Interfchange Format Options 

### JSON v. XML 

### JSON Web Tokens 

----------------------------------------------------------------
## Tooling 

### Web Server Options  <Calvin>

### Apache Tomcat  (x) </Calvin> 

----------------------------------------------------------------
## Cloud Computing 

### AWS Elastic Compute Cloud 

### Connecting to an EC2 instance


### Manually deploying an application an EC2

### AWS EC2 Autoscaling 

### Horizontal v. Veritcal Scaling 

### AWS Elastic Beanstalk 

### Manually deploying an application to Elastic Beanstalk 

### AWS Simple Storage Service 

----------------------------------------------------------------
## DevOps 


----------------------------------------------------------------
## Unix/Linux 

### SSH


--------------------------------
## DS&A: 


--------------------------------
## Docker 

--------------------------------
## App Design 

### Stateful and Stateless Session Management Considerations



--------------------------------
## AWS 

### (Optional) Static Web Hosting with S3

-------------------------------- 
## SDLC 









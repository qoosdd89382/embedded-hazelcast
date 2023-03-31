# Embedded Hazelcast in Spring Boot Application With Spring Session

This repository is based on Hazelcast's official guide, and I have made several improvements to better monitor session activities.

The application will be run as a Kubernetes Deployment, and you can try scaling it out.

## What concepts do I want to demonstrate?

- Successfully run a Spring Boot application with Spring Session Core and Hazelcast dependencies.
- Demonstrate that Spring Session can effectively manage and control sessions.
- Demonstrate that session can be transferred/saved to embedded Hazelcast members through Spring Session in a Spring Boot application.
- Show that Hazelcast members embedded in multiple running Spring Boot applications can be grouped as a Hazelcast cluster.
- Demonstrate that all members of a Hazelcast cluster can synchronize and share sessions they have saved.
- Demonstrate that regardless of the scale of the deployment, the application can still work properly, including the Hazelcast-Session mechanism.

## Before start

For testing, you will need to prepare the following tools:
- Java 8
- minikube: To serve as a Kubernetes context. Starting with 4GB of memory is recommended.
- kubectl
- Docker

## How to build

### English

#### Maven package

In the project directory, run the following script to package the Spring Boot application:

```
mvn package -f pom.xml
```

#### Docker env

Before you start building the image, make sure your Docker environment has been changed to Docker runtime environment of minikube.

This way, the API server in the cluster will not attempt to pull the image from Dockerhub. Instead, it will use the local image that we have built.

```
eval $(minikube docker-env)
```

Remember that when the terminal session is lost (window changes or be closed), the environment settings will be lost as well.

Therefore, you must run the `eval` script again when necessary.

#### Docker build

Let's run the script below to build our image:

```
docker build -t embedded-hazelcast .
```

#### Create Deployment

To run a single-pod deployment of this application, execute `/deploy/apply/apply-deploy.sh`.


#### Expose Application

To expose the Deployment we just created as a Kubernetes Service, execute `/expose/deploy-expose.sh`.

#### Forwarding port

To forward the port from the Service to localhost (your computer), execute `/expose/port-forward.sh`.

### How to test

Access `localhost:7777/list` with your browser.

### Chinese

https://cherrychaoyueh.vercel.app/
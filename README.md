# Embedded Hazelcast in Spring Boot Application With Spring Session (Deploy on Kubernetes)

This repository is based on Hazelcast's official guide, and I have made several improvements to better monitor session activities.

The application will be run as a Kubernetes Deployment, and you can try scaling it out.

## What Concepts do I Want to Demonstrate?

- Successfully run a Spring Boot application with Spring Session Core and Hazelcast dependencies.
- Demonstrate that Spring Session can effectively manage and control sessions.
- Demonstrate that session can be transferred/saved to embedded Hazelcast members through Spring Session in a Spring Boot application.
- Show that Hazelcast members embedded in multiple running Spring Boot applications can be grouped as a Hazelcast cluster.
- Demonstrate that all members of a Hazelcast cluster can synchronize and share sessions they have saved.
- Demonstrate that regardless of the scale of the deployment, the application can still work properly, including the Hazelcast-Session mechanism.

## Before Start

For testing, you will need to prepare the following tools:
- Java 8
- minikube: To serve as a Kubernetes context. Starting with 4GB of memory is recommended.
- kubectl: And you can set alias `alias k=kubectl` (Unix-like) or `Set-Alias -Name k -Value kubectl` (Windows). 
- Docker

## How to Build

### Application & Image

#### Project Packaging

In the project directory, run the following script to package the Spring Boot application:

```
mvn package -f pom.xml
```

#### Docker Environment Setting

Before you start building the image, make sure your Docker environment has been changed to Docker runtime environment of minikube.

This way, the API server in the cluster will not attempt to pull the image from Dockerhub. Instead, it will use the local image that we have built.

```
eval $(minikube docker-env)
```

Windows:

```
minikube docker-env | Invoke-Expression
```

Remember that when the terminal session is lost (window changes or be closed), the environment settings will be lost as well.

Therefore, you must run the `eval` script again when necessary.

#### Docker Image Building

Let's run the script below to build our image:

```
docker build -t embedded-hazelcast .
```

### Deploying on Kubernetes

#### Creating Deployment

To run a single-pod Deployment of this application, execute `/deploy/apply/apply-deploy.sh`.

#### Exposing Application

To expose the Deployment we just created to a Kubernetes Service, execute `/expose/deploy-expose.sh`.

#### Port Forwarding

To forward the port from the Service to localhost (your computer), execute `/expose/port-forward.sh`.

## How to test

### Listing Sessions
Access `localhost:7777/create` and `localhost:7777/list` with your browser.

### Notice

Don't forget to use this command for accessing Kubernetes API when you're trying to scale app out:

```
kubectl apply -f https://raw.githubusercontent.com/hazelcast/hazelcast/master/kubernetes-rbac.yaml
```

Otherwise, you will get message below: 
```
  2023-07-06 16:18:27.641  WARN 1 --- [           main] c.hazelcast.kubernetes.KubernetesClient  : Kubernetes API access is forbidden! Starting standalone. To use Hazelcast Kubernetes discovery, configure the required RBAC. For 'default' service account in 'default' namespace execute: `kubectl apply -f https://raw.githubusercontent.com/hazelcast/hazelcast/master/kubernetes-rbac.yaml`
```

## POC Waiting List
- Successfully save session without `principal` parameter. (In the official guidelines, sessions need to be saved with the `principal` parameter.)
- Different Spring Boot applications should not share their sessions because they are not the same service according to the definition of microservices. This means that the Hazelcast members embedded in those applications should not be able to group together as a cluster.

## Contact
https://cherrychaoyueh.vercel.app/

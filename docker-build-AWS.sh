#!/bin/sh

docker build --tag=microservice-kubernetes-persistence-apache apache
docker tag microservice-kubernetes-persistence-apache 291749393564.dkr.ecr.eu-central-1.amazonaws.com/microservices-persistencelayer:apache
docker push 291749393564.dkr.ecr.eu-central-1.amazonaws.com/microservices-persistencelayer:apache

docker build --tag=microservice-kubernetes-persistence-catalog microservice-kubernetes-demo-catalog
docker tag microservice-kubernetes-persistence-catalog 291749393564.dkr.ecr.eu-central-1.amazonaws.com/microservices-persistencelayer:catalog
docker push 291749393564.dkr.ecr.eu-central-1.amazonaws.com/microservices-persistencelayer:catalog

docker build --tag=microservice-kubernetes-demo-customer microservice-kubernetes-demo-customer
docker tag microservice-kubernetes-demo-customer 291749393564.dkr.ecr.eu-central-1.amazonaws.com/microservices-persistencelayer:customer
docker push 291749393564.dkr.ecr.eu-central-1.amazonaws.com/microservices-persistencelayer:customer

docker build --tag=microservice-kubernetes-demo-order microservice-kubernetes-demo-order
docker tag microservice-kubernetes-demo-order 291749393564.dkr.ecr.eu-central-1.amazonaws.com/microservices-persistencelayer:order
docker push 291749393564.dkr.ecr.eu-central-1.amazonaws.com/microservices-persistencelayer:order
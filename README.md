# kubernetes-persistencelayer
Added persistence layer to the [last microservices application](https://github.com/catedradxc/microservices-kubernetes-AWS-EKS)

To do that, the code is adapted make the connection to a DocumentDB cluster. To deploy it, you should change in file.properties the endpoint of the DocDB cluster in each service: customer, catalog and order. And follow the instructions in this [repository](https://github.com/catedradxc/microservices-kubernetes-AWS-EKS)


# The architecture
![image](https://user-images.githubusercontent.com/79599587/204036953-1f981c3d-19c8-4cae-9923-43434002601e.png)

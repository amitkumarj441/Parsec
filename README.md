# Parsec
Find project [Idea](https://github.com/amitkumarj441/IndiaHacks-2017-Fintech/blob/master/IDEA.md).

## Prerequisites 

Install 
   
   - [Scala](https://www.scala-lang.org/download/)
   - [Sbt](http://www.scala-sbt.org/release/docs/Installing-sbt-on-Linux.html)
   - [Docker](https://www.digitalocean.com/community/tutorials/how-to-install-and-use-docker-on-ubuntu-16-04) & [Docker-compose](https://www.digitalocean.com/.../how-to-install-docker-compose-on-ubuntu-16-04)
   - [Apache Kafka](https://www.digitalocean.com/community/tutorials/how-to-install-apache-kafka-on-ubuntu-14-04)
   
## Run

To run the ParsecSimulator that will generate Parsec Protocol messages on Kafka topics, run
       
    $ sbt simulator/run
    
Before running the above commands, open another terminal and follow the below setups (then run the above commands in new terminal) :

**Get the setup locally**

The schema-registry and schema-registry-ui as part of the fast-data-dev docker image for local development setup that has backends. Just run:

    docker run -d --name=fast-data-dev -p 8081:8081 landoop/fast-data-dev
    
It contains :

    - Confluent OSS with Apache Kafka including: ZooKeeper, Schema Registry, Kafka REST, Kafka-Connect
    - Landoop Fast Data Tools including: kafka-topics-ui, schema-registry-ui, kafka-connect-ui
    - 20+ Kafka Connectors to simplify ETL processes
    - Integration testing and examples embedded into the docker
    
Then run :
       
    docker run --rm --net=host landoop/fast-data-dev
    
That's it. Visit http://localhost:3030 to get into the fast-data-dev environment

<img src="https://storage.googleapis.com/wch/fast-data-dev-ports.png" alt="fast-data-dev web UI screenshot" type="image/png" width="320">

> Hit **control+c** to stop and remove everything


<img src="https://storage.googleapis.com/wch/fast-data-dev-ui.png" alt="fast-data-dev web UI screenshot" type="image/png" width="900">

## Kafka Cluster

You can see the **schemas** as they are registered in the [schema-registry-ui](http://100.117.99.143:3030/schema-registry-ui/#/).

You can view the **messages** as they are shown in the [kafka-topics-ui](http://100.117.99.143:3030/kafka-topics-ui/#/).

## Demo!

Visit http://100.117.99.143:3030/

## Contribute

# Contributing guidelines

## How to become a contributor and submit your own code

### Contributor License Agreements

We'd love to accept your patches! Before we can take them, we have to jump a couple of legal hurdles.

Please fill out either the individual or corporate Contributor License Agreement (CLA).

  * If you are an individual writing original source code and you're sure you own the intellectual property, then you'll need to sign an [individual CLA](http://code.google.com/legal/individual-cla-v1.0.html).
  * If you work for a company that wants to allow you to contribute your work, then you'll need to sign a [corporate CLA](http://code.google.com/legal/corporate-cla-v1.0.html).

Follow either of the two links above to access the appropriate CLA and instructions for how to sign and return it. Once we receive it, we'll be able to accept your pull requests.

***NOTE***: Only original source code from you and other people that have signed the CLA can be accepted into the main repository.

### Contribute here

Feel free to contribute it, take a look at current issues or start a new issue if you found something buggy or for feature request.

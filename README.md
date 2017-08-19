# IndiaHacks-2017-Fintech
Hacking on my Blokchain [Idea](https://github.com/amitkumarj441/IndiaHacks-2017-Fintech/blob/master/IDEA.md).

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

You can see the **schemas** as they are registered in the schema-registry-ui.

You can view the **messages** as they are shown in the kafka-topics-ui

